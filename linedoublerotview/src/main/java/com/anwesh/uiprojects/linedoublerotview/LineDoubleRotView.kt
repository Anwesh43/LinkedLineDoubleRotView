package com.anwesh.uiprojects.linedoublerotview

/**
 * Created by anweshmishra on 24/07/18.
 */

import android.graphics.Paint
import android.graphics.Canvas
import android.view.View
import android.view.MotionEvent
import android.content.Context

val NODES : Int = 5

class LineDoubleRotView(ctx : Context) : View(ctx) {

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}