package com.word.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	@Autowired
	@Qualifier("usedDao")
	private WordDao wordDao;
	
	//@Resource //의존성 자동주입(객체의 데이터 이름으로 찾는다) //생성자에는 쓰지 못하고 프로퍼티에 쓸 수있다. *****
	public WordRegisterService(){}	//defult생성자(프로퍼티나 메소드에 @Autowired를 할경우 필요) 
	
	//@Autowired //의존성 자동주입(객체의 데이터 타입으로 찾는다) *****
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if(verify(wordKey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("이미 등록되었습니다.");
		}
	}
	
	public boolean verify(String wordKey){ //DB에 중복된 키워드가 있는지 검증한다.
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
}