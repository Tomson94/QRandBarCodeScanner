package com.qdev.qrandbarcodescanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val permissions = arrayOf(android.Manifest.permission.CAMERA)
        ActivityCompat.requestPermissions(this, permissions,0)

        tvresult = findViewById(R.id.tvresult) as TextView

        btn = findViewById(R.id.scan) as Button

        btn!!.setOnClickListener {
            val intent = Intent(this@MainActivity, ScanQRActivity::class.java)
            startActivity(intent)
        }

    }

    companion object {

        var tvresult: TextView? = null
    }
}