package com.fuka.turkomator.ui.values

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


class Cards {

    /*
    TODO: this doesn't work with the "content" variable.
    */
    @Composable
    fun WordCard(content: Unit) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Paddings().cardPadding),
            elevation = Elevations().cardElevation
        ) {
            content
        }
    }
}