package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.launch.*

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch)

        logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_in))
        Handler().postDelayed({
            logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splach_out))
            Handler().postDelayed({
                logo.visibility = View.GONE
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },500)
        },1500)



    }
}