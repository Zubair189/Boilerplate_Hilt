package com.aregyan.github.views.userList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aregyan.github.repository.UserListRepository
import com.aregyan.github.views.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(
    private val userListRepository: UserListRepository
) : BaseViewModel() {

    val data = userListRepository.users

    init {
        viewModelScope.launch(Dispatchers.IO) {
            userListRepository.refreshUserList()
        }
    }

}