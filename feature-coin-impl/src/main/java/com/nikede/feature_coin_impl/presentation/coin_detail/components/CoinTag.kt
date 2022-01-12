package com.nikede.feature_coin_impl.presentation.coin_detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.nikede.core_ui.ui.theme.spacing

/**
 * View of a coin`s tag
 *
 * @param tag tag of the coin
 */
@Composable
internal fun CoinTag(
    tag: String
) {
    Box(
        modifier = Modifier
            .border(
                width = MaterialTheme.spacing.extraSmall,
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(MaterialTheme.spacing.extraLarge)
            )
            .padding(MaterialTheme.spacing.medium)
    ) {
        Text(
            text = tag,
            color = MaterialTheme.colors.primary,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body2
        )
    }
}