package com.springbook.ioc.injection;

import java.util.Properties;

public class CollectionBean {
	private Properties mappings;

	public void setAddressList(Properties mappings) {
		this.mappings = mappings;
	}

	public Properties getAddressList() {
		return mappings;
	}
}

//package com.springbook.ioc.injection;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Properties;
//
//public class CollectionBean {
//	private Properties addressList;
//	
//	public void setAddressList(Properties addressList) {
//		this.addressList = addressList;
//	}
//
//	public List<String> getAddressList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
/*
public Set<String> getAddressList() {
	return addressList;
*/
//import java.util.Set;
//import java.util.List;
//private Set<String> addressList;
/*
private List<String> addressList;

public void setAddressList(List<String> addressList) {
	this.addressList = addressList;
}
public List<String> getAddressList() {
	return addressList;
}
*/