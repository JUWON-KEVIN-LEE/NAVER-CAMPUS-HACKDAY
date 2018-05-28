package blog.cmcmcmcm.webvideoarchiving.data.database.repository.video

import blog.cmcmcmcm.webvideoarchiving.data.database.NDatabase
import io.reactivex.Completable
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

/**
 *
 */
@Singleton
class VideoRepositoryImpl @Inject constructor(
        private val database : NDatabase,
        private val videoDao : VideoDao
) : VideoRepository {

    override fun save(video: Video): Completable
            = Completable.create {
                database.runInTransaction {
                    videoDao.save(video)
                    it.onComplete()
                }
            }

    override fun getAll(): Flowable<List<VideoWithTags>> = videoDao.getAll()
}