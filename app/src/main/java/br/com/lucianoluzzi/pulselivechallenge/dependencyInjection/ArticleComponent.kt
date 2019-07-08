package br.com.lucianoluzzi.pulselivechallenge.dependencyInjection

import br.com.lucianoluzzi.pulselivechallenge.viewModel.ArticleListViewModel
import br.com.lucianoluzzi.pulselivechallenge.viewModel.ArticleViewModel
import br.com.lucianoluzzi.pulselivechallenge.viewModel.ViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ArticleModule::class])
interface ArticleComponent {
    fun articleViewModelFactory(): ViewModelFactory<ArticleViewModel>
    fun articleListViewModelFactory(): ViewModelFactory<ArticleListViewModel>
}