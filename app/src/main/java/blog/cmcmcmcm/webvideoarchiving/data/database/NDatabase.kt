package blog.cmcmcmcm.webvideoarchiving.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag.Tag
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag.TagDao
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.video.Video
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.video.VideoDao

@Database(entities = [Video::class, Tag::class], version = 1)
abstract class NDatabase : RoomDatabase() {

    abstract val tagDao : TagDao

    abstract val videoDao : VideoDao
}