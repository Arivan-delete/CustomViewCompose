package com.example.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun CanvasTest() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        //H
        drawLine(
            color = Color.White,
            start = Offset(50.dp.toPx(), 25.dp.toPx()),
            end = Offset(50.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(50.dp.toPx(), 50.dp.toPx()),
            end = Offset(75.dp.toPx(), 50.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(75. dp.toPx(), 25.dp.toPx()),
            end = Offset(75.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )

        //E
        drawLine(
            color = Color.White,
            start = Offset(100.dp.toPx(), 25.dp.toPx()),
            end = Offset(100.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(100.dp.toPx(), 25.dp.toPx()),
            end = Offset(125.dp.toPx(), 25.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(100.dp.toPx(), 50.dp.toPx()),
            end = Offset(125.dp.toPx(), 50.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(100.dp.toPx(), 75.dp.toPx()),
            end = Offset(125.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )

        //L
        drawLine(
            color = Color.White,
            start = Offset(150.dp.toPx(), 25.dp.toPx()),
            end = Offset(150.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(150.dp.toPx(), 75.dp.toPx()),
            end = Offset(175.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )

        //L
        drawLine(
            color = Color.White,
            start = Offset(200.dp.toPx(), 25.dp.toPx()),
            end = Offset(200.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(200.dp.toPx(), 75.dp.toPx()),
            end = Offset(225.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )

        //O
        drawCircle(
            color = Color.White,
            radius = 25.dp.toPx(),
            center = Offset(275.dp.toPx(), 50.dp.toPx()),
            style = Stroke(width = 1.dp.toPx())
        )
    }
}