package by.coolightman.testapp.data.local.dbModel

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserDb(
    @PrimaryKey
    val id: Long,
    val name: String,
    @ColumnInfo(name = "image_url") val imageUrl: String,
    @ColumnInfo(name = "thumbnail_url") val thumbnailUrl: String
)
