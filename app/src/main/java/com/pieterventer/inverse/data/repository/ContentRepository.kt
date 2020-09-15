package com.pieterventer.inverse.data.repository

interface ContentRepository {
    suspend fun retrieveLoreContent(): String
}