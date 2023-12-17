package com.satyajit.data.module


import com.satyajit.data.apiservice.ApiService
import com.satyajit.di.qualifier.AppBaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiServiceModule {
    @Provides
    @Singleton
    fun provideApiService(@AppBaseUrl retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}