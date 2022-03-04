package com.example.submission1_githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailUser : AppCompatActivity() {
    companion object {
        const val DETAIL_USER = "detail_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val imgDetailPhoto: ImageView = findViewById(R.id.img_detail_photo)
        val tvDetailName: TextView = findViewById(R.id.tv_detail_name)
        val tvDetailUsername: TextView = findViewById(R.id.tv_detail_username)
        val tvDetailFollowers: TextView = findViewById(R.id.tv_detail_followers)
        val tvDetailFollowing: TextView = findViewById(R.id.tv_detail_following)
        val tvDetailCompany: TextView = findViewById(R.id.tv_detail_company)
        val tvDetailLocation:TextView = findViewById(R.id.tv_detail_location)
        val tvDetailRepository: TextView = findViewById(R.id.tv_detail_repository)

        val user = intent.getParcelableExtra<User>(DETAIL_USER) as User

        val textDetailName = user.name
        val textDetailUsername = user.username
        val textDetailFollowers = "${user.followers} Followers"
        val textDetailFollowing = "${user.following} Following"
        val textDetailCompany = "Company : ${user.company}"
        val textDetailLocation = "Location : ${user.location}"
        val textDetailRepository = "Repository : ${user.repository}"

        imgDetailPhoto.setImageResource(user.photo)
        tvDetailName.text = textDetailName
        tvDetailUsername.text = textDetailUsername
        tvDetailFollowers.text = textDetailFollowers
        tvDetailFollowing.text = textDetailFollowing
        tvDetailCompany.text = textDetailCompany
        tvDetailLocation.text = textDetailLocation
        tvDetailRepository.text = textDetailRepository
    }
}