package com.example.smack

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.R
import kotlinx.android.synthetic.main.activity_create_user.*
import kotlin.random.Random


class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5,0.5,0.5,1]"  // RGB RED, GREAN, BLUE



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    fun generateUserAvatar(view: View){
        val random = Random
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if (color== 0){
            userAvatar="light$avatar"

        } else {
            userAvatar="dark$avatar"
        }
        val resourseId = resources.getIdentifier(userAvatar,"drawable",packageName)
        createAvatarImageView.setImageResource(resourseId)
    }
    fun generateColorClicked(view: View){
        val rabdon= Random
        val r=Random.nextInt(255)
        val g=Random.nextInt(255)
        val b=Random.nextInt(255)
        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))
        val savedR=r.toDouble()/255
        val savedG=r.toDouble()/255
        val savedB=r.toDouble()/255
        avatarColor="[$savedR,$savedG,$savedB,1]"
    }
    fun createUserClicked(view: View){

    }
}