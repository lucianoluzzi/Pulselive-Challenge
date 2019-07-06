package br.com.lucianoluzzi.pulselivechallenge.repository

import br.com.lucianoluzzi.pulselivechallenge.model.Article
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary
import br.com.lucianoluzzi.pulselivechallenge.network.ArticleService
import javax.inject.Inject

class ArticleRepositoryImpl @Inject constructor(
    private val service: ArticleService
) : ArticleRepository {
    
    override fun fetchArticlesSummary(): List<ArticleSummary> {
        val response = service.fetchArticlesSummary().execute()

        return response.body()?.items
            ?: run {
                listOf<ArticleSummary>()
            }
    }

    override fun fetchArticle(id: Int): Article {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}