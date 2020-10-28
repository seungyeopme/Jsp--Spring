package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		Properties addressList = bean.getAddressList();
		
		for( String key : addressList.stringPropertyNames() ){
			System.out.println(String.format("Å° : %s, °ª : %s", key, addressList.get(key)) );
		}
		
		factory.close();
	}
}

//package com.springbook.ioc.injection;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import com.springbook.ioc.injection.CollectionBean;
//
//import polymorphism.TV;
//
//public class CollectionBeanClient {
//	public static void main(String[] args) {
//		
//		//1. Spring 컨테이너를 구동한다.
//		AbstractApplicationContext factory =
//				new GenericXmlApplicationContext("applicationContext.xml");
//		
//		//2. Spring 컨테이너로부터 필요한 객체를 요청한다.
//		TV tv = (TV)factory.getBean("tv");
//		
//		factory.close();
//	}
//}
/*
CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
List<String> addressList = (List<String>) bean.getAddressList();
for (String address : addressList) {
	System.out.println(address.toString());
}
*/