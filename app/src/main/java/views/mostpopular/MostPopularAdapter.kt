package views.mostpopular

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_training.R
import com.example.kotlin_training.databinding.ViewedRecycleItemBinding
import models.Result

class MostPopularAdapter(private val result:List<Result>): RecyclerView.Adapter<MostPopularAdapter.ItemViewHolder>()  {

    inner class ItemViewHolder(val viewedRecycleItemBinding: ViewedRecycleItemBinding):
        RecyclerView.ViewHolder(viewedRecycleItemBinding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.viewed_recycle_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return result.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.viewedRecycleItemBinding.data = result[position]
    }
}