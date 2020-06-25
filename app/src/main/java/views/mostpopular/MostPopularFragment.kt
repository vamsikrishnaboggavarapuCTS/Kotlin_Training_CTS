package views.mostpopular

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_training.R
import kotlinx.android.synthetic.main.most_popular_fragment.*
import repositories.MostPopularRepository
import services.MostPopularApi
import viewmodels.MostPopularViewModel

@Suppress("DEPRECATION")
class MostPopularFragment : Fragment() {

    private lateinit var viewModel: MostPopularViewModel
    private lateinit var factory : MostPopularViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.most_popular_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val api = MostPopularApi()

        val repository = MostPopularRepository(api)

        factory = MostPopularViewModelFactory(repository)
        viewModel = ViewModelProviders.of(this, factory).get(MostPopularViewModel::class.java)

        viewModel.getViewedData()

        viewModel.viewedData.observe(viewLifecycleOwner, Observer { con ->
            recyclerView.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = MostPopularAdapter(con.results)
            }
        })
    }

}