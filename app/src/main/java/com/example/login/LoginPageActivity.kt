package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.login.databinding.ActivityLoginPageBinding

class LoginPageActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginPageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginPageBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {

            val EditText = binding.edtEmailAddress.text.toString()

            val intent = Intent(this,Splash_Activity::class.java)
            startActivity(intent)
        }








    }
}