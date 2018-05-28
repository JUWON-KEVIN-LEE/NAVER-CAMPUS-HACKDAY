package blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy

@Dao
interface TagDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(tag : Tag) : Long
}