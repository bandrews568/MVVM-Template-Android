package com.kotlindaggermvvm.ui

/**
 * Used for state control for a view that makes a network call.
 *
 * Use the sealed class when you want to pass data with the state change.
 * Use the enum class when you just want to know that the state changed.
 */
sealed class NetworkingViewState {
    class Loading() : NetworkingViewState()
    class Success<T>(val item: T) : NetworkingViewState()
    class Error(val errorMessage: String?) : NetworkingViewState()
}

//enum class NetworkingViewState {
//    LOADING,
//    SUCCESS,
//    ERROR
//}