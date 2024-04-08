package com.aikei.lorby.network

import com.aikei.lorby.model.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // Define your API endpoints here

    // Example of a GET request
    @GET("users/{userId}")
    suspend fun getUser(@Path("userId") userId: String): Response<User>
    // Make sure to replace Response<User> with the actual response type
}
