package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
sealed interface PairingState {
    @Keep
    object Default: PairingState
    @Keep
    object ScanningBluetooth: PairingState
    @Keep
    object ScanBluetoothSuccess: PairingState
    @Keep
    object ScanningWifiNetwork: PairingState
    @Keep
    object ConnectWifiSuccess: PairingState
    @Keep
    object PairingSuccess: PairingState
    @Keep
    data class ScanningBluetoothFail(val message:String): PairingState
}