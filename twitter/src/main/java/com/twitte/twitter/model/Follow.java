package com.twitte.twitter.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Data
@Getter
@Setter
@Entity
public class Follow {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dumyFollowID;

    private Long followId;
    private Long userId;

//    @Transient
//    List<User> userList;


}
