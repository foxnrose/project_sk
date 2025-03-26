package com.mc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ShopApplicationTests {

    @Test
    void contextLoads() {
        log.error("Error Message   {}", new RuntimeException());
        log.info("info Message   {}", new RuntimeException());
    }

}
