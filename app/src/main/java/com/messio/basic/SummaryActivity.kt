package com.messio.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SummaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        val parcelableExtra = intent?.getParcelableExtra<SeizureSummary>("seizure_summary")
        Log.d(Constants.NAME, "Creating summary activity")
        parcelableExtra?.let {
            Log.d(Constants.NAME, "seizure: $it")
        }
    }
}
