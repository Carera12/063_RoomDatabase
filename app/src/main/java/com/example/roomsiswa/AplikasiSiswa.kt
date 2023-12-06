package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.repositori.ContainerApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp


}