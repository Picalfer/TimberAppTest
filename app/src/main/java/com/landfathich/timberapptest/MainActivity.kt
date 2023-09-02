package com.landfathich.timberapptest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.landfathich.timberapptest.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        with(binding) {
            btnError.setOnClickListener {
                onClickError()
            }

            btnInfo.setOnClickListener {
                onClickInfo()
            }

            btnDebug.setOnClickListener {
                onClickDebug()
            }

            btnVerbose.setOnClickListener {
                onClickVerbose()
            }
        }
    }

    private fun onClickVerbose() {
        Timber.v("On Verbose Clicked")
    }

    private fun onClickDebug() {
        Timber.d("On Debug Clicked")
    }

    private fun onClickInfo() {
        Timber.i("On Info Clicked")
    }

    private fun onClickError() {
        Timber.e("On Error Clicked")
    }
}