package br.com.lucianoluzzi.pulselivechallenge.dependency_injection

import br.com.lucianoluzzi.pulselivechallenge.network.ArticleService
import br.com.lucianoluzzi.pulselivechallenge.network.WebClient
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepository
import br.com.lucianoluzzi.pulselivechallenge.repository.ArticleRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ArticleModule {

    @Provides
    @Singleton
    fun provideArticleService(): ArticleService {
        return WebClient().service()
    }

    @Provides
    @Singleton
    fun provideArticleRepository(service: ArticleService): ArticleRepository {
        return ArticleRepositoryImpl(service)
    }
}