/**
 * 
 */
package com.bookreader.service;

import java.util.List;

import com.bookreader.model.Book;

/**
 * @author v0j008y
 *
 */
public interface Search {

	Book searchByBook(String bookName);
	List<Book> searchByAuthor(String authorName);
}
