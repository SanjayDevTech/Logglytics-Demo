package com.sample.logglyticsdemo

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun DemoAppBar() {
    TopAppBar(title = {
        Text(stringResource(id = R.string.app_name))
    })
}