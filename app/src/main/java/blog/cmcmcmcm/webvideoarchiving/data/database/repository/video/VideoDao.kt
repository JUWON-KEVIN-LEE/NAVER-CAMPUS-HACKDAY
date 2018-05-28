package blog.cmcmcmcm.webvideoarchiving.data.database.repository.video

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Flowable

@Dao
interface VideoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(video : Video)

    @Query("SELECT * FROM nvideo")
    fun getAll() : Flowable<List<VideoWithTags>>
}