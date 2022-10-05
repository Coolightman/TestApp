package by.coolightman.testapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import by.coolightman.testapp.data.local.dbModel.UserDb
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    suspend fun insert(users: List<UserDb>)

    @Query("SELECT * FROM users")
    fun getAll(): Flow<List<UserDb>>

    @Query("SELECT * FROM users WHERE id = :userId")
    fun getUser(userId: Long): Flow<UserDb>
}