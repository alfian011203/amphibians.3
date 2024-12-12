package com.example.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.amphibians.ui.AmphibiansApp
import com.example.amphibians.ui.theme.AmphibiansTheme

// TODO 1: MainActivity adalah entry point aplikasi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO 2: Tetapkan konten untuk aplikasi menggunakan Jetpack Compose
        setContent {
            // TODO 3: Bungkus UI dalam tema khusus aplikasi (AmphibiansTheme)
            AmphibiansTheme {
                // TODO 4: Gunakan Surface sebagai container utama untuk elemen UI
                Surface(
                    modifier = Modifier.fillMaxSize(), // Memenuhi layar
                    color = MaterialTheme.colorScheme.background // Warna latar dari tema
                ) {
                    // TODO 5: Panggil fungsi utama aplikasi (AmphibiansApp) untuk memuat UI dan data
                    AmphibiansApp()
                }
            }
        }
    }
}
