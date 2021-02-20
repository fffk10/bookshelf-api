package com.bookshelf.book.entity

import javax.persistence.*

@Entity
@Table(name = "book")
data class Book (
    @Id
    @GeneratedValue
    val id: Long? = null,

    @Column(name = "title", length = 100, nullable = false)
    val title: string,

    @Column(name = "point")
    val point: Long? = null

)