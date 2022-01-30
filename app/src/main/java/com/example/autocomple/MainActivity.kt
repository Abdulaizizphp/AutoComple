package com.example.autocomple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val language = resources.getStringArray(R.array.Languages)

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.select_dialog_item,
            language
        )
        autoCompleteTextView.setAdapter(adapter)
    }
}