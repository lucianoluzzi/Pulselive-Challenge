package br.com.lucianoluzzi.pulselivechallenge.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lucianoluzzi.pulselivechallenge.model.entity.ViewRequestState

abstract class BaseViewModel : ViewModel() {
    val viewState = MutableLiveData<ViewRequestState>().apply {
        value = ViewRequestState.LOADING
    }
}