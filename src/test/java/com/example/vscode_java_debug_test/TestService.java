package com.example.vscode_java_debug_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.stereotype.Service;

/**
 * TestService component that will be injected into VscodeJavaDebugTestApplication.java file in test
 * dir
 */
@Service
public class TestService {

    @Autowired
    private TestRestTemplate testRestTemplate;

    public TestService() {
        System.out.print("nuldsfsfsfsfsfsfsfssfsfsl");
    }
}
