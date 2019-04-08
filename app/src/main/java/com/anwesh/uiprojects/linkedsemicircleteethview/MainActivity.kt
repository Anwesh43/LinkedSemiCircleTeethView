package com.anwesh.uiprojects.linkedsemicircleteethview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.semicircleteethview.SemiCircleTeethView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SemiCircleTeethView.create(this)
    }
}
