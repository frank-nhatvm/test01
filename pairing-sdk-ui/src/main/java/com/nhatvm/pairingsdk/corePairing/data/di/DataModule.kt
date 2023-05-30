package com.nhatvm.pairingsdk.corePairing.data.di

import com.nhatvm.pairingsdk.corePairing.data.repositories.PlaceRepository
import com.nhatvm.pairingsdk.corePairing.data.repositories.PlaceRepositoryImpl


object DataModule {

    fun getPlaceRepository(): PlaceRepository {
        return PlaceRepositoryImpl()
    }

}