package com.smashThemSoftly.sandbox;

import com.google.gson.Gson;

public class jsonTest {

	public static void main(String[] args) {
		majorForTop10 cit = new majorForTop10("cit");
		
		String major = new Gson().toJson(cit);	
		System.out.println(major);
		}
	

}
