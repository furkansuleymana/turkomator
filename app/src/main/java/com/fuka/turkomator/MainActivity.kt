package com.fuka.turkomator

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.fuka.turkomator.ui.components.Word
import com.fuka.turkomator.ui.theme.TurkomatorTheme
import com.fuka.turkomator.util.GetWord
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TurkomatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    // Test()
                    Word().WordItem()
                }
            }
        }
    }
}

@Composable
fun Test() {
    val scope = rememberCoroutineScope()
    Button(onClick = {
        scope.launch {
            val word = GetWord("çay").invoke().toString()
            Log.e("GetWord", word)
        }
    }
    ) {}
}
