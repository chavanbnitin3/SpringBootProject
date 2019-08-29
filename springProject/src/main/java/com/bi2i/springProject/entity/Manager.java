package com.bi2i.springProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {

	@Id
	@GeneratedValue
	int mgr_id;
	String mgr_name;
	String mgr_gender;
	double mgr_salary;
	
	public int getMgr_id() {
		return mgr_id;
	}
	public void setMgr_id(int mgr_id) {
		this.mgr_id = mgr_id;
	}
	public String getMgr_name() {
		return mgr_name;
	}
	public void setMgr_name(String mgr_name) {
		this.mgr_name = mgr_name;
	}
	public String getMgr_gender() {
		return mgr_gender;
	}
	public void setMgr_gender(String mgr_gender) {
		this.mgr_gender = mgr_gender;
	}
	public double getMgr_salary() {
		return mgr_salary;
	}
	public void setMgr_salary(double mgr_salary) {
		this.mgr_salary = mgr_salary;
	}
	
	
}
