package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
data class PairingWifiInfo(
    val ssid: String,
    val bssid: ByteArray?,
    val rssi: Int = 0
)