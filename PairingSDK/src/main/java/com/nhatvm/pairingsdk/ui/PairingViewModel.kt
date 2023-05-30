package com.nhatvm.pairingsdk.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nhatvm.core.pairing.model.PairingState
import com.nhatvm.core.pairing.pairing.CorePairing
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PairingViewModel constructor(private val corePairing: CorePairing): ViewModel() {

    val pairingState: StateFlow<PairingState>
    get() = corePairing.pairingState

//    private suspend fun observeCorePairingState() {
//        corePairing.pairingState.collect { coreState ->
//            when (coreState) {
//                PairingState.ScanningBluetooth -> {
//
//                }
//                is PairingState.ScanningBluetoothFail -> {
//
//                }
//                PairingState.ScanBluetoothSuccess -> {
//
//                }
//                else -> {
//
//                }
//            }
//        }
//    }

    fun prepareForPairing() {
        viewModelScope.launch {
            corePairing.init(accessToken = "", refreshToken = "", apiKey = "")
        }
    }

    fun startPairing() {
        viewModelScope.launch {

//            observeCorePairingState()

            corePairing.startPairing(placeId = "", zoneId = "", roomId = "",savedWifiNetworks = null)
        }
    }

}