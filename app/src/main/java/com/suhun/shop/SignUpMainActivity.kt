package com.suhun.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suhun.shop.databinding.ActivitySignUpMainBinding

class SignUpMainActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}