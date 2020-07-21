package com.andra.tugasprofilinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try{
            this.supportActionBar?.hide()
        } catch (e:NullPointerException) {}
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(R.drawable.profil_img)
            .circleCrop()
            .into(profil)

        Glide.with(this)
            .load(R.drawable.story)
            .circleCrop()
            .into(story)
    }
}