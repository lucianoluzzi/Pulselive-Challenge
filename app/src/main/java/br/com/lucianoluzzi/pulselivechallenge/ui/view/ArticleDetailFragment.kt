package br.com.lucianoluzzi.pulselivechallenge.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.navArgs
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.databinding.FragmentArticleDetailBinding
import br.com.lucianoluzzi.pulselivechallenge.ui.viewModel.ArticleViewModel
import kotlinx.coroutines.launch

class ArticleDetailFragment : BaseFragment<FragmentArticleDetailBinding>() {
    private val args: ArticleDetailFragmentArgs by navArgs()
    private val viewModel: ArticleViewModel by lazy {
        (activity as MainActivity).articleViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getArticle()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        createViewBinding(container, R.layout.fragment_article_detail)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    private fun getArticle() {
        viewModel.viewModelScope.launch {
            viewModel.getArticle(args.articleId)
        }
    }
}