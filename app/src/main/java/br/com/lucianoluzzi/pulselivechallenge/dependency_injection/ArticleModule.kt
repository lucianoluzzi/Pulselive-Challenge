package br.com.lucianoluzzi.pulselivechallenge.dependency_injection

import br.com.lucianoluzzi.pulselivechallenge.network.ArticleService
import br.com.lucianoluzzi.pulselivechallenge.network.WebClient
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
class ArticleModule {

    @Provides
    @Reusable
    fun provideArticleService(): ArticleService {
        return WebClient().service()
    }

    @Provides
    @Reusable
    fun provideArticleRepository(service: ArticleService): ArticleRepository {
        return ArticleRepositoryImpl(service)
    }
}