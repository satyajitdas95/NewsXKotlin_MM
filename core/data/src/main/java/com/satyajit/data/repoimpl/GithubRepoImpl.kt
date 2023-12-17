package com.satyajit.data.repoimpl

import com.satyajit.data.apiservice.ApiService
import com.satyajit.data.mapper.ProfileMapper
import com.satyajit.data.mapper.RepoListItemMapper
import com.satyajit.data.utils.NetworkBoundResource
import com.satyajit.data.utils.mapFromApiResponse
import com.satyajit.domain.repository.GithubRepository
import com.satyajit.domain.usecase.ProfileUseCase
import com.satyajit.domain.usecase.RepoListUseCase
import com.satyajit.domain.utils.Result
import com.satyajit.entity.ProfileEntity
import com.satyajit.entity.RepoItemEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResource,
    private val repositoryListItemMapper: RepoListItemMapper,
    private val profileMapper: ProfileMapper
):GithubRepository{

    override suspend fun fetchRepoList(params: RepoListUseCase.Params): Flow<Result<List<RepoItemEntity>>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchRepoList(params.userName)
            },repositoryListItemMapper
        )
    }

    override suspend fun fetchProfile(params: ProfileUseCase.Params): Flow<Result<ProfileEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchProfile(params.userName)
            },profileMapper
        )
    }

}