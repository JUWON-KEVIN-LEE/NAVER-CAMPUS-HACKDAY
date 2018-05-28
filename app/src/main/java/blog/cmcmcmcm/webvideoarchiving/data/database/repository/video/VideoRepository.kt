package blog.cmcmcmcm.webvideoarchiving.data.database.repository.video

import io.reactivex.Completable
import io.reactivex.Flowable

interface VideoRepository {
    fun save(video : Video) : Completable

    fun getAll() : Flowable<List<VideoWithTags>>
}