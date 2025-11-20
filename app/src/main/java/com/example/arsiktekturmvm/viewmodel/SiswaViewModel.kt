package com.example.arsiktekturmvm.viewmodel // Sesuaikan dengan package kamu

import androidx.lifecycle.ViewModel
import com.example.arsiktekturmvm.model.Siswa // Pastikan import ini benar
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {

    // Request: private val _statusUI = MutableStateFlow(Siswa())
    private val _statusUI = MutableStateFlow(Siswa())

    // Request: val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2]
            )
        }
    }
}