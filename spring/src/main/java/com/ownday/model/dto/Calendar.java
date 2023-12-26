package com.ownday.model.dto;

import lombok.Data;

@Data
public class Calendar {
    private String calendarId;
    private String itemId;
    private String rentStart;
    private String rentEnd;
}
