package com.example.amphibians

import android.app.Application
import com.example.amphibians.data.AppContainer
import com.example.amphibians.data.DefaultAppContainer

// TODO 1: AmphibiansApplication digunakan untuk mengatur dependensi tingkat aplikasi
class AmphibiansApplication : Application() {

    /** 
     * TODO 2: Membuat instance `AppContainer` untuk mengelola dependensi 
     * yang digunakan di berbagai komponen aplikasi.
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()

        // TODO 3: Inisialisasi instance DefaultAppContainer sebagai default dependency container
        container = DefaultAppContainer()
    }
}

