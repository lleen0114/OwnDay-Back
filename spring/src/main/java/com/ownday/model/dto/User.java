package com.ownday.model.dto;

import lombok.*;
import org.springframework.stereotype.Repository;

@Getter @Setter
@AllArgsConstructor
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String userNickname;
    private String userImage;
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userNickName='" + userNickname + '\'' +
                ", userImage='" + userImage + '\'' +
                '}';
    }
}
