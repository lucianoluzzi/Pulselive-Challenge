package br.com.lucianoluzzi.pulselivechallenge.model

class Article(
    private val body: String,
    id: Int,
    title: String,
    subtitle: String,
    date: String
) : ArticleSummary(
    id,
    title,
    subtitle,
    date
)