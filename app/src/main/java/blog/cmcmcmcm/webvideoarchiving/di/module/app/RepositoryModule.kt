package blog.cmcmcmcm.webvideoarchiving.di.module.app

import blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag.TagRepository
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.tag.TagRepositoryImpl
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.video.VideoRepository
import blog.cmcmcmcm.webvideoarchiving.data.database.repository.video.VideoRepositoryImpl
import dagger.Binds
import dagger.Module

/**
 * ViewModel Dependency Injection
 */
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideVideoRepository(videoRepositoryImpl: VideoRepositoryImpl) : VideoRepository
    /*
    @Provides
    fun provideVideoRepository(database: NDatabase, dao: VideoDao): VideoRepository
            = VideoRepository(database, dao)
    */

    @Binds
    abstract fun provideTagRepository(tagRepositoryImpl: TagRepositoryImpl) : TagRepository
}