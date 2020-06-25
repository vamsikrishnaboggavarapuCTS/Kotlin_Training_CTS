package services

import common.ApiUrls
import models.ViewedModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface MostPopularApi {

    @GET("viewed/1.json")
    suspend fun getViewedData(@Query("api-key") key:String):Response<ViewedModel>

    companion object{
        operator fun invoke() : MostPopularApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiUrls.MostPopular_BaseUrl)
                .build()
                .create(MostPopularApi::class.java)
        }
    }
}