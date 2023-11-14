package com.example.inventory.data

import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository(private val itemDao: ItemDao) : ItemsRepository {
    // override getAllItem
    override fun getAllItemsStream(): Flow<List<Item>> = itemDao.getAllItems()

    // override getItem
    override fun getItemStream(id: Int): Flow<Item?> = itemDao.getItem(id)

    // override insertItem
    override suspend fun insertItem(item: Item) = itemDao.insert(item)

    // override deleteItem
    override suspend fun deleteItem(item: Item) = itemDao.delete(item)

    // override updateItem
    override suspend fun updateItem(item: Item) = itemDao.update(item)
}
