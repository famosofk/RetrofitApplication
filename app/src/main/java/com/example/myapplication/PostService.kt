package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface PostService {

    /*
    *
    * recurso concatenado com a palavra service. Ou seja, será responsável por fazer a ligação com os posts.
    *
    * */
    @GET("posts")
    fun list(): Call<List<PostModel>>
}