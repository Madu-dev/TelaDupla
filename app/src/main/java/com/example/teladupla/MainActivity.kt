package com.example.teladupla
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teladupla.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bntSith.setOnClickListener {
            val telaGustavo = Intent(this, TelaGustavo::class.java)
            startActivity(telaGustavo)
        }

        binding.bntForca.setOnClickListener {
            val telaMaria = Intent(this, TelaMaria::class.java)
            startActivity(telaMaria)
        }
    }
}