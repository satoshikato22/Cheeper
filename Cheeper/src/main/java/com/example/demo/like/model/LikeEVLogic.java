package com.example.demo.like.model;

public class LikeEVLogic {
	public void like(LikeEV site) {
	    int count = site.getLike();
	    site.setLike(count + 1);
	  }

	  public void dislike(LikeEV site) {
	    int count = site.getDislike();
	    site.setDislike(count + 1);
	  }
}
