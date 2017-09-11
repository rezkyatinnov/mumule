package com.rezkyatinnov.mumule.rest

import com.rezkyatinnov.kyandroid.reztrofit.RestCallback
import com.rezkyatinnov.kyandroid.reztrofit.Reztrofit
import java.util.*

/**
 * Created by rezkyatinnov on 11/09/2017.
 *
 * All the rest call will be manage using this Helper Class or create another Class as needed
 */

object ExampleHelper {
    fun ping(callback: RestCallback<BaseResponse<Objects>>){

        val service = Reztrofit.getInstance() as Reztrofit<RestServices>

        val getLicenseRest = service.endpoint.ping()

        getLicenseRest.enqueue(callback)
    }
}