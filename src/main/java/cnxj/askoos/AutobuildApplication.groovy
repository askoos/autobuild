package cnxj.askoos

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration// 配置控制
@ComponentScan// 组件扫描
@EnableAutoConfiguration// 启用自动配置
class AutobuildApplication {

    static void main(String[] args) {
        SpringApplication.run AutobuildApplication, args
    }

}
