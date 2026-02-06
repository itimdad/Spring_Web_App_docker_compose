package com.imdad.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.imdad.entity.Book;
import com.imdad.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
//	@GetMapping("/book")
//	public ModelAndView getAllBooks(@RequestParam("id") Integer id) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		Optional<Book> byId = bookRepository.findById(id);
//		
//		if(byId.isPresent()) {
//			Book book = byId.get();
//			mav.addObject("bookObj", book);
//		}
//		
//		mav.setViewName("index");
//		return mav;
//	}
//	
	
	@GetMapping("/book")
	public String getBooks(@RequestParam("id") Integer id, Model model) {
		
		Optional<Book> byId = bookRepository.findById(id);
		
		if(byId.isPresent()) {
			Book book = byId.get();
			
			model.addAttribute("bookObj", book);
		}
		
		return "index";
		
	}
}
