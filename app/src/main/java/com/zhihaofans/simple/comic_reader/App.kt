package com.zhihaofans.simple.comic_reader

import android.app.Application
import com.haoge.easyandroid.EasyAndroid
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.maning.librarycrashmonitor.MCrashMonitor


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter(AndroidLogAdapter())
        MCrashMonitor.init(this, true) { file -> Logger.e("CrashMonitor回调:" + file.absolutePath) }
        EasyAndroid.init(this)
    }
}