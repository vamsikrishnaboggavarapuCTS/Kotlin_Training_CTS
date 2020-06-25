package daoDB

import androidx.room.Database
import androidx.room.RoomDatabase
import models.Result
import models.ViewedModel

@Database(entities = [ViewedModel::class,Result::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun viewedDao(): ViewedDao

}