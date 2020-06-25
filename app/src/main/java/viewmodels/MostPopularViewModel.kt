package viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import common.ApiUrls
import kotlinx.coroutines.runBlocking
import models.ViewedModel
import repositories.MostPopularRepository

class MostPopularViewModel(private val repository: MostPopularRepository) : ViewModel() {

    private val _viewedData = MutableLiveData<ViewedModel>()
    val viewedData: LiveData<ViewedModel>
        get() = _viewedData

    fun getViewedData() {

        runBlocking {
            val response = repository?.let {
                it.getViewedData(ApiUrls.MostPopular_ApiKey)
            }
            _viewedData.value = response
        }
    }
}