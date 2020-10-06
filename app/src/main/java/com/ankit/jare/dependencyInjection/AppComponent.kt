package com.ankit.jare.dependencyInjection

import com.ankit.jare.InfosysApp
import dagger.Component

@Component(
        modules = [
            ActivitiesModule::class
        ]
)

interface AppComponent {
    fun inject(wiproApp: InfosysApp)
}