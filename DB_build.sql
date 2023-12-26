drop database if exists ownday;
create database ownday;

use ownday;

CREATE TABLE `user` (
  `user_id` varchar(45) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `user_password` varchar(45) NOT NULL,
  `user_nickname` varchar(45) NOT NULL,
  `user_image` varchar(45) DEFAULT 'none',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO user(user_id, user_name, user_password, user_nickname, user_image)
VALUES("ssafy", "김싸피", "1234", "싸피", "none");

CREATE TABLE `item` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `item_price` int NOT NULL,
  `item_explanation` varchar(200) NOT NULL,
  `item_location` varchar(45) NOT NULL,
  `item_rating` float DEFAULT '0',
  `user_id` varchar(45) NOT NULL,
  PRIMARY KEY (`item_id`),
  KEY `item_user_idx` (`user_id`),
  CONSTRAINT `item_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `item_calendar` (
  `calendar_id` int NOT NULL AUTO_INCREMENT,
  `calendar_start` date NOT NULL,
  `calendar_end` date NOT NULL,
  `item_id` int NOT NULL,
  `user_id` varchar(45) NOT NULL,
  PRIMARY KEY (`calendar_id`),
  KEY `item_id_idx` (`item_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `calendar_item` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `calendat_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `item_chat` (
  `chat_id` int NOT NULL AUTO_INCREMENT,
  `chat_content` varchar(200) NOT NULL,
  `chat_who` int NOT NULL,
  `chat_time` datetime NOT NULL,
  `item_id` int NOT NULL,
  `user_id` varchar(45) NOT NULL,
  PRIMARY KEY (`chat_id`),
  KEY `chat_item_idx` (`item_id`),
  KEY `chat_receiver_idx` (`user_id`),
  CONSTRAINT `chat_item` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `chat_receiver` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='채팅방 구성할때, item_id와 user_id가 같은 경우의 item_chat 정보만 잡아서 time 순서로 출력하면 된다. chat_who :   0-기버, 1-리시버';

CREATE TABLE `item_review` (
  `review_id` int NOT NULL AUTO_INCREMENT,
  `review_rating` float NOT NULL,
  `review_regdate` datetime NOT NULL,
  `item_id` int NOT NULL,
  `user_id` varchar(45) NOT NULL,
  PRIMARY KEY (`review_id`),
  KEY `item_id_idx` (`item_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `review_item` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `review_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select * from user;
