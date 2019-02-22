package com.twitte.twitter.controller;

import java.util.List;

import com.twitte.twitter.model.Twitt;
import com.twitte.twitter.service.TwittService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/twitt")
public class TwittController {
    private static final Logger logger = LoggerFactory.getLogger(TwittController.class);
    private final TwittService twittService;

    public TwittController(TwittService twittService) {
        this.twittService = twittService;
    }

    @PostMapping
    public Twitt write(@RequestBody Twitt twitt){
        return twittService.writeTwitt(twitt);
    }

    @GetMapping
    public List<Twitt> get(@RequestParam Long userId){
        return twittService.getTwitt(userId);
    }

    @GetMapping("/feed")
    public List<Twitt> get1(@RequestParam Long userId){
        return twittService.getfeed(userId);
    }
}
