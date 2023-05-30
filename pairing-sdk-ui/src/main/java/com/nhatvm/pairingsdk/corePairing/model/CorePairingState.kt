package com.nhatvm.pairingsdk.corePairing.model

import androidx.annotation.Keep

@Keep
sealed class CorePairingState
{
    @Keep
    object Default: CorePairingState()
    @Keep
    object Paired: CorePairingState()
}