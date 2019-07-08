package br.com.lucianoluzzi.pulselivechallenge.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.lucianoluzzi.pulselivechallenge.model.Article
import br.com.lucianoluzzi.pulselivechallenge.model.ViewRequestState
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ArticleViewModel @Inject constructor(
    private val repository: ArticleRepository
) : BaseViewModel() {
    private val mArticle = MutableLiveData<Article>()
    val article: LiveData<Article> by lazy {
        mArticle
    }

    suspend fun getArticle(id: Int) = withContext(Dispatchers.IO) {
        val fetchedArticle = repository.fetchArticle(id)
        fetchedArticle?.let {
            mArticle.postValue(fetchedArticle)
            viewState.postValue(ViewRequestState.SUCCESS)
        } ?: run {
            viewState.postValue(ViewRequestState.ERROR)
        }
    }
}