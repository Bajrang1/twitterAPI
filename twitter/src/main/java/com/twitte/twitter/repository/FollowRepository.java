package com.twitte.twitter.repository;

import java.util.List;

import com.twitte.twitter.model.Follow;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowRepository extends CrudRepository<Follow,Long> {


    List<Follow> findAllByFollowId(Long userId);

//    List<Follow> findAllByUserId(Long userId);
}
