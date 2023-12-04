package com.example.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun registerClick(view : View) {
        val username = findViewById<EditText>(R.id.username_data);
        val password = findViewById<EditText>(R.id.password_data);
        val repeatPassword = findViewById<EditText>(R.id.repeat_password);
        if (username.text.toString().isBlank() || password.text.toString().isBlank()) {
            val toast = Toast.makeText(
                applicationContext,
                "The password or username is empty!", Toast.LENGTH_SHORT
            )
            toast.show()
            return;
        }
        if(!password.equals(repeatPassword)){
            val toast = Toast.makeText(
                applicationContext,
                "The passwords don't match!", Toast.LENGTH_SHORT
            )
            toast.show()
            return;
        }
        LoginState.setIsLoggedIn(true);
        finish();
    }
}