package com.bookshelf.book.controller

import com.bookshelf.book.entity.book
import com.bookshelf.book.service.bookService
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/api/v1/book")
class BookController (private val bookService: BookService){

    @GetMapping("")
    fun findAll(): List<Book> {
        return bookService.findAll()
    }

    @PostMapping("")
    fun create(@RequestBody book: Book): Book {
        bookService.save(book)
        return book
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): Optional<Book> {
        return bookService.findById(id)
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody book: Book): Book {
        bookService.save(book.copy(id = id))
        return book.copy(id = id)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): String {
        bookService.delete(id)
        return "Delete Complete"
    }
}