package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
data class PairingDataCloud(
    val ciphertext: String = "",
    val iv: String = "",
    val authTag: String = "",
    val serverKey: String = "'",
    val deviceUrn: String = ""
)