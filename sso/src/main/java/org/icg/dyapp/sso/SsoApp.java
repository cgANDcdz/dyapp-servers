package org.icg.dyapp.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
// 配置扫描路径
@ComponentScan(basePackages ="org.icg.dyapp.sso.*")
public class SsoApp {
    public static void main(String args[])
    {
        SpringApplication.run(SsoApp.class,args);

    }

}
