package br.com.lucianoluzzi.pulselivechallenge.view.itens

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.databinding.ItemArticleSummaryBinding
import br.com.lucianoluzzi.pulselivechallenge.model.ArticleSummary

class ArticlesSummaryAdapter(private val context: Context, private val articles: List<ArticleSummary>) :
    RecyclerView.Adapter<ArticleSummaryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleSummaryViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding =
            DataBindingUtil.inflate<ItemArticleSummaryBinding>(inflater, R.layout.item_article_summary, parent, false)

        return ArticleSummaryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleSummaryViewHolder, position: Int) {
        holder.bind(articles[position])
    }

}