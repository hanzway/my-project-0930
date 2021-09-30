package com.h1.learn;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname TheRecursion
 * @Description TODO
 * @Date 2021/9/30 21:18
 * @Created by qingwei.han
 */

@Slf4j
public class TheRecursion {
	// 使用递归，求1到100的求和
	public static int getSum(int num){
		if(num == 1){
			return num;
		}
		return num + getSum(num -1);
	}

	public static void main(String[] args) {
//		System.out.println(TheRecursion.getSum(100));
		log.info(String.valueOf(TheRecursion.getSum(100)));
	}
}
