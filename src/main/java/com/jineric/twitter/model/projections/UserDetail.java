package com.jineric.twitter.model.projections;

import com.jineric.twitter.model.Tweet;
import com.jineric.twitter.model.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="userDetail", types={User.class})
public interface UserDetail {
    String getTwitterName();

    String getFullName();


    List<Tweet> getTweets();

    String getEmail();
}
