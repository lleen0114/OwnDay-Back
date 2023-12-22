package service.ownday.spring.model.dto;

import lombok.Data;

@Data
public class Request {
    private String requestId;
    private String receiverId;
    private String itemRentalPeriod;
}
