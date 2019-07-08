package br.com.lucianoluzzi.pulselivechallenge.model.entity

import java.io.Serializable

open class ArticleSummary(
    val id: Int,
    val title: String,
    val subtitle: String,
    val date: String
) : Serializable