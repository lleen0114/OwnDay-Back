package service.ownday.spring.model.service;

import service.ownday.spring.model.dto.Review;

import java.util.List;

public interface ReviewService {
    //1. 리뷰 등록하기
    public void registReview(int reviewId);

    //2. 리뷰id로 리뷰 삭제하기
    public void deleteReview(int reviewId);

    //3. 아이템 id로 리뷰 리스트 가져오기
    public List<Review> getReviewByUserId(int itemId);

    //4. 아이템 id로 검색해서 해당 아이템에 대한 리뷰들의 평점값을 리스트로 반환한다.
    public List<Integer> getReviewRatingList(int itemId);

    //리뷰 평점을 등록하게 되면 아이템쪽에서 평균을 내야한다!! -> 이걸 어떻게 해결할 것인가??

    //리뷰페이지에서 별점을 등록을 할거임. 그러면 컨트롤러 단에서 해당 아이템에대한 리뷰의 별점 리스트를 가져온다음에 그것에 대한 평균을 내야겠네.
}
