package edu.ksr.springboottraining;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="emp")
public class Employee {
	
	int id;
	String name;
	String orgName;
	Address address;
	
	public Employee(){
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	

}
