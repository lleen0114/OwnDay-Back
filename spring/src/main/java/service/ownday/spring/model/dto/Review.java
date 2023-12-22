package service.ownday.spring.model.dto;

import lombok.Data;

@Data
public class Review {
    private String reviewId;
    private String itemId;
    private String userID;
    private float rating;
    private String reviewRegDate;
}
