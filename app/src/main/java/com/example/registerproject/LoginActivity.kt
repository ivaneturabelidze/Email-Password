package com.example.registerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signInButton: Button
    private lateinit var goBackButton: Button
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailEditText = findViewById(R.id.loginEmailEditText)
        passwordEditText = findViewById(R.id.loginPwdEditText)
        signInButton = findViewById(R.id.signInPageButton)
        goBackButton = findViewById(R.id.goBackButton)
        auth = FirebaseAuth.getInstance()
        goBackButton.setOnClickListener {
            finish()
        }
    }
}