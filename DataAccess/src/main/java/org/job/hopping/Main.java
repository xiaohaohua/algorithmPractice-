package org.job.hopping;

import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("服务正在运行" + jedis.ping());
        System.out.println("get mykey: " + jedis.get("mykey"));
        System.out.println("Hello world!");
    }
}