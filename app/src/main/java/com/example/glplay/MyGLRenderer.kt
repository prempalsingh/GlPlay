package com.example.glplay

import android.opengl.GLES20
import android.opengl.GLSurfaceView
import android.util.Log
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MyGLRenderer : GLSurfaceView.Renderer {

    companion object {
        private const val TAG = "MyGLRenderer"
    }

    private lateinit var mTriangle: Triangle
    private lateinit var mSquare: Square

    override fun onSurfaceCreated(unused: GL10, config: EGLConfig) {
        Log.d(TAG, "onSurfaceCreated: ")
        // Set the background frame color
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f)

        mTriangle = Triangle()
        mSquare = Square()
    }

    override fun onDrawFrame(unused: GL10) {
        Log.d(TAG, "onDrawFrame: ")
        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)
        mTriangle.draw()
    }

    override fun onSurfaceChanged(unused: GL10, width: Int, height: Int) {
        Log.d(TAG, "onSurfaceChanged: ")
        GLES20.glViewport(0, 0, width, height)
    }
}
