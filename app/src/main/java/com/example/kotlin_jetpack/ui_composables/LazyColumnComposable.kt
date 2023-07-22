package com.example.kotlin_jetpack.ui_composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LazyColumnComposable() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(count = 150) { item ->
            Text(text = "Hello world ${item + 1}")
        }
    }
}

@Composable
fun LazyColumnIndexedComposable() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        itemsIndexed(listOf("item 1", "item 2", "item 3")) { index, item ->
            Text(text = "Index -> $index , Item -> $item")
        }
    }
}