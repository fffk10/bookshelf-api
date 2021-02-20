package com.bookshelf.book.repository

import com.example.kotlin_restapi.entity.book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, Long> {
}