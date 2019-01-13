package com.example.artka.mygraphbuilder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var myPath = arrayListOf(
        GraphView.Pt(50F, 500F),
        GraphView.Pt(100F, 450F),
        GraphView.Pt(100F, 300F),
        GraphView.Pt(150F, 350F),
        GraphView.Pt(200F, 100F),
        GraphView.Pt(250F, 200F),
        GraphView.Pt(300F, 350F),
        GraphView.Pt(350F, 100F),
        GraphView.Pt(400F, 350F)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        graph_view.setData(myPath)
        graph_view.setXDivider(50, 10)
        graph_view.setYDivider(75, 8)
    }
}
