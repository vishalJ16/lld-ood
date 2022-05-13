/**
 * 
 */
package com.bookreader.model;

/**
 * @author VJ
 *
 */
public class Book {

	String name;
	String desc;
	String authorName;

	public Book(String name) {
		this.name = name;
	}

	public void startReading(User user) throws IllegalAccessException {
		if (user.currentRead.equals(this)) {
			throw new IllegalAccessException();
		}
	}
}
