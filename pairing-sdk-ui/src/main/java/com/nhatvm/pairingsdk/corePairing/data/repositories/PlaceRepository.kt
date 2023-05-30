package com.nhatvm.pairingsdk.corePairing.data.repositories

import android.util.Log
import com.nhatvm.pairingsdk.corePairing.data.model.PairingDeviceChallengeData
import kotlinx.coroutines.delay


interface PlaceRepository {

    suspend fun getDevicePairingChallenge(certificate:String): PairingDeviceChallengeData

}

class PlaceRepositoryImpl constructor()  : PlaceRepository{

    override suspend fun getDevicePairingChallenge(certificate: String): PairingDeviceChallengeData {
        delay(3000L)
        Log.e("Frank","PlaceRepositoryImpl getDevicePairingChallenge")
        return PairingDeviceChallengeData(challenge = "fake")
    }

}