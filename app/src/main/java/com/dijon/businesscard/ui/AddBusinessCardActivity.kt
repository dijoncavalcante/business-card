package com.dijon.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dijon.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners() {
        binding.apply {
            btnClose.setOnClickListener{
                finish()
            }
            btnConfirm.setOnClickListener {
                finish()
            }
        }
    }
}