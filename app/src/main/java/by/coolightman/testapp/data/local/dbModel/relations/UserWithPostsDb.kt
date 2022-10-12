package by.coolightman.testapp.data.local.dbModel.relations

import androidx.room.Embedded
import androidx.room.Relation
import by.coolightman.testapp.data.local.dbModel.PostDb
import by.coolightman.testapp.data.local.dbModel.UserDb

data class UserWithPostsDb(
    @Embedded val userDb: UserDb,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val postsDb: List<PostDb>
)
