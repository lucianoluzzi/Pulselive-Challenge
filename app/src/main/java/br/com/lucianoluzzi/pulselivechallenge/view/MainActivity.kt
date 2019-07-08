package br.com.lucianoluzzi.pulselivechallenge.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import br.com.lucianoluzzi.pulselivechallenge.App
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.viewModel.ArticleListViewModel
import br.com.lucianoluzzi.pulselivechallenge.viewModel.ArticleViewModel

class MainActivity : AppCompatActivity() {
    val articleViewModel: ArticleViewModel by lazy {
        ViewModelProviders.of(this, (application as App).component().articleViewModelFactory())
            .get(ArticleViewModel::class.java)
    }
    val articleListViewModel: ArticleListViewModel by lazy {
        ViewModelProviders.of(this, (application as App).component().articleListViewModelFactory())
            .get(ArticleListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
