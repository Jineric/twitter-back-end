package com.jineric.twitter.repository;

import com.jineric.twitter.model.User;
import com.jineric.twitter.model.projections.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(excerptProjection = UserDetail.class)
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByOrderByFullNameAsc();
}
