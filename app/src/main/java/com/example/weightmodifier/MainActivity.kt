package com.example.weightmodifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weightmodifier.components.WeightModifierExampleOne
import com.example.weightmodifier.components.WeightModifierExampleThree
import com.example.weightmodifier.components.WeightModifierExampleTwo
import com.example.weightmodifier.ui.theme.WeightModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeightModifierTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //WeightModifierExampleOne()
                    //WeightModifierExampleTwo()
                    WeightModifierExampleThree()
                }
            }
        }
    }
}