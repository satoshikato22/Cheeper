package com.example.demo.login.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	private String id;
	private String pass;
	private String user_name;
}
