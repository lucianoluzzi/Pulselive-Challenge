package br.com.lucianoluzzi.pulselivechallenge.repository

import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary

interface ArticleSummaryRepository {
    fun fetchArticles(): List<ArticleSummary>
}