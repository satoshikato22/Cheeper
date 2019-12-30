package com.example.demo.tweet.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	private String name;
	private String pass;
}
