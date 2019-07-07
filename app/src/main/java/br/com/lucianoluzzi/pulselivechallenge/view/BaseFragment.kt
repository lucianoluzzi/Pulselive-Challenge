package br.com.lucianoluzzi.pulselivechallenge.view

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

open class BaseFragment<B : ViewDataBinding> : Fragment() {
    protected lateinit var binding: B

    protected fun createViewBinding(container: ViewGroup?, @LayoutRes layoutRes: Int) {
        binding = DataBindingUtil.inflate(
            layoutInflater,
            layoutRes,
            container,
            false
        )
    }
}