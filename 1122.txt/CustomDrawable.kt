package com.qiuqiu.kotlindemo.bitmapAndDrawable

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class CustomDrawable(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private val drawable = MeshView()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        drawable.setBounds(0, 0, width, height)
        drawable.draw(canvas)
    }


}