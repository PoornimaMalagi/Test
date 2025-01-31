package com.mav.reviews.service;

import com.mav.reviews.dto.Ratings;
import com.mav.reviews.dto.Reviews;
import com.mav.reviews.service.client.RatingsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {

    @Autowired
    private RatingsFeignClient rfc;

  public Reviews getReviews(String version){
      Reviews review = new Reviews();
      review.setComment("[Good one,for budding entrepreneurs.]");
      if(version.equalsIgnoreCase("V2")){
          Ratings rating = rfc.getRatings();
          review.setColor("Black");
          review.setRating(rating.getRating());
      }else if(version.equalsIgnoreCase("V3")){
          Ratings rating = rfc.getRatings();
          review.setColor("Red");
          review.setRating(rating.getRating());
      }

      return review;

  }
}
