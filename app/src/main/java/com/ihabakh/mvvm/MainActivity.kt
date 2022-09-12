package com.ihabakh.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ihabakh.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var movieViewModel: MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        movieViewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        binding.btnGetName.setOnClickListener {
            movieViewModel.getMovieName()
        }
        movieViewModel.mutableLiveData.observe(this) {
            binding.tvName.text = it
        }
    }
}