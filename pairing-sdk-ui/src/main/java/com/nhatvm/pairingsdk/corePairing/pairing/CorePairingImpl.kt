package com.nhatvm.pairingsdk.corePairing.pairing

import android.util.Log
import androidx.annotation.Keep
import com.nhatvm.pairingsdk.corePairing.data.repositories.PlaceRepository
import com.nhatvm.pairingsdk.corePairing.model.PairingState
import com.nhatvm.pairingsdk.corePairing.model.QRPairingDeviceData
import com.nhatvm.pairingsdk.corePairing.model.SavedWifiInfo
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Keep
class CorePairing constructor(
    private val pairingService: PairingService,
    private val placeRepository: PlaceRepository
) {

    private var _paringState = MutableStateFlow<PairingState>(PairingState.Default)

     val pairingState: StateFlow<PairingState>
        get() = _paringState

     suspend  fun init(accessToken: String, refreshToken: String, apiKey: String) {
        Log.e("Frank","CorePairingImpl init")
    }

     suspend  fun startPairing(
        placeId: String,
        zoneId: String,
        roomId: String,
        savedWifiNetworks: List<SavedWifiInfo>?
    ) {
        Log.e("Frank","CorePairingImpl startPairing")
        _paringState.value = PairingState.ScanningBluetooth
        val certificate = pairingService.getDeviceCertificate(qrPairingDeviceData = QRPairingDeviceData(discriminator = "", password = ""))
        _paringState.value = PairingState.ScanBluetoothSuccess
        if(certificate?.isNotEmpty() == true) {
            delay(2000L)
            _paringState.value = PairingState.ScanningWifiNetwork
            placeRepository.getDevicePairingChallenge(certificate = certificate)
            _paringState.value = PairingState.PairingSuccess
        }else{
            _paringState.value = PairingState.ScanningBluetoothFail(message = "Scanning fail")
        }

    }


}