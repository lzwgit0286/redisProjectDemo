import redis.clients.jedis.Jedis;

public class jedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.auth("abc123");
        jedis.set("test", "hello jedis");
        System.out.println(jedis.get("test"));
    }
}
