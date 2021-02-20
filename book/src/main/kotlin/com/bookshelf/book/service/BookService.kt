package com.bookshelf.book.service

import com.example.bookshelf.book.entity.book
import com.example.bookshelf.book.repotisory.book
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {

    fun findAll(): List<Book> = bookRepository.findAll()

    fun findById(id: Long) = bookRepository.findById(id)

    fun save(book: Book) = bookRepository.save(book)

    fun delete(id: Long) = bookrRepository.deleteById(id)
}