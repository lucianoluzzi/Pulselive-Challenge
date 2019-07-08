package br.com.lucianoluzzi.pulselivechallenge.network.dto

import br.com.lucianoluzzi.pulselivechallenge.model.Article

data class ArticlesSummaryResponse(val items: List<Article>)