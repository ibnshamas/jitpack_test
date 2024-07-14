package com.acmosoft.jitpacktestlib


import android.content.Context
import android.content.Intent

class Jitpack private constructor() {
    companion object {
        @Volatile
        private var instance: Jitpack? = null

        fun getInstance(): Jitpack {
            return instance ?: synchronized(this) {
                instance ?: Jitpack().also {
                    instance = it
                }
            }
        }
    }


     fun showOffers(context: Context) {
             val intent = Intent(context, MainActivityLib::class.java)
             context.startActivity(intent)

    }


}