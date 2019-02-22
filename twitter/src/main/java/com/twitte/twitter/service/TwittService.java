package com.twitte.twitter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.twitte.twitter.model.Block;
import com.twitte.twitter.model.Follow;
import com.twitte.twitter.model.Twitt;
import com.twitte.twitter.repository.BlockRepository;
import com.twitte.twitter.repository.FollowRepository;
import com.twitte.twitter.repository.TwittRepository;

import org.springframework.stereotype.Service;

@Service
public class TwittService {
    private final TwittRepository twittRepository;
    private final FollowRepository followRepository;
    private final BlockRepository blockRepository;

    public TwittService(TwittRepository twittRepository,
                        FollowRepository followRepository,
                        BlockRepository blockRepository) {
        this.twittRepository = twittRepository;
        this.followRepository = followRepository;
        this.blockRepository = blockRepository;
    }

    public Twitt writeTwitt(Twitt twitt) {
        return twittRepository.save(twitt);
    }

    public List<Twitt> getTwitt(Long userId) {

       List<Twitt> req=twittRepository.findAllByUserId(userId);

       return req;
    }

    public List<Twitt> getfeed(Long userId) {
        List<Follow> followList=followRepository.findAllByFollowId(userId);
//        List<Twitt> request=twittRepository.findAllByUserId(userId);
        //List<Block> blockList=blockRepository.findAllByFollowId(userId);
        ArrayList datareq=new ArrayList();
//        for(Follow req:followList){
//            for(Block req2:blockList) {
//                        if (req2.getUserId().equals(req.getUserId())) {
//                            continue;
//                        }else{
////                            Follow follow = followRepository.findAllByFollowId(userId).get(0);
//                            List<Twitt> req1 = twittRepository.findAllByUserId(req.getUserId());
//                            datareq.add(req1);
//                        }
//                    }
//        }
        for(Follow req:followList){

            Block block = blockRepository.findByUserIdAndFollowId(req.getUserId(), req.getFollowId());
            if (block == null){
                List<Twitt> req1 = twittRepository.findAllByUserId(req.getUserId());
                 datareq.add(req1);
            }

        }
        return datareq;
    }
}
