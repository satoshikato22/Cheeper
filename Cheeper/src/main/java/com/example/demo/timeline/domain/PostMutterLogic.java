package com.example.demo.timeline.domain;

import java.util.List;

public class PostMutterLogic {
  public void execute(Mutter mutter, List<Mutter> mutterList) {
    mutterList.add(0, mutter);
  }
}