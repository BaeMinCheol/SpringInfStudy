<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"14922",secure:"14931"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/lec17/src/main/webapp/WEB-INF/views/memJoinOk.jsp">
	<h1 data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/lec17/src/main/webapp/WEB-INF/views/memJoinOk.jsp"> memJoinOk </h1>
	ID : ${mem.memId}<br />
	PW : ${mem.memPw}<br />
	Mail : ${mem.memMail} <br />
	Phone : ${mem.memPhone1}-${mem.memPhone2}-${mem.memPhone3} <br />
	
	<a href="/lec17/resources/html/memJoin.html"> Go MemberJoin </a>
</body>
</html>
