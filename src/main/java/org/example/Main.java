package org.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try(var jedisPool = new JedisPool("127.0.0.1", 6369)) {
            try(Jedis jedis = jedisPool.getResource()) {
/*                jedis.set("users:500:email", "gg@gmail.com");

                Pipeline pipeline = jedis.pipelined();
                pipeline.set("users:400:email", "bbb@gmail.com");
                pipeline.set("users:400:name", "gre");
                pipeline.set("users:400:age", "15");
                List<Object> objects = pipeline.syncAndReturnAll();


                // list
                // stack
                jedis.rpush("stack1", "aaa");
                jedis.rpush("stack1", "bbb");
                jedis.rpush("stack1", "ccc");

                List<String> stacks = jedis.lrange("stack1", 0, -1);

                System.out.println(jedis.rpop("stack1"));
                System.out.println(jedis.rpop("stack1"));
                System.out.println(jedis.rpop("stack1"));

                // queqe
                jedis.rpush("queqe1", "aaa");
                jedis.rpush("queqe1", "bbb");
                jedis.rpush("queqe1", "ccc");

                System.out.println(jedis.lpop("queqe1"));
                System.out.println(jedis.lpop("queqe1"));
                System.out.println(jedis.lpop("queqe1"));*/

                // block
                //jedis.blpop(10, "queuqe:blocking");

                // Set

            }
        }
    }
}