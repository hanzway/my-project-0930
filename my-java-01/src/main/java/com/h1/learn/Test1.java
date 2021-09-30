package com.h1.learn;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Test1
 * @Description TODO
 * @Date 2021/9/30 20:32
 * @Created by qingwei.han
 */
@Slf4j
public class Test1 {
	// 方法的重载
	public static void sum(int num1, int num2){
		log.info("num1 = {},num2 = {}", num1, num2);
		System.out.println(num1 + num2);
	}

	public static void sum(short num1, short num2){
		System.out.println(num1 + num2);
	}

	public static void sum(int num1, short num2){
		System.out.println(num1 + num2);
	}

	public static void sum(short num1, int num2){
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {

		Test1.sum(100, 100);
	}
}
