package testPjt04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TranspotationWalk transpotationWalk = new TranspotationWalk();
//		transpotationWalk.move();
		
		//컨테이너 생성후
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		ctx.close(); //사용후 닫아줘야한다.
		
		
	}
}
