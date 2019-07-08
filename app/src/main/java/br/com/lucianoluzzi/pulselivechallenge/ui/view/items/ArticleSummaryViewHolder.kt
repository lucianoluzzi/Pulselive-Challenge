package br.com.lucianoluzzi.pulselivechallenge.ui.view.items

import android.view.View
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.pulselivechallenge.databinding.ItemArticleSummaryBinding
import br.com.lucianoluzzi.pulselivechallenge.model.entity.Article
import br.com.lucianoluzzi.pulselivechallenge.ui.view.ArticlesFragmentDirections

class ArticleSummaryViewHolder(private val binding: ItemArticleSummaryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(articleSummary: Article) {
        with(binding) {
            article = articleSummary
            container.setOnClickListener(
                navigate(articleSummary)
            )
        }
    }

    private fun navigate(articleSummary: Article): View.OnClickListener {
        val directionToDetailFragment = ArticlesFragmentDirections.actionArticlesToDetail(articleSummary.id)
        return Navigation.createNavigateOnClickListener(directionToDetailFragment)
    }
}