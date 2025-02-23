package com.syakirarif.devfest.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerVertical(height: Int) {
    return Spacer(modifier = Modifier.height(height.dp))
}