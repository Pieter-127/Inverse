package com.pieterventer.inverse.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pieterventer.inverse.data.repository.ContentRepository
import kotlinx.coroutines.launch

class ContentViewModel(private val contentRepository: ContentRepository) : ViewModel() {

    val loreContent = MutableLiveData<String>()

    init {
        viewModelScope.launch {
            loreContent.value = contentRepository.retrieveLoreContent()
        }
    }
}