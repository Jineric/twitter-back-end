package com.jineric.twitter.model.projections;

import com.jineric.twitter.model.Tweet;
import com.jineric.twitter.model.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="tweetDetail", types={Tweet.class})
public interface TweetDetail {
    String getMessage();

    Date getDate();

    User getUser();
}
