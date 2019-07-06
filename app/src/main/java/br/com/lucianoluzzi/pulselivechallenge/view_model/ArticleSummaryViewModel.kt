package br.com.lucianoluzzi.pulselivechallenge.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ArticleSummaryViewModel @Inject constructor(
    private val repository: ArticleRepository
) : ViewModel() {

    private val articleSummary = MutableLiveData<List<ArticleSummary>>().apply {
        listOf<ArticleSummary>()
    }

    suspend fun getArticlesSummary() = withContext(Dispatchers.IO) {
        val articlesSummaryResponse = repository.fetchArticlesSummary()
        articleSummary.postValue(articlesSummaryResponse)
    }
}