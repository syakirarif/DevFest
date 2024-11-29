package com.syakirarif.devfest

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.syakirarif.devfest.ui.reply.ReplyApp
import com.syakirarif.devfest.ui.reply.ReplyHomeViewModel
import com.syakirarif.devfest.ui.theme.ReplyTheme
import kotlin.getValue


class MainActivity : ComponentActivity() {

    private val viewModel: ReplyHomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }

        setContent {
            //MySootheApp()

            ReplyTheme {
                val uiState by viewModel.uiState.collectAsStateWithLifecycle()
                ReplyApp(
                    replyHomeUIState = uiState,
                    onEmailClick = viewModel::setSelectedEmail
                )
            }
        }
    }
}
