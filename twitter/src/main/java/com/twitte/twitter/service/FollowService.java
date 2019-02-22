package com.twitte.twitter.service;


import java.util.List;
import java.util.Optional;

import com.twitte.twitter.model.Follow;
import com.twitte.twitter.model.User;
import com.twitte.twitter.repository.FollowRepository;
import com.twitte.twitter.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class FollowService {
    private final FollowRepository followRepository;
    private final UserRepository userRepository;


    public FollowService(FollowRepository followRepository, UserRepository userRepository) {
        this.followRepository = followRepository;
        this.userRepository = userRepository;
    }

    public Follow followlink(Follow follow) {
        User req=userRepository.findById(follow.getUserId()).get();
                int followcount;
                followcount = req.getFollowers();
                followcount += 1;
                req.setFollowers(followcount);

                userRepository.save(req);
        return followRepository.save(follow);
    }
}
