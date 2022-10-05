package by.coolightman.testapp.data.local.dbModel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
class PostDb(
    @PrimaryKey
    val id: Long,
    val title: String,
    val body: String,
    val userId: Long
)