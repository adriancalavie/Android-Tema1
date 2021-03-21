package com.example.androidtema1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidtema1.R
import com.example.androidtema1.fragments.FragmentFour
import com.example.androidtema1.fragments.FragmentThree
import com.example.androidtema1.fragments.FragmentTwo
import com.example.androidtema1.interfaces.IActivityFragmentCommunication

class ActivityTwo : AppCompatActivity(), IActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        replaceFragment(FragmentTwo::class.java.name)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    override fun openNextActivity() {
        TODO("Not yet implemented")
    }

    override fun replaceFragment(tag: String) = when (tag) {
        FragmentTwo::class.java.name -> {
            addMainFragment()
        }

        FragmentThree::class.java.name -> {
            replaceWithFragmentThree()
        }

        FragmentFour::class.java.name -> {
            replaceFragmentThreeWithFragmentFour()
        }
        else -> println("Invalid tag!")
    }

    private fun addMainFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = FragmentTwo::class.java.name
        val addTransaction = transaction.add(
            R.id.activity2_frame, FragmentTwo.newInstance(), tag
        )
        addTransaction.commit()
    }

    private fun replaceWithFragmentThree() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = FragmentThree::class.java.name
        val replaceTransaction = transaction.replace(
            R.id.activity2_frame, FragmentThree.newInstance(), tag
        )
        replaceTransaction.commit()
    }

    private fun replaceFragmentThreeWithFragmentFour() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = FragmentFour::class.java.name
        val replaceTransaction = transaction.replace(
            R.id.activity2_frame, FragmentFour.newInstance(), tag
        )
        replaceTransaction.commit()
    }
}