package com.smile.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {

    @Test
    public void testRedis(){
        Jedis jedis=new Jedis("localhost",6379);
        jedis.auth("123456");
        jedis.set("username","xiaoming");

        Set<String> keys= jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
        jedis.close();

    }
}
