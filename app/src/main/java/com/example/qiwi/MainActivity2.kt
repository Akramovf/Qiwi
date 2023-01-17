package com.example.qiwi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qiwi.databinding.FragmentSecondBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class MainActivity2 : AppCompatActivity() {
    private val AllFrag = listOf(
        Qiwi_card.newInstance(),
        Other_cards.newInstance())
    private lateinit var binding: FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tb.addOnTabSelectedListener(object :OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder , AllFrag[tab?.position!!])
            .commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}