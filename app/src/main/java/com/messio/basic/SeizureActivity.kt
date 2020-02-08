package com.messio.basic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_seizure.*


class SeizureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seizure)
        val parcelableExtra = intent?.getParcelableExtra<SeizureSummary>("seizure_summary")
        parcelableExtra?.let {
            Log.d("BASIC", "Intent found: $it")
            it.multiple?.let {
                oneMoreSeizuresRadioButton.setChecked(it)
                noSeizureRadioButton.setChecked(!it)
            }
        }
        backButton.setOnClickListener {
            startActivity(Intent(this@SeizureActivity, MainActivity::class.java))
        }
        nextButton.setOnClickListener {
            if (!oneMoreSeizuresRadioButton.isChecked() && !noSeizureRadioButton.isChecked()){
                Log.d("BASIC", "No choice...")
                val alertDialogBuilder = AlertDialog.Builder(this).apply {
                    setTitle("Dialogue")
                    setMessage(R.string.dummy_content)
                    show()
                }
            } else {
                startActivity(Intent(this@SeizureActivity, SummaryActivity::class.java).apply {
                    putExtra("seizure_summary", parcelableExtra)
                })
            }
        }
    }
}
