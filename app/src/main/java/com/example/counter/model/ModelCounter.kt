package com.example.counter.model

import android.content.Context
import android.widget.Toast

class ModelCounter {

    private var count = 0

    fun increment () {
        ++count
    }
    fun getCount (): Int {
        return count
    }

    fun reward(context: Context) {
        if(count==10) {
            Toast.makeText(context, "Поздравляю", Toast.LENGTH_LONG).show()
        }
        else if(count==15) {

        }
    }
}