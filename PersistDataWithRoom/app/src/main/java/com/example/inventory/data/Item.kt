package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")

// convert to data class using keyword data
data class Item(
    // Set the parameter autoGenerate to true so that Room generates an incrementing ID
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
