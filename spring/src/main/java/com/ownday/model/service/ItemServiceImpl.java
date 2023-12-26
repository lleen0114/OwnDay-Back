package com.ownday.model.service;

import com.ownday.model.dto.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public void registItem(Item item) {

    }

    @Override
    public void deleteItem(int itemId) {

    }

    @Override
    public String getItemLocation(int itemId) {
        return null;
    }

    @Override
    public double getItemRating(int itemId) {
        return 0;
    }
}
