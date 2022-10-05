package by.coolightman.testapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import by.coolightman.testapp.data.local.dao.PostDao
import by.coolightman.testapp.data.local.dao.UserDao
import by.coolightman.testapp.data.local.dbModel.PostDb
import by.coolightman.testapp.data.local.dbModel.UserDb

@Database(
    version = 2,
    entities = [
        UserDb::class,
        PostDb::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    abstract fun postDao(): PostDao
}