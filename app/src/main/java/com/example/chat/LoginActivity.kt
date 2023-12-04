package com.example.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun registerClick(view: View){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun loginClick(view : View){
        val username = findViewById<EditText>(R.id.username_data);
        val password = findViewById<EditText>(R.id.password_data);
        if(username.text.toString().isBlank() || password.text.toString().isBlank()) {
            val toast = Toast.makeText(
                applicationContext,
                "The password or username is empty!", Toast.LENGTH_SHORT
            )
            toast.show()
            return;
        }
        LoginState.setIsLoggedIn(true);
        finish();
    }
}