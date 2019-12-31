package com.example.demo.login.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	private String name;
	private String pass;
}
