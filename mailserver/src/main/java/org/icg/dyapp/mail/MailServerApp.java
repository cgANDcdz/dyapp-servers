package org.icg.dyapp.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@EnableAutoConfiguration
// 配置扫描路径
@ComponentScan(basePackages ="org.icg.dyapp.mail.*")
public class MailServerApp {
    public static void main(String args[]){
        SpringApplication.run(MailServerApp.class,args);
    }
}
