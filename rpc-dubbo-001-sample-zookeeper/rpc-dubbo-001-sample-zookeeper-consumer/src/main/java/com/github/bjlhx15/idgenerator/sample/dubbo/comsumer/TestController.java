package com.github.bjlhx15.idgenerator.sample.dubbo.comsumer;

import com.github.bjlhx15.idgenerator.sample.dubbo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ITestService iTestService;

    @GetMapping("get")
    public String get() {
        return iTestService.get();
    }
}
