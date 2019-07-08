package br.com.lucianoluzzi.pulselivechallenge.model.dto

import br.com.lucianoluzzi.pulselivechallenge.model.entity.Article

data class ArticlesSummaryResponse(val items: List<Article>)