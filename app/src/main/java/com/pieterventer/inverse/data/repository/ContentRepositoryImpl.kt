package com.pieterventer.inverse.data.repository

import android.content.Context
import com.pieterventer.inverse.R

class ContentRepositoryImpl(private val context: Context) : ContentRepository {

    override suspend fun retrieveLoreContent(): String {
        return context.getString(R.string.lore)
    }
}