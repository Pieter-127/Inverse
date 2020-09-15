package com.pieterventer.inverse.di

import com.pieterventer.inverse.data.repository.ContentRepository
import com.pieterventer.inverse.data.repository.ContentRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<ContentRepository> { ContentRepositoryImpl(get()) }
}