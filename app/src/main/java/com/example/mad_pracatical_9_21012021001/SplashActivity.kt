package com.example.mad_pracatical_9_21012021001

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    lateinit var logoimage : ImageView
    lateinit var logoanimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoimage=findViewById(R.id.uvpce)
        logoimage.setBackgroundResource((R.drawable.uvpce_animation_list))
        logoanimation=AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        logoanimation.setAnimationListener(this)

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoimage.startAnimation(logoanimation)
            logoanimation.start()
        }
        else {
            logoanimation.stop()
        }
    }
}