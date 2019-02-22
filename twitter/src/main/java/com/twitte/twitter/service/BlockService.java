package com.twitte.twitter.service;

import com.twitte.twitter.model.Block;
import com.twitte.twitter.repository.BlockRepository;

import org.springframework.stereotype.Service;

@Service
public class BlockService {
    private final BlockRepository blockRepository;

    public BlockService(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    public Block blockfollower(Block block) {
        return blockRepository.save(block);
    }
}
