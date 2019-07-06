package br.com.lucianoluzzi.pulselivechallenge.view.adapter

import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.pulselivechallenge.databinding.ItemArticleSummaryBinding
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary

class ArticleSummaryViewHolder(private val binding: ItemArticleSummaryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun setArticleSummary(articleSummary: ArticleSummary) {
        binding.article = articleSummary
    }
}