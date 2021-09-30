package com.h1.learn;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @Classname TheArguments
 * @Description TODO
 * @Date 2021/9/30 20:53
 * @Created by qingwei.han
 */
@Slf4j
public class TheArguments {

	public static void main(String[] args) {
//		if (args[0].equals("aa")){
//			log.info(TheArguments.sum(100, 200));
//		}
		// 静态导入
		log.info(String.valueOf(Math.PI));
		log.info(String.valueOf(new Random().nextDouble()));
	}

	public static String sum(double num1, double num2){

		return String.valueOf(num1 + num2);
	}
}
