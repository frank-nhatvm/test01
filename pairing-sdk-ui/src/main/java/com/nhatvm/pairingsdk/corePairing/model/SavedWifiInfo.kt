package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
data class SavedWifiInfo(
    val ssid:String,
    val password:String
)