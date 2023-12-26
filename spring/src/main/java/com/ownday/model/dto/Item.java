package com.ownday.model.dto;

import lombok.Data;

@Data
public class Item {
    private String itemId;
    private String itemName;
    private String giverId;
    private int price;
    private String itemExplanation;
    private String location;
    private float rating;
    private String itemRentedPeriod;
}
