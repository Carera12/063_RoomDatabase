package com.example.roomsiswa.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomsiswa.data.Siswa
import com.example.roomsiswa.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )

}