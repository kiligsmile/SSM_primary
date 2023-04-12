package com.smile;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@SpringBootTest
@RunWith(SpringRunner.class)
class SpringdataredisDemoApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void testString() {
		redisTemplate.opsForValue().set("city123","beijing");
		String value=(String) redisTemplate.opsForValue().get("city123");
		System.out.println(value);
		redisTemplate.opsForValue().set("key1","value1",10L, TimeUnit.SECONDS);
	}

	@Test
	void testHash(){
		HashOperations hashOperations=redisTemplate.opsForHash();
		hashOperations.put("002","name","xiaoming");
		hashOperations.put("002","age","20");
		hashOperations.put("002","address","beijing");

		String age=(String) hashOperations.get("002","age");
		System.out.println(age);

//		获得哈希结构中的所有字段
		Set keys=hashOperations.keys("002");
		for (Object key:keys){
			System.out.println(key);
		}
		
//		获得哈希结构中的所有值
		List list = hashOperations.values("002");
		for (Object value : list) {
			
		}
	}

	@Test
	void testList(){
		ListOperations listOperations= redisTemplate.opsForList();

		listOperations.leftPush("mylist","a");
		listOperations.leftPushAll("mylist","b","c","d");

		List<String> mylist =listOperations.range("mylist",0,-1);
		for (String value : mylist) {
			System.out.println(value);
		}

		Long size= listOperations.size("mylist");
		int len=size.intValue();
		for (int i = 0; i < len; i++) {
			String element=(String) listOperations.rightPop("mylist");
			System.out.println(element);
		}
	}

	@Test
	void testCommon(){
		Set<String> keys = redisTemplate.keys("*");
		for (Object key : keys) {
			System.out.println(key);
		}

		Boolean smile=redisTemplate.hasKey("smile");
		System.out.println(smile);

		Boolean delete = redisTemplate.delete("mylist");
		System.out.println(delete );

		DataType dataType = redisTemplate.type("002");
		System.out.println(dataType.name());
	}
}
