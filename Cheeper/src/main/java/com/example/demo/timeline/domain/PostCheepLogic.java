package com.example.demo.timeline.domain;

import java.util.List;

public class PostCheepLogic {
  public void execute(Cheep mutter, List<Cheep> mutterList) {
    mutterList.add(0, mutter);
  }
}