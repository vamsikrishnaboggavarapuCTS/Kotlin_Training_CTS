package views.mostpopular

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import repositories.MostPopularRepository
import viewmodels.MostPopularViewModel

class MostPopularViewModelFactory(private val repository:MostPopularRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MostPopularViewModel(repository) as T
    }
}