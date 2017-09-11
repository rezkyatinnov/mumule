package com.rezkyatinnov.mumule.rest

import retrofit2.Call
import retrofit2.http.*
import java.util.*

/**
 * Created by rezkyatinnov on 11/09/2017.
 *
 * All endpoint services defined here using retrofit interface style
 */
interface RestServices {

    @Headers("Accept: application/json")
    @GET("ping")
    fun ping(): Call<BaseResponse<Objects>>

}