//package com.example.demo1;
//
//import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
//
//public class RedisCacheExample {
//    // Redis 服务器地址
//    private static final String HOST = "localhost";
//    // Redis 默认端口号
//    private static final int PORT = 6379;
//
//    public static void main(String[] args) {
//        // 创建 Jedis 实例
//        RedisProperties.Jedis jedis = new RedisProperties.Jedis(HOST, PORT);
//
//        try {
//            // 设置数据到缓存中
//            String cacheKey = "exampleKey";
//            String cacheValue = "exampleValue";
////            jedis.set(cacheKey, cacheValue);
//            System.out.println("数据已设置到缓存中");
//
//            // 从缓存中获取数据
//            String cachedData = jedis.getPool().toString();
//            if (cachedData != null) {
//                System.out.println("从缓存中获取的数据：" + cachedData);
//            } else {
//                System.out.println("缓存中不存在该数据");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // 关闭连接
//            if (jedis != null) {
//                jedis.close();
//            }
//        }
//    }
//}
