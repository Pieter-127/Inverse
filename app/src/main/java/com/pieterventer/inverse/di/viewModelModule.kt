package com.pieterventer.inverse.di

import com.pieterventer.inverse.ui.ContentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { ContentViewModel(get()) }

}