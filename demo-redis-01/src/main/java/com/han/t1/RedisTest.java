package com.han.t1;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

/**
 * @author blueSky
 * @create 05-16 20:01
 */
@Slf4j
public class RedisTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost", 6379);
		jedis.set("name", "tom");
		jedis.setnx("name", "jerry");
		log.info(jedis.get("name"));
		System.out.println(jedis.get("A"));
		System.out.println(jedis.ping());
		jedis.close();

	}
}
