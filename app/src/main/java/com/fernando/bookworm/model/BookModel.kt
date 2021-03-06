package com.fernando.bookworm.model

import java.io.Serializable

data class BookModel(val title: String) : Serializable {
    var author: String = ""
    var averageRating: Double = 0.0
    var ratingCount: Int = 0
    var imageURL: String = ""
    var ISBN: MutableList<ISBNModel> = arrayListOf()
    var publisher: String = ""
    var bookLink: String = ""
    var published: String = ""
    var pageNumber: Int = 0
    var description: String = ""
}