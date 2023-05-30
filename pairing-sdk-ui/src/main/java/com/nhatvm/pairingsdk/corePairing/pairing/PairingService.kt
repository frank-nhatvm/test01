package com.nhatvm.pairingsdk.corePairing.pairing

import android.util.Log
import com.nhatvm.pairingsdk.corePairing.model.CorePairingState
import com.nhatvm.pairingsdk.corePairing.model.QRPairingDeviceData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface PairingService {

    val corePairingState: StateFlow<CorePairingState>

    suspend fun getDeviceCertificate(
        qrPairingDeviceData: QRPairingDeviceData,
        timeOut: Long? = null
    ): String?

    suspend fun challengeDevice(challenge: String, timeOut: Long? = null): String?
}

class PairingServiceImpl  constructor() : PairingService{

    private var _pairingState = MutableStateFlow<CorePairingState>(CorePairingState.Default)

    override val corePairingState: StateFlow<CorePairingState>
        get() = _pairingState

    override suspend fun getDeviceCertificate(
        qrPairingDeviceData: QRPairingDeviceData,
        timeOut: Long?
    ): String? {
        delay(2000L)
        Log.e("Frank","PairingServiceImpl getDeviceCertificate")
        return "device_certificate"
    }

    override suspend fun challengeDevice(challenge: String, timeOut: Long?): String? {
        delay(3000L)
        Log.e("Frank","PairingServiceImpl challengeDevice")
        return "challenge_device"
    }
}