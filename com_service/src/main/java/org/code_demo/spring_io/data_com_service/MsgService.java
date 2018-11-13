package org.code_demo.spring_io.data_com_service;


import org.code_demo.spring_io.data_com_service.dto.ServiceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MsgService {

    private final ServiceProperties serviceProperties;

    public MsgService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }
}