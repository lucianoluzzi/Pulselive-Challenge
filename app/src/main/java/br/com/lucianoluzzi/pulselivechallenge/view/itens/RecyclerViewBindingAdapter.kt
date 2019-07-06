package br.com.lucianoluzzi.pulselivechallenge.view.itens

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary

@BindingAdapter("articles", requireAll = false)
fun RecyclerView.setArticles(articles: List<ArticleSummary>?) {
    this.adapter = articles?.let {
        ArticlesSummaryAdapter(context, articles)
    } ?: run {
        ArticlesSummaryAdapter(context, listOf())
    }
    layoutManager = LinearLayoutManager(context)
}

