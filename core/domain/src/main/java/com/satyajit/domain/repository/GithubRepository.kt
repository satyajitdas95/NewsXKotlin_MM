package com.satyajit.domain.repository

import com.satyajit.domain.usecase.ProfileUseCase
import com.satyajit.domain.usecase.RepoListUseCase
import com.satyajit.entity.ProfileEntity
import com.satyajit.entity.RepoItemEntity
import kotlinx.coroutines.flow.Flow
import com.satyajit.domain.utils.Result


interface GithubRepository {
    suspend fun fetchRepoList(params: RepoListUseCase.Params): Flow<Result<List<RepoItemEntity>>>
    suspend fun fetchProfile(params: ProfileUseCase.Params):Flow<Result<ProfileEntity>>
}