package com.axiagroups.newsapplication.presentation.common

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight


/**
 * Created by Ahsan Habib on 5/15/2024.
 * shehanuk.ahsan@gmail.com
 */

@Composable
fun NewsButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White,
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
            )
    }
}

@Composable
fun NewsTextButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    ) {
    TextButton(onClick = onClick) {
        Text(
            text = text,
            color = Color.Blue,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)

        )
    }
    
}