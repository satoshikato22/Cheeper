package com.example.demo.timeline.domain;

import java.io.Serializable;

import lombok.Data;
@Data
public class Cheep implements Serializable {
  private String userName; // ユーザー名
  private String text; // つぶやき内容
  private int like; // よいねの数
  private int dislike; // よくないねの数

  public Cheep() {
    like = 0;
    dislike = 0;
  }
}
