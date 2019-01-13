package com.example.artka.mygraphbuilder

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.SurfaceView
import android.view.View

class GraphView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    private var linePaint = Paint()

    private var myPath = arrayListOf(Pt(0F, 0F))

    private var xDividerInterval: Float = 50.0F
    private var yDividerInterval: Float = 50.0F

    private var xDividerAmount : Int = 0
    private var yDividerAmount : Int = 0

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        linePaint.color = Color.BLACK
        linePaint.strokeWidth = 3.0F
        linePaint.style = Paint.Style.STROKE

        var path = Path()

        path.moveTo(myPath[0].x, myPath[0].y)
        for (i in myPath.indices) {
            path.lineTo(myPath[i].x, myPath[i].y)
        }

        canvas.drawLine(50F, 500F, 50F, 0F, linePaint)
        canvas.drawPath(path, linePaint)
        canvas.drawLine(50F, 500F, 500F, 500F, linePaint)

        for (i in 1..9) {
            canvas.drawLine(50F*i, 480F, 50F*i, 520F, linePaint)
            canvas.drawLine(30F, 500F-(50F*i), 70F, 500F-(50F*i), linePaint)
        }

    }

    fun setData(data : ArrayList<Pt>) {
        myPath = data
    }

    fun setXDivider(interval : Int, count : Int) {
        xDividerInterval = interval.toFloat()
        xDividerAmount = count
    }

    fun setYDivider(interval : Int, count : Int) {
        yDividerInterval = interval.toFloat()
        yDividerAmount = count
    }

    data class Pt (var x : Float, var y : Float)
}