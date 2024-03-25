package com.lazydev01.graphql.demo;

import com.lazydev01.graphql.demo.models.Book;
import com.lazydev01.graphql.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("The Merchant of Venice");
		b1.setAuthor("William Shakespeare");
		b1.setDesc("A story revolving around royalty, love and betrayal");
		b1.setPrice(200);
		b1.setPages(300);

		Book b2 = new Book();
		b2.setPages(286);
		b2.setTitle("Shrimad Bhagavad Gita");
		b2.setDesc("A Book on how one should live a Life");
		b2.setPrice(Integer.MAX_VALUE);
		b2.setAuthor("Rushi Ved Vyas");

		Book b3 = new Book();
		b3.setPages(348);
		b3.setTitle("Jeevan ko Paltane Waali Ek adbhut kahani");
		b3.setDesc("A Book on the life of Brahma(Dada Lekhraj)");
		b3.setPrice(Integer.MAX_VALUE);
		b3.setAuthor("Brahmakumaris");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
