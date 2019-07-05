package br.com.lucianoluzzi.pulselivechallenge.repository

import br.com.lucianoluzzi.pulselivechallenge.model.Article

interface ArticleRepository {
    fun fetchArticle(id: Int): Article
}