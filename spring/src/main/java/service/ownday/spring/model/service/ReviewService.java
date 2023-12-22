package service.ownday.spring.model.service;

import service.ownday.spring.model.dto.Review;

import java.util.List;

public interface ReviewService {
    //1. 리뷰 등록하기

    //2. 리뷰 삭제하기

    //3. 아이템 id로 리뷰 리스트 가져오기
    List<Review> getReviewByUserId(String itemId);
}
