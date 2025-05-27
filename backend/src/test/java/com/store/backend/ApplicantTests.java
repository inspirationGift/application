package com.store.backend;

import com.store.backend.config.TestPostgressConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(initializers = TestPostgressConfig.class)
class ApplicantTests {
    @Test
    void contextLoads() {
    }
}
