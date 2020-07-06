package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remote = RetrofitClient.createService(PostService::class.java)
        val call : retrofit2.Call<List<PostModel>> = remote.list()
        call.enqueue( object : retrofit2.Callback<List<PostModel>>{
            override fun onFailure(call: retrofit2.Call<List<PostModel>>, t: Throwable) {
                val s = t.message
            }

            override fun onResponse(
                call: retrofit2.Call<List<PostModel>>,
                response: Response<List<PostModel>>
            ) {
                val s = response.body()
            }

        })
    }
}