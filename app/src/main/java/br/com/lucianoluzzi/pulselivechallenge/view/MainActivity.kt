package br.com.lucianoluzzi.pulselivechallenge.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewModelScope
import br.com.lucianoluzzi.pulselivechallenge.App
import br.com.lucianoluzzi.pulselivechallenge.R
import br.com.lucianoluzzi.pulselivechallenge.view_model.ArticleSummaryViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var articleSummaryViewModel: ArticleSummaryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDependencies()
    }

    private fun injectDependencies() {
        (application as App).component().inject(this)
    }
}
