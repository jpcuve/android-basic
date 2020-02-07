package com.messio.basic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_seizure.*


class SeizureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seizure)
        intent?.getParcelableExtra<SeizureSummary>("seizure_summary")?.let {
            Log.d("BASIC", "Intent found: $it")
            it.multiple?.let {
                oneMoreSeizuresRadioButton.setChecked(it)
                noSeizureRadioButton.setChecked(!it)
            }
        }
    }
}
