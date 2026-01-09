package com.example.firebase_042.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase_042.modeldata.DetailSiswa
import com.example.firebase_042.modeldata.UIStateSiswa
import com.example.firebase_042.modeldata.toDataSiswa
import com.example.firebase_042.modeldata.toUiStateSiswa
import com.example.firebase_042.repositori.RepositorySiswa
import com.example.firebase_042.view.route.DestinasiDetail
import kotlinx.coroutines.launch

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositorySiswa: RepositorySiswa
) : ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

