/**
 * 
 */
package com.bookreader;

import com.bookreader.model.Book;
import com.bookreader.model.Library;
import com.bookreader.model.User;
import com.bookreader.service.MembershipService;
import com.bookreader.service.Search;
import com.bookreader.service.SearchImpl;
import com.bookreader.service.UserService;
import com.bookreader.service.UserServiceImpl;

/**
 * @author VJ
 *
 */
public class OnlineReaderSystem {

	User activeUser;
	Book activeBook;
	Library library;
	Search searchService;
	MembershipService membershipService;
	UserService userService;

	public OnlineReaderSystem() {
		this.userService = new UserServiceImpl();
		this.searchService = new SearchImpl();
	}
	
	
	public OnlineReaderSystem(UserService userService, Search search) {
		this.userService = userService;
		this.searchService = search;

	}

	public User getActiveUser() {
		return activeUser;
	}

	public void setActiveUser(User activeUser) {
		this.activeUser = activeUser;
	}

	public Book getActiveBook() {
		return activeBook;
	}

	public void setActiveBook(Book activeBook) {
		this.activeBook = activeBook;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Search getSearchService() {
		return searchService;
	}

	public UserService getUserService() {
		return userService;
	}
}
