package com.example.hiltusage

import android.util.Log
import javax.inject.Inject

class Cargo @Inject constructor(var adress: Adress) {
    fun send() {
        Log.e("Result", "The Cargo was sent to ${adress.adressInfo} adress ")
    }
}