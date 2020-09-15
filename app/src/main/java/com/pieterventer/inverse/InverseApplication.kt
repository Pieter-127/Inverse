package com.pieterventer.inverse

import android.app.Application
import com.pieterventer.inverse.di.repositoryModule
import com.pieterventer.inverse.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class InverseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidContext(this@InverseApplication)
            modules(listOf(viewModelModule, repositoryModule))
        }
    }
}