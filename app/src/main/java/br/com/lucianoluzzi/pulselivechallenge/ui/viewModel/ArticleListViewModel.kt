package br.com.lucianoluzzi.pulselivechallenge.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.lucianoluzzi.pulselivechallenge.model.entity.Article
import br.com.lucianoluzzi.pulselivechallenge.model.entity.ArticleSummary
import br.com.lucianoluzzi.pulselivechallenge.model.entity.ViewRequestState
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ArticleListViewModel @Inject constructor(
    private val repository: ArticleRepository
) : BaseViewModel() {

    private val mArticleList = MutableLiveData<List<Article>>().apply {
        listOf<ArticleSummary>()
    }
    val articleList: LiveData<List<Article>> by lazy {
        mArticleList
    }

    suspend fun getArticlesSummary() = withContext(Dispatchers.IO) {
        val articlesSummaryResponse = repository.fetchArticlesSummary()
        articlesSummaryResponse?.let {
            mArticleList.postValue(it)
            viewState.postValue(ViewRequestState.SUCCESS)
        } ?: run {
            viewState.postValue(ViewRequestState.ERROR)
        }
    }
}