package cnxj.askoos.controller

import cnxj.askoos.model.Greeting
import org.springframework.boot.SpringApplication;
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
class GreetingController02 {
    private final AtomicLong counter = new AtomicLong();

    /**
     * 说你好
     * @param username
     * @return
     * http://localhost:8080/greeting/sayHello?username=Askoos
     */
    @RequestMapping("/sayHello")
    @ResponseBody
    Greeting sayHello(
            @RequestParam(value = "username", required = false, defaultValue = "Aikmin") String username) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Hello %s!", username));
    }

    static void main(String[] args) {
        SpringApplication.run GreetingController02, args
    }

}
