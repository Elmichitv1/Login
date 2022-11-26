package edu.bo.ucb.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoToRegister = findViewById<TextView>(R.id.tv_go_to_register)
        tvGoToRegister.setOnClickListener{
            goToRegister()
        }
    }
    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}