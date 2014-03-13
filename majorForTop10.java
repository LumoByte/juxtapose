package com.smashThemSoftly.sandbox;

import java.io.Serializable;

import android.R.string;

public class majorForTop10 implements Serializable {
	
	private String majorCode;
	
	//constructor
	public majorForTop10() {
	
	}
	
	
	public majorForTop10(String majorCode) {
		this.majorCode = majorCode;
	}
	
	//getter and setter
	public String getMajorCode() {
		return majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
}
