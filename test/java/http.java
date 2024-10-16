package test.java;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class http {

    @Test
    public void simpleTest() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://jsonplaceholder.typicode.com/posts/1";
        String str = restTemplate.getForObject(url, String.class);
        System.out.println(str);
    }

}
