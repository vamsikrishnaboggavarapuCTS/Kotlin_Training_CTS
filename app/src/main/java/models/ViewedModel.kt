package models

import androidx.room.Entity
import androidx.room.Ignore

@Entity
data class ViewedModel(
    @Ignore
    val copyright: String,
    @Ignore
    val num_results: Int,
    val results: List<Result>,
    val status: String
)