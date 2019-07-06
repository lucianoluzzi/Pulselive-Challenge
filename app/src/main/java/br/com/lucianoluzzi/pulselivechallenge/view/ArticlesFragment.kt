package br.com.lucianoluzzi.pulselivechallenge.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.databinding.FragmentArticlesBinding
import br.com.lucianoluzzi.pulselivechallenge.view_model.ArticleSummaryViewModel
import kotlinx.coroutines.launch

class ArticlesFragment : Fragment() {
    private val viewModel: ArticleSummaryViewModel by lazy {
        (activity as MainActivity).articleSummaryViewModel
    }

    private lateinit var binding: FragmentArticlesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getArticles()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_articles,
            container,
            false
        )
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        return binding.root
    }

    private fun getArticles() {
        viewModel.viewModelScope.launch {
            viewModel.getArticlesSummary()
        }
    }
}