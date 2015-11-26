package cnxj.askoos.controller

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Askoos on 2015/11/25.
 */
// @EnableAutoConfiguration
@RestController
@RequestMapping("/hello")
class HelloController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello() {
        "Hello Askoos!"
    }

    static void main(String[] args) {
        SpringApplication.run HelloController, args
    }

}
