/**
 * 
 */
package com.bookreader.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VJ
 * 12 May 2022 00:11:08
 */
public class Library {
	
	List<Book> books;
	
	public Library() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}

}
