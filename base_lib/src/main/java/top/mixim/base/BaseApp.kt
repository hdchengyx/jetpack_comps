package top.mixim.base

import android.app.Application
import android.content.Context

abstract class BaseApp : Application() {
    private lateinit var instance: BaseApp

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    fun getInstance(): BaseApp {
        return instance
    }
}