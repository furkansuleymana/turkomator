package com.fuka.turkomator.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.fuka.turkomator.ui.values.Elevations
import com.fuka.turkomator.ui.values.Paddings

class Word {

    @Composable
    fun Boxer(shape: Shape) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(shape)
            )
        }
    }

    @Composable
    fun WordItem() {
        MaterialTheme {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Paddings().cardPadding),
                elevation = Elevations().cardElevation
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(Paddings().cardPadding)
                        .size(48.dp),
                ) {
                    Box {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) { Text(text = "I.") }
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(start = 15.dp),
                            Arrangement.Center
                        ) {
                            Text(text = "çay")
                            Text(text = "Çince")
                        }
                    }
                }
            }
        }
    }
}
