package com.example.demo.like.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class LikeEV implements Serializable {
	  private int like; // よいねの数
	  private int dislike; // よくないねの数

	  public LikeEV() {
	    like = 0;
	    dislike = 0;
	  }

}
