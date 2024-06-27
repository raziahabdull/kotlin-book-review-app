package com.akirachix.readersdigest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.readersdigest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.rvAtricles.layoutManager = LinearLayoutManager(this)
            displayArticles()

        }
        fun displayArticles(){
            val article1 = Atricle("Ashley Olsen","Dietitian","Atricle on good dieting","Food For Thought","Ashley Olsen","12th July 2022","","book")
            val article2 = Article("Cate Hansen","Cardiologist at Antara Health","read my article on heart health","Heart Health 101","Dr Cate Hansen","13 August 2021","","book")
            val article3 = Article("Anna Lucia","Food Coach","Body Goals ","importance of water","Anna Lucia","17th May 2020","","book")
            val article4 = Article("Linda Marie","Food Blogger","Healthy minds","why we shoul excercise","Linda Marie","2 May 2005","","book")
            val article5 = Article("Zara Larson","Fitness Trainner"," 100 tips to be fit ","Fitness Journey","Zara Larson","6 February 2022","","book")

            val myAtricle= listOf(article1,article2,article3,article4,article5)

            val articlesAdapter = ArticlesAdapter(myAtricle)
            binding.rvAtricles.adapter= articlesAdapter
        }
    }
}

