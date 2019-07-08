# Pulselive Challenge

This project is part of the Pulselive hiring process.

It features an Android app that displays a list of articles and expand it in detail on list item click.

# Architecture and technologies


I used clean code conventions and SOLID concepts as guidelines, aswell as Google's "Guide to app architecture" (https://developer.android.com/jetpack/docs/guide).

Based on these principles I chose MVVM as my project architecture, which provided me with clear separtion of concerns.

Used dependency injection to achieve separation of concerns regarding object construction.

Adopted the Repository Pattern to provide and easy way of changing data provider, establish a clear contract that any data provider should adopt, make the viewmodel-repostitory relation less coupled, and simplify testing.

Used databinding with livedata as a mean to easily reflect dataset changes to the UI and reduce/simplify code, neither having to "observe" changed nor to manually set ui component values.

Used kotlin coroutines as a way to manage background tasks in a seamingly effortless way, with less coding than would have been needed with RxJava/RxKotlin.

Used the Navigation component to provide centralization of the app's navigation graph, along with stable navigation without having to deal with the UI stack.


# Tech-stack

Kotlin, Dagger 2, ViewModel, LiveData, Databinding, Kotlin Coroutines, Navigation, Retrofit

# Next steps


If this project would turn into production code, I would firstly move from kotlin coroutines into RxJava, since coroutines is still experimental.

Would also implement local storage with Room, providing a way to the user read already fetched articles when offline.

Without the thirdy-party libraries restriction, would provide unit and instrumented tests using Mockito.
