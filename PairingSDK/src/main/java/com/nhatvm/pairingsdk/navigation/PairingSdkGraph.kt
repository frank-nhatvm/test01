package com.nhatvm.pairingsdk.navigation

import androidx.annotation.Keep
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.nhatvm.core.pairing.CoreSDK
import com.nhatvm.pairingsdk.ui.PairingViewModel
import com.nhatvm.pairingsdk.ui.bluetooth.BluetoothScreen
import com.nhatvm.pairingsdk.ui.wifi.WifiScreen

@Keep
fun NavGraphBuilder.namiPairingGraph(
    navController: NavController,
    onPairSuccess: () -> Unit
) {
    val pairingViewModel = PairingViewModel(CoreSDK.getInstance())

    navigation(route = "namipairing", startDestination = "pairing/bluetooth") {

        composable("pairing/bluetooth") {
            BluetoothScreen(onScanSuccess = {
                navController.navigate("pairing/wifiscan")
            }, onScanFail = {

            }, pairingViewModel = pairingViewModel)
        }
        composable("pairing/wifiscan") {
            WifiScreen(onPairSuccess = onPairSuccess, pairingViewModel = pairingViewModel)
        }
    }

}