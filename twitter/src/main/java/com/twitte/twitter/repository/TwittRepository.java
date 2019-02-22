package com.twitte.twitter.repository;

import java.util.List;

import com.twitte.twitter.model.Twitt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwittRepository extends CrudRepository<Twitt,Long> {

    List<Twitt> findAllByUserId(Long foloowId);
}
