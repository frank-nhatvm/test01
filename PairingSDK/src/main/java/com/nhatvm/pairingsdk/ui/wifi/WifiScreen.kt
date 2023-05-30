package com.nhatvm.pairingsdk.ui.wifi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nhatvm.core.pairing.model.PairingState
import com.nhatvm.pairingsdk.ui.PairingViewModel

@Composable
fun WifiScreen(onPairSuccess: () -> Unit, pairingViewModel: PairingViewModel) {

    val pairingState by pairingViewModel.pairingState.collectAsState()

    if (pairingState == PairingState.PairingSuccess) {
        LaunchedEffect(key1 = Unit) {
            onPairSuccess()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Scanning Wifi",style = TextStyle(color = Color.Black, fontSize = 16.sp) )
    }

}