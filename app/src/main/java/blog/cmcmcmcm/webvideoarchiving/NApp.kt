package blog.cmcmcmcm.webvideoarchiving

import blog.cmcmcmcm.webvideoarchiving.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * https://android.jlelse.eu/new-android-injector-with-dagger-2-part-3-fe3924df6a89
 */
class NApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
        = DaggerAppComponent.builder().create(this)
    /* in AndroidInjector.Builder
    @Override
    public final AndroidInjector<T> create(T instance) {
        seedInstance(instance);
        return build();
    }
    */
}