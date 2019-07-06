package br.com.lucianoluzzi.pulselivechallenge.view.itens

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.pulselivechallenge.databinding.ItemArticleSummaryBinding
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary
import br.com.lucianoluzzi.pulselivechallenge.view.ArticleDetailFragment
import br.com.lucianoluzzi.pulselivechallenge.view.ArticlesFragmentDirections

class ArticleSummaryViewHolder(private val binding: ItemArticleSummaryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(articleSummary: ArticleSummary) {
        binding.article = articleSummary
        binding.container.setOnClickListener(
            navigate(articleSummary)
        )
    }

    private fun navigate(articleSummary: ArticleSummary): View.OnClickListener {
        val directionToDetailFragment = ArticlesFragmentDirections.actionArticlesToDetail()

        return Navigation.createNavigateOnClickListener(
            directionToDetailFragment.actionId,
            getExtrasFromArticleSummary(articleSummary)
        )
    }

    private fun getExtrasFromArticleSummary(articleSummary: ArticleSummary): Bundle {
        val bundle = Bundle()
        bundle.putSerializable(ArticleDetailFragment.ARTICLE_KEY, articleSummary)
        return bundle
    }
}