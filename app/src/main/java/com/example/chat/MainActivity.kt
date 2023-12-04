package com.example.chat

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var loadingDialog : LoadingDialog? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadingDialog = LoadingDialog(this);
        loadingDialog!!.show();
        Handler().postDelayed({
            loadingDialog!!.cancel();
            openLoginActivity(null);
        }, 3000);
    }


    fun openLoginActivity(view: View?){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}