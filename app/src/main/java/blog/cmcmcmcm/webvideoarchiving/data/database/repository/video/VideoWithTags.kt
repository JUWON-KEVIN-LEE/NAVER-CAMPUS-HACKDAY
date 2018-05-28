package blog.cmcmcmcm.webvideoarchiving.data.database.repository.video

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Relation
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag.Tag

class VideoWithTags {
    @Embedded
    lateinit var video : Video

    @Relation(parentColumn = "id", entityColumn = "video_id", entity = Tag::class)
    lateinit var tags : List<Tag>
}