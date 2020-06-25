package daoDB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import models.ViewedModel

@Dao
interface ViewedDao {

    @Query("SELECT * FROM viewedmodel")
    suspend fun getViewedItem()

    @Insert
    suspend fun insertAll(viewedModel: ViewedModel)
}