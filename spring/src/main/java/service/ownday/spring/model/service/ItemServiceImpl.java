package service.ownday.spring.model.service;

import org.springframework.stereotype.Service;
import service.ownday.spring.model.dto.Item;

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
