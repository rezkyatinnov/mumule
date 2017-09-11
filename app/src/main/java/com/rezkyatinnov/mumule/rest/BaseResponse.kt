package com.rezkyatinnov.mumule.rest

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by rezkyatinnov on 11/09/2017.
 *
 * Base Class for Restful API response
 */
class BaseResponse<D> (
        @SerializedName("message")
        @Expose
        var message: String = "",
        @SerializedName("data")
        @Expose
        var data: D?
)