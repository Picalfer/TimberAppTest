package com.landfathich.timberapptest

import android.app.Application
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // если нужно, чтобы timber работал только при запусках приложения на дебаге, а не на релизе
        /*if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }*/

        // простая инициализация
        Timber.plant(Timber.DebugTree())
    }
}
