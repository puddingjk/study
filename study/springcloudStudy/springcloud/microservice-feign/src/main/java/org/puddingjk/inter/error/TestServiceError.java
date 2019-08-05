package org.puddingjk.inter.error;

import org.puddingjk.inter.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceError implements TestService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
