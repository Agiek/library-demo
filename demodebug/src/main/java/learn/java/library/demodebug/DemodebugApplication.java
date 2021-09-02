package learn.java.library.demodebug;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan("learn.java.library.mapper")
public class DemodebugApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemodebugApplication.class, args);
    }

}
