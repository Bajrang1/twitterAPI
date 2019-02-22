package com.twitte.twitter.controller;

import com.twitte.twitter.model.Follow;
import com.twitte.twitter.service.FollowService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/follow")
public class FollowController {
    private static final Logger logger = LoggerFactory.getLogger(FollowController.class);

    private final FollowService followService;


    public FollowController(FollowService followService) {
        this.followService = followService;
    }

    @PostMapping
    public Follow follow(@RequestBody Follow follow){
        return  followService.followlink(follow);

    }
}
