package com.example.demo.mutter.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class Mutter implements Serializable {
  private String userName; // ユーザー名
  private String text; // つぶやき内容

}
