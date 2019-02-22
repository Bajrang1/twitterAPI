package com.twitte.twitter.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class Twitt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long twittId;


    private Long userId;
    private String twitt;

//
//    @Transient
//    List<Follow> followList;
}
