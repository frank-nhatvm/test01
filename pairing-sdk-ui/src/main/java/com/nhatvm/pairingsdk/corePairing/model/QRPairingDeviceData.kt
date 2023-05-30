package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
data class QRPairingDeviceData(
    val discriminator: String,
    val password: String
)