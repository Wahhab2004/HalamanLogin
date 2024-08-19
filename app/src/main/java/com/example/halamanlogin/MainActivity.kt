package com.example.halamanloginn

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.halamanloginn.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            klikLogin.setOnClickListener {
                val username = username.text.toString()
                Toast.makeText(this@MainActivity, "Hello $username", Toast.LENGTH_LONG).show() // long or short digunakan untuk berapa lamanya ditampilkan ke layar
            }
        }
    }
}
