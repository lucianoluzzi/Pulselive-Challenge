package br.com.lucianoluzzi.pulselivechallenge.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.lucianoluzzi.pulselivechallenge.App
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.viewModel.ArticleSummaryViewModel
import br.com.lucianoluzzi.pulselivechallenge.viewModel.ArticleViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var articleSummaryViewModel: ArticleSummaryViewModel
    @Inject
    lateinit var articleViewModel: ArticleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDependencies()
    }

    private fun injectDependencies() {
        (application as App).component().inject(this)
    }
}
