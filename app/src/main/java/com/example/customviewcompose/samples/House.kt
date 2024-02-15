package com.example.customviewcompose.samples

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun House() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(colors = listOf(Color.Magenta, Color.Blue)))
    ) {
        drawPath(
            path = Path().apply {
                moveTo(100.dp.toPx(), 300.dp.toPx())
                lineTo(100.dp.toPx(), 500.dp.toPx())
                lineTo(300.dp.toPx(), 500.dp.toPx())
                lineTo(300.dp.toPx(), 300.dp.toPx())
                lineTo(200.dp.toPx(), 200.dp.toPx())
                lineTo(100.dp.toPx(), 300.dp.toPx())
                lineTo(300.dp.toPx(), 300.dp.toPx())
                moveTo(150.dp.toPx(), 350.dp.toPx())
                lineTo(250.dp.toPx(), 350.dp.toPx())
                lineTo(250.dp.toPx(), 450.dp.toPx())
                lineTo(150.dp.toPx(), 450.dp.toPx())
                lineTo(150.dp.toPx(), 350.dp.toPx())
                moveTo(200.dp.toPx(), 350.dp.toPx())
                lineTo(200.dp.toPx(), 450.dp.toPx())
                moveTo(150.dp.toPx(), 400.dp.toPx())
                lineTo(250.dp.toPx(), 400.dp.toPx())
            },
            color = Color.White,
            style = Stroke(width = 4.dp.toPx())
        )
    }
}