package com.example.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

@SpringBootApplication
@EnableEurekaClient
public class GatwayApplication {

	public static void main(String[] args)  {
		SpringApplication.run(GatwayApplication.class, args);


}}
