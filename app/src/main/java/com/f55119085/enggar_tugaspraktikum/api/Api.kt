package com.f55119085.enggar_tugaspraktikum.api

import com.f55119085.enggar_tugaspraktikum.data.model.DetailUser
import com.f55119085.enggar_tugaspraktikum.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users" )
    @Headers( "Authorization: token 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" )

    fun getSearchUsers (
        @Query ( "q" ) query : String
    ): Call<UserResponse>

    @GET( "users/{username}" )
    @Headers( "Authorization: token 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" )

    fun getUserDetail (
        @Path ( "username" ) username : String
    ): Call<DetailUser>
}