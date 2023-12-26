package com.ownday.model.dto;

import lombok.Data;

@Data
public class Chat {
    private Integer chatId;
    private String chatContent;
    private Integer chatWho;
    private String chatTime;
    private int itemId;
    private String userId;
}
