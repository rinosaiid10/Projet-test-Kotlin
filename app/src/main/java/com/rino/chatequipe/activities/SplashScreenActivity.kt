   package com.rino.chatequipe.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.rino.chatequipe.R

   class SplashScreenActivity : AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_splash_screen)

           //pour ajouter une durée d'attente avec handler
                 Handler(Looper.getMainLooper()).postDelayed({
          Intent(this, AuthentificationActivityActivity ::class.java).also {
              startActivity(it)
          }
          finish()
          }, 3000)

      }

       }
