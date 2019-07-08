package br.com.lucianoluzzi.pulselivechallenge.repository

import br.com.lucianoluzzi.pulselivechallenge.model.entity.Article

interface ArticleRepository {
    fun fetchArticlesSummary(): List<Article>?
    fun fetchArticle(id: Int): Article?
}