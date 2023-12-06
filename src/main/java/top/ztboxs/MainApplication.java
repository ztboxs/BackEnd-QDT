package top.ztboxs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/05/22:28
 * @Description: 主类（项目启动入口）
 */
@SpringBootApplication
@MapperScan("top.ztboxs.*.mapper")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
