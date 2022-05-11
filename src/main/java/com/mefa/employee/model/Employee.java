package com.mefa.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String empName;
	private String password;
	private String gender;
	private Date birthday;
	private int depId;
	private int impRoleId;
	private int rank;
	private String tel;
	private String email;
	private String info;

	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public String getPassword() {
		return password;
	}

	public String getGender() {
		return gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public int getDepId() {
		return depId;
	}

	public int getImpRoleId() {
		return impRoleId;
	}

	public int getRank() {
		return rank;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getInfo() {
		return info;
	}
}
