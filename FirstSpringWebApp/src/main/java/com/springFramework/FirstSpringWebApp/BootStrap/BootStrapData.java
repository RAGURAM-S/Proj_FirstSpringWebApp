package com.springFramework.FirstSpringWebApp.BootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springFramework.FirstSpringWebApp.domain.Author;
import com.springFramework.FirstSpringWebApp.domain.Book;
import com.springFramework.FirstSpringWebApp.domain.Publisher;
import com.springFramework.FirstSpringWebApp.repositories.AuthorRepository;
import com.springFramework.FirstSpringWebApp.repositories.BookRepository;
import com.springFramework.FirstSpringWebApp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author murakami = new Author("Haruki", "Murakami");
		Book nw = new Book("Norwegian Wood", "123456");
		Publisher kod = new Publisher("Kodansha", "Tokyo, Japan");
		
		murakami.getBook().add(nw);
		nw.getAuthor().add(murakami);
		kod.getBooks().add(nw);
		
		authorRepository.save(murakami);
		bookRepository.save(nw);
		publisherRepository.save(kod);
		
		Author hosseini = new Author("Khaled", "Hosseini"); 
		Book kite = new Book("Kite Runner", "654321");
		Publisher rb = new Publisher("Riverhead Books", "NewYork, USA");
		
		hosseini.getBook().add(kite);
		kite.getAuthor().add(hosseini);
		rb.getBooks().add(kite);
		
		authorRepository.save(hosseini);
		bookRepository.save(kite);
		publisherRepository.save(rb);
		
		System.out.println("Started BootStrap");
		System.out.println("Number of Authors " + authorRepository.count());
		System.out.println("Number of Books " + bookRepository.count());
		System.out.println("Number of Publishsers " + publisherRepository.count());
		System.out.println("Number of books for Kodansha " + kod.getBooks().size());
		System.out.println("Number of books for Riverhead Books " + rb.getBooks().size());
	}
	
}
