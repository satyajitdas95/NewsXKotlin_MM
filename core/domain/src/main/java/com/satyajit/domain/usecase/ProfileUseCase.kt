package com.satyajit.domain.usecase

import com.satyajit.domain.repository.GithubRepository
import com.satyajit.domain.utils.ApiUseCaseParams
import com.satyajit.domain.utils.Result
import com.satyajit.entity.ProfileEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProfileUseCase @Inject constructor(
    private val repository: GithubRepository
) : ApiUseCaseParams<ProfileUseCase.Params, ProfileEntity> {
    data class Params(val userName: String)

    override suspend fun execute(params: Params): Flow<Result<ProfileEntity>> {
        return repository.fetchProfile(params)
    }
}