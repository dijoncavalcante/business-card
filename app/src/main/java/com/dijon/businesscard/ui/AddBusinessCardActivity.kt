package com.dijon.businesscard.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dijon.businesscard.App
import com.dijon.businesscard.R
import com.dijon.businesscard.data.BusinessCard
import com.dijon.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

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
                val businessCard = BusinessCard(
                    name = tilName.editText?.text.toString(),
                    company = tilCompany.editText?.text.toString(),
                    cellphone = tilCellphone.editText?.text.toString(),
                    email = tilEmail.editText?.text.toString(),
                    backgroundCustom = tilColor.editText?.text.toString(),
                )
                mainViewModel.insert(businessCard)
                Toast.makeText(this@AddBusinessCardActivity, R.string.label_show_success, Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}