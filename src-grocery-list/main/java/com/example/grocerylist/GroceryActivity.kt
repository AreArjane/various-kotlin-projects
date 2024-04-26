package com.example.grocerylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.ArrayAdapter


class GroceryActivity : AppCompatActivity() {
    private val groceryFunction = GrocerylistModel()
    private val itemsList = mutableListOf<String>()
    private val selectListToogle = HashSet<String>()
    private var selectedItem: String? = null

    private lateinit var edittext: EditText
    private lateinit var addButton: Button
    private lateinit var deleteButton: Button
    private lateinit var clearButton: Button
    private lateinit var itemListeUl: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery)

        edittext = findViewById<EditText>(R.id.input)
        addButton = findViewById<Button>(R.id.add)
        deleteButton = findViewById<Button>(R.id.delete)
        clearButton  = findViewById<Button>(R.id.clear)
        itemListeUl = findViewById<ListView>(R.id.itemList)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itemsList)
        itemListeUl.adapter = adapter


        itemListeUl.setOnItemClickListener {  parameter, view, index, id ->
            selectedItem = itemsList[index]

            if (selectListToogle.contains(selectedItem)) {
                selectListToogle.remove(selectedItem)
            } else {
                selectListToogle.add(selectedItem!!)
            }

            adapter.notifyDataSetChanged()

        }

        addButton.setOnClickListener {
            val valueinput = edittext.text.toString()
            if (valueinput.isNotEmpty()) {
                groceryFunction.addItems(valueinput)
                itemsList.add(valueinput)
                adapter.notifyDataSetChanged()
                }
            }

        deleteButton.setOnClickListener {
            val itemsToRemove = selectListToogle.toList()
            for(item in itemsToRemove) {
                groceryFunction.deleteItem(item)
                itemsList.remove(item)
            }

            itemListeUl.clearChoices()
            adapter.notifyDataSetChanged()
            selectListToogle.clear()
        }

        clearButton.setOnClickListener {
            groceryFunction.clearList()
            itemsList.clear()
            adapter.notifyDataSetChanged()

            }
        }
}



