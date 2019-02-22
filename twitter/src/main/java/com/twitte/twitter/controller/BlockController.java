package com.twitte.twitter.controller;

import com.twitte.twitter.model.Block;
import com.twitte.twitter.service.BlockService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/block")
public class BlockController {
    private static final Logger logger = LoggerFactory.getLogger(BlockController.class);

    private final BlockService blockService;

    public BlockController(BlockService blockService) {
        this.blockService = blockService;
    }

    @PostMapping
    public Block getBlock(@RequestBody Block block){
        return blockService.blockfollower(block);
    }
}
