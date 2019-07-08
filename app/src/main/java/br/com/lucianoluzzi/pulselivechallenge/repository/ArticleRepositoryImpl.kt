package br.com.lucianoluzzi.pulselivechallenge.repository

import br.com.lucianoluzzi.pulselivechallenge.model.Article
import br.com.lucianoluzzi.pulselivechallenge.network.ArticleService
import javax.inject.Inject

class ArticleRepositoryImpl @Inject constructor(
    private val service: ArticleService
) : ArticleRepository {

    override fun fetchArticlesSummary(): List<Article>? {
        val response = service.fetchArticlesSummary().execute()
        return response.body()?.items
    }

    override fun fetchArticle(id: Int): Article? {
        val response = service.fetchArticle(id.toString()).execute()
        return response.body()?.item
    }
}