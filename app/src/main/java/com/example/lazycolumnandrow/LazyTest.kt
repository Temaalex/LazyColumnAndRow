package com.example.lazycolumnandrow;

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun LazyColumnTest() {
    LazyColumn(
        modifier = Modifier.fillMaxHeight()
    ) {
        itemsIndexed(
            listOf(
                DataClass((R.drawable.cat1), "Test 1", "Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1Test 1"),
                DataClass((R.drawable.cat2), "Test 2", "Test 2"),
                DataClass((R.drawable.cat3), "Test 3", "Test 2"),
                DataClass((R.drawable.cat4), "Test 4", "Test 2"),
                DataClass((R.drawable.cat5), "Test 5", "Test 2"),
                DataClass((R.drawable.cat6), "Test 6", "Test 2"),
                DataClass((R.drawable.cat7), "Test 7", "Test 2"),
                DataClass((R.drawable.cat8), "Test 8", "Test 2"),
                DataClass((R.drawable.cat9), "Test 9", "Test 2"),
                DataClass((R.drawable.cat10), "Test 10", "Test 2"),
            )
        ) { index, item ->
            CardTwo(dataClass = item)
        }
    }
}
@Composable
fun LazyRowTest() {
    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        itemsIndexed(
            listOf(
                DataClass((R.drawable.cat1), "Test 1", ""),
                DataClass((R.drawable.cat2), "Test 2", ""),
                DataClass((R.drawable.cat3), "Test 3", ""),
                DataClass((R.drawable.cat4), "Test 4", ""),
                DataClass((R.drawable.cat5), "Test 5", ""),
                DataClass((R.drawable.cat6), "Test 6", ""),
                DataClass((R.drawable.cat7), "Test 7", ""),
                DataClass((R.drawable.cat8), "Test 8", ""),
                DataClass((R.drawable.cat9), "Test 9", ""),
                DataClass((R.drawable.cat10), "Test 10", ""),
            )
        ) { index, item ->
            CardOne(dataClass = item)
        }
    }
}
