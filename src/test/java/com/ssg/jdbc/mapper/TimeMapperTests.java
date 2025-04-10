package com.ssg.jdbc.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) // Junit5버전에서 spring-test를 사용하기 위한 설정
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml") // 설정 정보 로딩
public class TimeMapperTests {
    @Autowired(required = false)
    private TimeMapper mapper;

    @Autowired(required = false)
    private TimeMapper2 mapper2;

    @Test
    public void mapperTest() {
        log.info(mapper.getTime());
    }

    @Test
    public void getNow(){
        log.info(mapper2.getNow());
    }

}
