package cnxj.askoos.controller

import cnxj.askoos.model.Greeting
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Askoos on 2015/11/26.
 * 问候
 */
@RestController
@RequestMapping("/greeting02")
// @RestController，表明该类的每个方法返回对象而不是视图。它实际就是 @Controller 和 @ResponseBody 混合使用的简写方法。
class GreetingController02 {
    private final AtomicLong counter = new AtomicLong();

    /**
     * 说你好
     * @param username
     * @return
     * http://localhost:8080/greeting02/sayHello/Askoos
     */
    @RequestMapping("/sayHello/{username}")
    Greeting sayHello(@PathVariable("username") String username) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Hello %s!", username));
    }

    static void main(String[] args) {
        SpringApplication.run GreetingController02, args
    }

}
