package com.example.imagepreviewwithcompose

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

        @GET("seed/picsum/info")
        suspend fun getImage():Response<Image>
}