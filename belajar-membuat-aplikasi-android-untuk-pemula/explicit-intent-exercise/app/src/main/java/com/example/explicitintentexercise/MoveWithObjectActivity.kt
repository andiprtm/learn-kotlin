package com.example.explicitintentexercise

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.explicitintentexercise.data.Person

class MoveWithObjectActivity : AppCompatActivity() {

    private lateinit var tvObject: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        tvObject = findViewById(R.id.tv_object_received)

        val person = if (Build.VERSION.SDK_INT >= 33){
            intent.getParcelableExtra(EXTRA_PERSON, Person::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_PERSON)
        }

        if (person != null){
            val text = "Name : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
            tvObject.text = text
        }
    }

    companion object{
        const val EXTRA_PERSON = "extra_person"
    }
}