package com.example.counter

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.counter.View.CounterView
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.presenter.Presenter
import com.google.android.material.internal.ContextUtils.getActivity

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    val presenter = Injector.getPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment(applicationContext)
                if(presenter.model.getCount() == 15) {
                    counterTv.setTextColor(Color.GREEN)
                }
            }
        }
    }

    override fun updateCount(count: String) {
        binding.counterTv.text = count

    }
}