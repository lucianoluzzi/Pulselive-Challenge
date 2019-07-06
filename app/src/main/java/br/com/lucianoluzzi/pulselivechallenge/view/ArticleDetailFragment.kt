package br.com.lucianoluzzi.pulselivechallenge.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.databinding.FragmentArticleDetailBinding

class ArticleDetailFragment : Fragment() {
    companion object {
        const val ARTICLE_KEY = "ARTICLE_KEY"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentArticleDetailBinding>(
            inflater,
            R.layout.fragment_article_detail,
            container,
            false
        )
        return binding.root
    }
}