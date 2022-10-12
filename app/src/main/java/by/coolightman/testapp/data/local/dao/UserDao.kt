package by.coolightman.testapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Transaction
import by.coolightman.testapp.data.local.dbModel.UserDb
import by.coolightman.testapp.data.local.dbModel.relations.UserWithPostsDb
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    suspend fun insert(users: List<UserDb>)

    @Query("SELECT * FROM users")
    fun getAll(): Flow<List<UserDb>>

    @Query("SELECT * FROM users WHERE id = :userId")
    fun getUser(userId: Long): Flow<UserDb>

    @Transaction
    @Query("SELECT * FROM users")
    fun getUsersWithPosts(): Flow<List<UserWithPostsDb>>
}