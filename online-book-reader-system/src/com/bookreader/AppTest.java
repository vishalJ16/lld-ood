/**
 * 
 */
package com.bookreader;

import com.bookreader.model.Book;
import com.bookreader.model.Library;
import com.bookreader.model.User;
import com.bookreader.service.MembershipService;
import com.bookreader.service.SearchImpl;
import com.bookreader.service.UserServiceImpl;

/**
 * @author VJ
 * 12 May 2022 00:18:55
 */
public class AppTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OnlineReaderSystem system = new OnlineReaderSystem(new UserServiceImpl(), new SearchImpl());
		
		system.setLibrary(new Library());
		
		Book book1 = new Book("lld");
		Book book2 = new Book("ood");
		
		system.getLibrary().addBook(book1);
		system.getLibrary().addBook(book2);
		
		User user1 = new User("1", "A");
		User user2 = new User("2", "B");
		
		system.getUserService().addUser(user1);
		system.getUserService().addUser(user2);
		
		system.setActiveUser(user1);
		system.setActiveBook(book2);
	}

}
