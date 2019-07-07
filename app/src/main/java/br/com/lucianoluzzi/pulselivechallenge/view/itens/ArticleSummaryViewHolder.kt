package br.com.lucianoluzzi.pulselivechallenge.view.itens

import android.view.View
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.pulselivechallenge.databinding.ItemArticleSummaryBinding
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary
import br.com.lucianoluzzi.pulselivechallenge.view.ArticlesFragmentDirections

class ArticleSummaryViewHolder(private val binding: ItemArticleSummaryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(articleSummary: ArticleSummary) {
        with(binding) {
            article = articleSummary
            container.setOnClickListener(
                navigate(articleSummary)
            )
        }
    }

    private fun navigate(articleSummary: ArticleSummary): View.OnClickListener {
        val directionToDetailFragment = ArticlesFragmentDirections.actionArticlesToDetail(articleSummary.id)
        return Navigation.createNavigateOnClickListener(directionToDetailFragment)
    }
}