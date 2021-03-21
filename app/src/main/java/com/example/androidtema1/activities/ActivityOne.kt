package com.example.androidtema1.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidtema1.R
import com.example.androidtema1.interfaces.IActivityFragmentCommunication

class ActivityOne : AppCompatActivity(), IActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
    }

    override fun openMainActivity() {
        startActivity(Intent(this, ActivityTwo::class.java))
    }
}