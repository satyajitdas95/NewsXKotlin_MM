package com.satyajit.domain.usecase

import com.satyajit.domain.repository.GithubRepository
import com.satyajit.domain.utils.ApiUseCaseParams
import com.satyajit.domain.utils.Result
import com.satyajit.entity.RepoItemEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepoListUseCase @Inject constructor(
    private val repository: GithubRepository
):ApiUseCaseParams<RepoListUseCase.Params,List<RepoItemEntity>>{
    override suspend fun execute(params: Params): Flow<Result<List<RepoItemEntity>>> {
        return repository.fetchRepoList(params)
    }
    data class Params(val userName:String)
}