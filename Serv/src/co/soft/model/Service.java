package co.soft.model;

import javax.servlet.http.HttpServletRequest;

//add라는 함수를 설정해
//data1, data2를 String 값으로 받은 후 
//정수로 변환하여
//두 정수(data1, data2)를 더한다.
public class Service {	
	public static int add(HttpServletRequest request) {
		String str1 = request.getParameter("data1");
		String str2 = request.getParameter("data2");
		
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		
		return n1 + n2;
	}
}