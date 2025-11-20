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

    @GetMapping("{id}")
    public Object getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> putBook(@RequestBody BookEntity book) {
        if (bookService.addBook(book)) {
            return ResponseEntity.ok("Book added!");
        }
        return ResponseEntity.badRequest().body("Book NOT added!");
    }

    @GetMapping("/all")
    public Object getAllBooks() {
        return bookService.getAll();
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateBook(@RequestBody BookEntity book){
        if (bookService.updateBook(book)) {
            return ResponseEntity.ok("Book updated!");
        }
        return ResponseEntity.badRequest().body("Book NOT updated!");
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable String id){
        if (bookService.deleteBook(id)) {
            return ResponseEntity.ok("Book deleted!");
        }
        return ResponseEntity.badRequest().body("Book NOT deleted!");
    }
}
