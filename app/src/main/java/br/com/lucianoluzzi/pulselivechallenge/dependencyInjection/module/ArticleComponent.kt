package br.com.lucianoluzzi.pulselivechallenge.dependencyInjection.module

import br.com.lucianoluzzi.pulselivechallenge.dependencyInjection.component.ArticleModule
import br.com.lucianoluzzi.pulselivechallenge.ui.viewModel.ArticleListViewModel
import br.com.lucianoluzzi.pulselivechallenge.ui.viewModel.ArticleViewModel
import br.com.lucianoluzzi.pulselivechallenge.ui.viewModel.ViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ArticleModule::class])
interface ArticleComponent {
    fun articleViewModelFactory(): ViewModelFactory<ArticleViewModel>
    fun articleListViewModelFactory(): ViewModelFactory<ArticleListViewModel>
}