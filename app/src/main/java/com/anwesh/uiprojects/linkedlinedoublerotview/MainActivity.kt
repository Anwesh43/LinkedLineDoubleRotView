package com.anwesh.uiprojects.linkedlinedoublerotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linedoublerotview.LineDoubleRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineDoubleRotView.create(this)
    }
}
