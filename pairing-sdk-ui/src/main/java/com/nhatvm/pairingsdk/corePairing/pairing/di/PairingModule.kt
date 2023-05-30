package com.nhatvm.pairingsdk.corePairing.pairing.di

import com.nhatvm.pairingsdk.corePairing.pairing.PairingService
import com.nhatvm.pairingsdk.corePairing.pairing.PairingServiceImpl

object PairingModule {

    fun getPairingService(): PairingService {
        return PairingServiceImpl()
    }

}