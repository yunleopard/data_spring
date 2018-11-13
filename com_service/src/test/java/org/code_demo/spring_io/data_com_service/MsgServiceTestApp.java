package org.code_demo.spring_io.data_com_service;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Hello")
public class MsgServiceTestApp {

    @Autowired
    private MsgService msgService;

    @Test
    public void contextLoads() {
        assertThat(msgService.message()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}