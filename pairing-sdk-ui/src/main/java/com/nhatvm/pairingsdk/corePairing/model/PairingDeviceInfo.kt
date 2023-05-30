package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
data class PairingDeviceInfo(
    val deviceUrn: String = "",
    val deviceHost: String = "",
    val devicePort: Int = 0
)