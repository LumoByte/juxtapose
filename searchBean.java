
package com.smashThemSoftly.sandbox;

import java.io.Serializable;

import android.R.string;


public class searchBean implements Serializable {
	private string bookCode;
	private int classNum;
	private string bookTitle;
	private int isbn;
	
	
	//constructor 
	public searchBean() {
	}
	
	
	//getters and setters
	public string getBookCode() {
		return bookCode;
	}

	public void setBookCode(string bookCode) {
		this.bookCode = bookCode;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public string getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(string bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	
}
