package br.com.lucianoluzzi.pulselivechallenge.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary
import br.com.lucianoluzzi.pulselivechallenge.model.ViewRequestState
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ArticleSummaryViewModel @Inject constructor(
    private val repository: ArticleRepository
) : ViewModel() {

    private val mArticlesSummary = MutableLiveData<List<ArticleSummary>>().apply {
        listOf<ArticleSummary>()
    }
    val articlesSummary: LiveData<List<ArticleSummary>> by lazy {
        mArticlesSummary
    }
    var viewState = MutableLiveData<ViewRequestState>().apply {
        value = ViewRequestState.LOADING
    }

    suspend fun getArticlesSummary() = withContext(Dispatchers.IO) {
        val articlesSummaryResponse = repository.fetchArticlesSummary()
        articlesSummaryResponse?.let {
            mArticlesSummary.postValue(it)
            viewState.postValue(ViewRequestState.SUCCESS)
        } ?: run {
            viewState.postValue(ViewRequestState.ERROR)
        }
    }
}