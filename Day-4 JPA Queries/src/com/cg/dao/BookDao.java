package com.cg.dao;

import com.cg.entities.Book;
import java.util.List;


public interface BookDao
{
	public abstract Book getBookById(Integer id);
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookCount();
	public abstract List<Book> getBookByAuthor(String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getBooksRange(Double low,Double high);
	
	
	

}
