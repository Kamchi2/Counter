package com.example.counter.presenter

import android.content.Context
import android.view.InputQueue
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import com.example.counter.Injector
import com.example.counter.MainActivity
import com.example.counter.R
import com.example.counter.View.CounterView
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.model.ModelCounter

class Presenter {

    lateinit var view : CounterView
    val model = Injector.getModel()

    fun increment(context: Context) {
        model.increment()
        view.updateCount(model.getCount().toString())
        model.reward(context)
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}