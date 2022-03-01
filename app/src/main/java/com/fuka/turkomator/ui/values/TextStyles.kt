package com.fuka.turkomator.ui.values

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

class TextStyles {
    /*
    this is the header composable text.
    FontWeight.W900
    Color(0xFF4552B8)
    */
    @Composable
    fun Header(text: String) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.W900,
                        color = Color(0xFF4552B8)
                    )
                ) {
                    append(text)
                }
            }
        )
    }

    /*
    this is the paragraph composable text.
    Color(0xFF4552B8)
    */
    @Composable
    fun Paragraph(text: String) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color(0xFF000000)
                    )
                ) {
                    append(text)
                }
            }
        )
    }
}
