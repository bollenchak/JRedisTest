package com.bollen.Redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * <p>Description: </p>
 * Author: zhaibolong
 * Date: 2016-01-29
 * Time: 14:14
 */
public class RedisClientTest {

    private RedisClient redisClient;

    @Before
    public void setUp() throws Exception {
        redisClient = new RedisClient();
    }

    @After
    public void tearDown() throws Exception {
        redisClient.closePools();
    }

    @Test
    public void testKeyOperate() throws Exception {
        redisClient.keyOperate();
    }

    @Test
    public void testStringOperate() throws Exception {
        redisClient.stringOperate();
    }

    @Test
    public void testListOperate() throws Exception {
        redisClient.listOperate();
    }

    @Test
    public void testSetOperate() throws Exception {
        redisClient.setOperate();
    }

    @Test
    public void testSortedSetOperate() throws Exception {
        redisClient.sortedSetOperate();
    }

    @Test
    public void testHashOperate() throws Exception {
        redisClient.hashOperate();
    }
}