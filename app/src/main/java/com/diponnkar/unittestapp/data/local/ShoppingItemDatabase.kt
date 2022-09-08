package com.diponnkar.unittestapp.data.local


import androidx.room.Database
import androidx.room.RoomDatabase
import com.diponnkar.unittestapp.data.local.ShoppingDao
import com.diponnkar.unittestapp.data.local.ShoppingItem

@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingItemDatabase : RoomDatabase() {

    abstract fun shoppingDao(): ShoppingDao
}