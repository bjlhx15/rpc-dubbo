package com.github.bjlhx15.idgenerator.sample.dubbo.provider.service.impl;

import com.github.bjlhx15.idgenerator.sample.dubbo.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {
    public String get() {
        return "tests";
    }
}
