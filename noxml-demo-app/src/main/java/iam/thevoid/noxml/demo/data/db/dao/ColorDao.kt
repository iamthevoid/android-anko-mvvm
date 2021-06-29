package iam.thevoid.noxml.demo.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import iam.thevoid.util.Optional
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import iam.thevoid.noxml.demo.data.db.entity.Color

@Dao
abstract class ColorDao {

    @Query("SELECT * FROM Color WHERE id = 1 LIMIT 1")
    abstract fun dbColorFlow() : Flow<List<Color>>

    fun colorFlow() = dbColorFlow().map { Optional.of(it.firstOrNull()) }

}