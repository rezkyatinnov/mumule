package com.rezkyatinnov.mumule

import android.app.Application
import android.content.Context
import com.rezkyatinnov.kyandroid.Kyandroid
import com.rezkyatinnov.mumule.rest.RestServices

/**
 * Created by rezkyatinnov on 11/09/2017.
 */

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        Kyandroid.setDbKey("92jSim1SpGLlGah0adQce2uM39CBiB2K4wTMQiTFV2sHyoh611vej8Qg57pPmXC6")
        Kyandroid.init(this,
                BuildConfig.BASE_URL,RestServices::class.java,
                BuildConfig.SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }
}