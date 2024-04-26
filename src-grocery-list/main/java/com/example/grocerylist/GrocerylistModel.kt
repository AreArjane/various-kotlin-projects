package com.example.grocerylist

class GrocerylistModel {
    private var index = 0
    private val itemsList = mutableListOf<String>()

    fun addItems(item: String) {
        itemsList.add(index, item)
        index++
    }

    fun deleteItem(item: String) {
        itemsList.remove(item)
    }

    fun clearList() {
        itemsList.clear()
    }
}