package com.ccicnmg.certify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")//set the active profile to test
public class CertifyApplicationTests {

    @Test
    public void contextLoads() {
    }

}
