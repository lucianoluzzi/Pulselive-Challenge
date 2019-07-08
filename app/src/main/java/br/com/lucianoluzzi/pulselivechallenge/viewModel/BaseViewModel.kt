package br.com.lucianoluzzi.pulselivechallenge.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lucianoluzzi.pulselivechallenge.model.ViewRequestState

abstract class BaseViewModel : ViewModel() {
    val viewState = MutableLiveData<ViewRequestState>().apply {
        value = ViewRequestState.LOADING
    }
}