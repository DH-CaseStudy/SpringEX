package com.ssg.jdbc.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) // Junit5버전에서 spring-test를 사용하기 위한 설정
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml") // 설정 정보 로딩

public class SampleTests {
    @Autowired //해당 타입 bean이 존재하면 의존성을 주입요청하는 어노테이션
    private SampleService sampleService;

    @Test
    public void testService() {
        log.info("LOG INFO : " + sampleService);
        Assertions.assertNotNull(sampleService);
    }
}
