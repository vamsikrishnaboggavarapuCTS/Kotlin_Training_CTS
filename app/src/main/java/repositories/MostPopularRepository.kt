package repositories

import services.MostPopularApi
import services.SafeApiRequest

class MostPopularRepository(private val api: MostPopularApi) : SafeApiRequest() {

    suspend fun getViewedData(apiKey:String) = apiRequest { api.getViewedData(apiKey) }

}