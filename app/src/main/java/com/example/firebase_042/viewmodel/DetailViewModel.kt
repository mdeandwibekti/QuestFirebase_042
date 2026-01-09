@file:OptIn(InternalSerializationApi::class)

package com.example.firebase_042.viewmodel

import com.example.firebase_042.view.route.DestinasiDetail
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase_042.modeldata.Siswa
import com.example.firebase_042.repositori.RepositorySiswa
import kotlinx.coroutines.launch
import kotlinx.serialization.InternalSerializationApi
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

