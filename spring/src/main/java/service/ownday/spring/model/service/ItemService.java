package service.ownday.spring.model.service;

import service.ownday.spring.model.dto.Item;

public interface ItemService {
    //1. 아이템 객체를 받아서 새롭게 대여할 아이템 등록하기
    public void registItem(Item item);

    //2. 아이템 id로 등록된 아이템 삭제하기
    public void deleteItem(int itemId);

    //3. 아이템 id로 대여 위치 반환하기
    public String getItemLocation(int itemId);

    //4. 아이템 id로 아이템 별점 가져오기
    public double getItemRating(int itemId);
}
