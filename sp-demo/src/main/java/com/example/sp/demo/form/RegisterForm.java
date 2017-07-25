package com.example.sp.demo.form;

import java.io.Serializable;

import com.example.sp.demo.entity.AcStudent;
import com.example.sp.demo.entity.AcUser;
import com.example.sp.demo.entity.RftMajor;
import com.example.sp.demo.entity.RftSchool;

public class RegisterForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// for insert/search/update/delete
	private AcUser acUser;
	private AcStudent acStudent;

	// for search
	private RftSchool rftSchool;
	private RftMajor rftMajor;

	public AcUser getAcUser() {
		return acUser;
	}

	public void setAcUser(AcUser acUser) {
		this.acUser = acUser;
	}

	public AcStudent getAcStudent() {
		return acStudent;
	}

	public void setAcStudent(AcStudent acStudent) {
		this.acStudent = acStudent;
	}

	public RftSchool getRftSchool() {
		return rftSchool;
	}

	public void setRftSchool(RftSchool rftSchool) {
		this.rftSchool = rftSchool;
	}

	public RftMajor getRftMajor() {
		return rftMajor;
	}

	public void setRftMajor(RftMajor rftMajor) {
		this.rftMajor = rftMajor;
	}

}
