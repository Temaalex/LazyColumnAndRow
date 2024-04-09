package com.example.lazycolumnandrow;

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CardOne(dataClass: DataClass) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = dataClass.imageId),
                contentDescription = "Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .padding(3.dp)
            )
            Text(text = dataClass.title)
    }
}

@Composable
fun CardTwo(dataClass: DataClass) {
    var isExpanded by remember {
        mutableStateOf( false)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = dataClass.imageId),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .padding(3.dp)
        )
        Column(
            modifier = Modifier
                .padding(top = 10.dp)
        ) {
            Text(text = dataClass.title)
            Text(
                modifier = Modifier.clickable {
                    isExpanded = !isExpanded
                }, maxLines = if(isExpanded) Int.MAX_VALUE else 1,
                text = dataClass.content)
        }
    }
}