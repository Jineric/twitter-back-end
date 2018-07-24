package com.jineric.twitter.repository;

import com.jineric.twitter.model.Tweet;
import com.jineric.twitter.model.projections.TweetDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = TweetDetail.class)
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
