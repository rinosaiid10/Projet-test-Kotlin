package com.rino.chatequipe.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout
import com.rino.chatequipe.R
import com.rino.chatequipe.RegisterActivity

class AuthentificationActivity : AppCompatActivity() {


    lateinit var tvRegister: TextView
    lateinit var textInputLayoutEmail: TextInputLayout
    lateinit var textInputLayoutPassword: TextInputLayout
    lateinit var btnConnect: MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentification_activity)


        tvRegister =findViewById(R.id.tvRegister)
        textInputLayoutEmail =findViewById(R.id.textInputlayoutEmail)
        textInputLayoutPassword =findViewById(R.id.textInputlayoutPassword)
        btnConnect =findViewById(R.id.btnConnect)


        tvRegister.setOnClickListener{
            Intent(this, RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
        btnConnect.setOnClickListener {

            textInputLayoutEmail.isErrorEnabled = false
            textInputLayoutPassword.isErrorEnabled = false

            //recuperer email et mot de passe
            val email = textInputLayoutEmail.editText?.text.toString()
            val password = textInputLayoutPassword.editText?.text.toString()


            if(email.isEmpty() || password.isEmpty()){
                if (email.isEmpty()){

                    textInputLayoutEmail.error="Email is required !"
                    textInputLayoutEmail.isErrorEnabled
                }
                if (password.isEmpty()){

                    textInputLayoutPassword.error="Password is required !"
                    textInputLayoutPassword.isErrorEnabled
                }

            } else {
                signIn(email, password)
            }

        }
    }

    fun signIn( email: String , password: String){

        Log.d("signIn", "signIn user....")

        if (email== "rino@gmail.com" && password=="azerty123"){
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
            finish()
        } else {
            textInputLayoutPassword.error = "Authentication failed !"
            textInputLayoutEmail.isErrorEnabled
            textInputLayoutPassword.isErrorEnabled
        }




    }
}