package com.example.firebase_042.viewmodel

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebase_042.repositori.AplikasiDataSiswa
import androidx.lifecycle.ViewModelProvider


fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container.repositorySiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container.repositorySiswa) }
    }
}