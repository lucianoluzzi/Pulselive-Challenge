package br.com.lucianoluzzi.pulselivechallenge.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lucianoluzzi.pulselivechallenge.model.Article
import br.com.lucianoluzzi.pulselivechallenge.model.ViewRequestState
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ArticleViewModel @Inject constructor(
    private val repository: ArticleRepository
) : ViewModel() {
    private val mArticle = MutableLiveData<Article>()
    val article: LiveData<Article> by lazy {
        mArticle
    }

    val viewState = MutableLiveData<ViewRequestState>().apply {
        value = ViewRequestState.LOADING
    }

    suspend fun getArticle(id: Int) = withContext(Dispatchers.IO) {
        val fetchedArticle = repository.fetchArticle(id)
        mArticle.postValue(fetchedArticle)
        viewState.postValue(ViewRequestState.SUCCESS)
    }
}