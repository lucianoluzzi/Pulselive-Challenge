package br.com.lucianoluzzi.pulselivechallenge.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.navArgs
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.databinding.FragmentArticleDetailBinding
import br.com.lucianoluzzi.pulselivechallenge.view_model.ArticleViewModel
import kotlinx.coroutines.launch

class ArticleDetailFragment : Fragment() {
    private val args: ArticleDetailFragmentArgs by navArgs()
    private val viewModel: ArticleViewModel by lazy {
        (activity as MainActivity).articleViewModel
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = getBinding(inflater, container)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        getArticle()
        return binding.root
    }

    private fun getBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentArticleDetailBinding {
        return DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_article_detail,
            container,
            false
        )
    }

    private fun getArticle() {
        viewModel.viewModelScope.launch {
            viewModel.getArticle(args.articleSummary.id)
        }
    }
}