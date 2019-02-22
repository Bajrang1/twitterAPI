package com.twitte.twitter.repository;

import java.util.List;
import java.util.Optional;

import com.twitte.twitter.model.Block;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends CrudRepository<Block,Long> {

//
//    List<Block> findAllByUserId(Long userId);

    List<Block> findAllByFollowId(Long userId);

    Block findByUserId(Long userId);

    Block findByUserIdAndFollowId(Long userId, Long followId);
}
