package com.cg.service;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.entities.Book;

import java.util.List;

public class BookServiceImpl implements BookService
{
	private BookDao dao;
	

	public BookServiceImpl() {
		super();
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookById(Integer id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		return dao.getBookByAuthor(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	
	@Override
	public List<Book> getBooksRange(Double low, Double high) {
		return dao.getBooksRange(low, high);
	}

}	