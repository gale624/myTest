package chao.he.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello World!");
        }
        return "hahaha";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }


}
