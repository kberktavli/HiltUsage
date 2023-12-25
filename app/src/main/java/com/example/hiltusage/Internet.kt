package com.example.hiltusage

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adress: Adress) {

    fun makeAnApplication(){
        Log.e("Result","The internet application was made to the adress ${adress.adressInfo} ")
    }
}