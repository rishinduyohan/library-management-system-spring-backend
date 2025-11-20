package edu.icet.ecom.controller;

import edu.icet.ecom.model.entity.BookEntity;
import edu.icet.ecom.service.BookService;
import edu.icet.ecom.service.impl.BookServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api/library/books")
public class BookController {
    BookService bookService = new BookServiceImpl();

    @GetMapping
    public BookEntity getBook(){
        return new BookEntity("B001","N2598SL","Martin","1999/02/25",5200.00);
    }

    @PostMapping("/add")
    public ResponseEntity<String> putBook(@RequestBody BookEntity book){
        if (bookService.addBook(book)){
            ResponseEntity.ok("Book added!");
        }
        return ResponseEntity.badRequest().body("Book NOT added!");
    }
}
