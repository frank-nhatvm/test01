package com.nhatvm.pairingsdk.corePairing

import androidx.annotation.Keep
import com.nhatvm.pairingsdk.corePairing.data.di.DataModule
import com.nhatvm.pairingsdk.corePairing.pairing.CorePairing
import com.nhatvm.pairingsdk.corePairing.pairing.di.PairingModule


@Keep
object CoreSDK{
    fun getInstance(): CorePairing {
        return CorePairing(
            pairingService = PairingModule.getPairingService(),
            placeRepository = DataModule.getPlaceRepository()
        )
    }
}