package com.example.praktikumarsitekturvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.arsiktekturmvm.ui.theme.ArsiktekturMVMTheme
import com.example.arsitekturvm.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArsiktekturMVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SiswaApp(modifier = Modifier)// Panggil Composable Navigasi Utama
                }
            }
        }
    }
}