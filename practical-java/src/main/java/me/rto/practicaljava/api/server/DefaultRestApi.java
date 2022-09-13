package me.rto.practicaljava.api.server;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

    private Logger logger = LoggerFactory.getLogger(DefaultRestApi.class);
    @RequestMapping(value = "/welcome")
    public String welcome(){
        logger.info(StringUtils.join("Hello", " this is", " Spring boot", " REST API"));
        return "Welcome to Spring Boot";
    }

    @RequestMapping(value = "/time")
    public String time() {
        return LocalTime.now().toString();
    }
}
