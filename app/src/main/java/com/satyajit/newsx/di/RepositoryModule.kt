package com.satyajit.newsx.di

import com.satyajit.data.repoimpl.GithubRepoImpl
import com.satyajit.domain.repository.GithubRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule{

    @Binds
    fun bindGithubRepository(githubRepoImpl: GithubRepoImpl): GithubRepository

}