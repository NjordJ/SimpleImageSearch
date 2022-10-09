package com.iruda.simpleimagesearch.data

import com.iruda.simpleimagesearch.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(
    private val unsplashApi: UnsplashApi
) {

}