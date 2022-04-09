package com.lernspringscore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private String nameString;
private List<String> phoneStrings;
private Set<String>addressSet;
private Map<String, String> cousesMap;
public String getNameString() {
	return nameString;
}
public void setNameString(String nameString) {
	this.nameString = nameString;
}
public List<String> getPhoneStrings() {
	return phoneStrings;
}
public void setPhoneStrings(List<String> phoneStrings) {
	this.phoneStrings = phoneStrings;
}
public Set<String> getAddressSet() {
	return addressSet;
}
public void setAddressSet(Set<String> addressSet) {
	this.addressSet = addressSet;
}
public Map<String, String> getCousesMap() {
	return cousesMap;
}
public void setCousesMap(Map<String, String> cousesMap) {
	this.cousesMap = cousesMap;
}
public Emp(String nameString, List<String> phoneStrings, Set<String> addressSet, Map<String, String> cousesMap) {
	super();
	this.nameString = nameString;
	this.phoneStrings = phoneStrings;
	this.addressSet = addressSet;
	this.cousesMap = cousesMap;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

}
