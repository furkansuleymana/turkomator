package com.fuka.turkomator.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
                    .background(Color.Red)
            )
        }
    }

    @Composable
    fun WordItem() {
        MaterialTheme() {
            val border = BorderStroke(1.dp, Color.Green)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Paddings().cardPadding)
                    .background(Color(0xFFFF5722)),
                elevation = Elevations().cardElevation
            ) {

                Box(
                    modifier = Modifier

                        .fillMaxWidth()
                        .padding(Paddings().cardPadding)
                        .background(Color(0xFF8B8B8B))
                        .size(48.dp),

                    ) {

                    Box {
                        Box(
                            modifier = Modifier
                                .background(Color(0xFF914A62))
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center

                        ) { Text(text = "I.") }

                        Column(
                            modifier = Modifier
                                .padding(start = 15.dp)
                                .background(Color(0xFF213D49))
                                .fillMaxHeight(),
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
