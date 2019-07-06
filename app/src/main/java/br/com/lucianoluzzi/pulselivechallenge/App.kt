package br.com.lucianoluzzi.pulselivechallenge

import android.app.Application
import br.com.lucianoluzzi.pulselivechallenge.dependency_injection.ArticleComponent
import br.com.lucianoluzzi.pulselivechallenge.dependency_injection.DaggerArticleComponent

class App : Application() {
    private val component: ArticleComponent by lazy {
        DaggerArticleComponent.create()
    }

    fun component(): ArticleComponent {
        return component
    }
}