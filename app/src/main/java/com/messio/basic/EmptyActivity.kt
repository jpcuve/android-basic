package com.messio.basic

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EmptyActivity : AppCompatActivity(), BlankFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)
    }

    override fun onResume(){
        super.onResume()
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("$uri")
    }
}
