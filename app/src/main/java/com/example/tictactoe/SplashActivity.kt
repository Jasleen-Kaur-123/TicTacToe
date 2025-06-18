package com.example.tictactoe
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView

class SplashActivity: AppCompatActivity(){
    private lateinit var image2:ImageView
    private lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Bind views before using them
        image2 = findViewById(R.id.image2)
        text = findViewById(R.id.text)

        image2.translationY = -1000f
        text.translationY = 1000f

        image2.animate().translationY(0f).duration = 2000
        text.animate().translationY(0f).duration = 2000

        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.


        Handler(Looper.getMainLooper()).postDelayed({
            val intent= Intent(this,StartGameActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)




    }
}