package blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag

import io.reactivex.Completable

interface TagRepository {
    fun save(tag : Tag) : Completable
}