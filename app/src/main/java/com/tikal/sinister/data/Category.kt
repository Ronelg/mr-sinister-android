package com.tikal.sinister.data

/**
 * Created by ronelg on 20/02/2018.
 */
data class Category(val id: String?, val name: String, val solved: Boolean, val quiz: List<Quiz>, val scores: List<Int>, val theme: String)