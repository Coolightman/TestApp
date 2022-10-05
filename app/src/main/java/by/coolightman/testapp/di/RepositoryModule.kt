package by.coolightman.testapp.di

import by.coolightman.testapp.data.repository.PostRepositoryImpl
import by.coolightman.testapp.data.repository.UserRepositoryImpl
import by.coolightman.testapp.domain.repository.PostRepository
import by.coolightman.testapp.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun provideUserRepository(impl: UserRepositoryImpl): UserRepository

    @Binds
    @Singleton
    fun providePostRepository(impl: PostRepositoryImpl): PostRepository
}