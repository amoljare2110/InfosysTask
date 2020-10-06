package com.ankit.jare

import android.app.Activity
import android.app.Application
import com.ankit.jare.dependencyInjection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class InfosysApp : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        instance = this

        val appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
    }

    companion object {
        lateinit var instance: InfosysApp
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }
}