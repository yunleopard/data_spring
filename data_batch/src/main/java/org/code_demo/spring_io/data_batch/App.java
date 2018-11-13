package org.code_demo.spring_io.data_batch;

import org.code_demo.spring_io.data_com_service.MsgService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "org.code_demo.spring_io")
@RestController
public class App {

    private final MsgService myService;

    public App(MsgService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}