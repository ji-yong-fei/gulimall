package com.atguigu.gulimall.search;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.atguigu.gulimall.search.config.GulimallElasticSearchConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallSearchApplicationTests {

    @Autowired
    private RestHighLevelClient client;

    @Test
    public void contextLoads() {
        System.out.println(client);
        User user = new User();
        user.setAge(11);
        user.setName("xiaoming");
        System.out.println("----------->>>>>" + JSON.toJSONString(user));
    }

    @Test
    public void indexData() throws IOException {
        System.out.println(client);
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");

        User user = new User();
        user.setAge(11);
        user.setName("xiaoming");
        String toJSONString = JSON.toJSONString(user);
        indexRequest.source(toJSONString, XContentType.JSON);
        IndexResponse index = client.index(indexRequest, GulimallElasticSearchConfig.COMMON_OPTIONS);
        System.out.println("----------->>>>>" + JSON.toJSONString(user));
        System.out.println(index);
    }


}


@Data
class User {
    private int age;
    private String name;
}
