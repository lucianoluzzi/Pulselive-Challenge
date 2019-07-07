package br.com.lucianoluzzi.pulselivechallenge.repository

import br.com.lucianoluzzi.pulselivechallenge.model.Article
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary

interface ArticleRepository {
    fun fetchArticlesSummary(): List<ArticleSummary>
    fun fetchArticle(id: Int): Article?
}