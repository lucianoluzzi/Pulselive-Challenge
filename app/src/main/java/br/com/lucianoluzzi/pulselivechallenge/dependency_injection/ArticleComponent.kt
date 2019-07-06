package br.com.lucianoluzzi.pulselivechallenge.dependency_injection

import br.com.lucianoluzzi.pulselivechallenge.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ArticleModule::class])
interface ArticleComponent {
    fun inject(activity: MainActivity)
}