package com.h1.learn;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname TheFebo
 * @Description TODO
 * @Date 2021/9/30 21:33
 * @Created by qingwei.han
 */
@Slf4j
public class TheFebo {
	// 计算第N个的斐波那契序列
	public static void main(String[] args) {
		// 1, 1, 2, 3, 5
		log.info(String.valueOf(banana(20)));
	}

	public static int banana(int n){
		if (n == 1 || n == 2){
			return 1;
		}
		return banana(n - 1) + banana(n - 2);
	}

}
