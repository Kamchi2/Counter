package com.example.counter

import com.example.counter.model.ModelCounter
import com.example.counter.presenter.Presenter

class Injector {

    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): ModelCounter {
            return ModelCounter()
        }

    }
}