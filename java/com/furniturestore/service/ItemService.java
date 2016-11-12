package com.furniturestore.service;

import com.furniturestore.model.Item;

import java.util.List;


public interface ItemService {

    List<Item> getItemList();

    Item getItemById(int id);

    void addItem(Item item);

    void editItem(Item item);

    void deleteItem(Item item);
}
