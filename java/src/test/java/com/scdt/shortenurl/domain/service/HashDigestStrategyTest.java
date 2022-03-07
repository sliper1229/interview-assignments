package com.scdt.shortenurl.domain.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description
 * @Author chenlipeng
 * @Date 2022/3/6 9:19 下午
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class HashDigestStrategyTest {

    @Resource(name = "hashDigestStrategy")
    private ShortenUrlStrategy shortenUrlStrategy;

    @Test
    public void testGenShortUrl() {
        String url = "www.baidu.com";
        String shortUrl = shortenUrlStrategy.genShortUrl(url);
        Assert.assertEquals("qMnMze", shortUrl);
    }

}
