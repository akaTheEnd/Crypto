package com.nikede.feature_coin_api.presentation.coin_detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import com.nikede.core_ui.ui.theme.spacing
import com.nikede.feature_coin_api.data.remote.dto.TeamMember

/**
 * View of the team list`s item
 *
 * @param teamMember member of the team
 * @param modifier modifier of the view
 */
@Composable
internal fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.h4
        )
        Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.body2,
            fontStyle = FontStyle.Italic
        )
    }
}