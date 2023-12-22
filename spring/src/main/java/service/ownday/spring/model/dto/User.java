package service.ownday.spring.model.dto;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String userNickName;
    private String userImage;
}
