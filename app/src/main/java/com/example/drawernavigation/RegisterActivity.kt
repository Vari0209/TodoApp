package com.example.drawernavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var btnSubmit : Button
    lateinit var email : EditText
    lateinit var regex : Regex
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnSubmit = findViewById(R.id.btnSubmit)
        email = findViewById(R.id.inputemail)
        btnSubmit.setOnClickListener {
            regex = Regex("""\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}""")
            if(android.util.Patterns.EMAIL_ADDRESS.matcher(email.text).matches()){
                Toast.makeText(this,"Registered Successfully",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Enter valid email",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
