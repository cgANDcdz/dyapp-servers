package org.icg.dyapp.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String EMAIL_SENDER;


    /**
     * 根据登录系统的请求,发送验证码
     *
     * @param from
     * @param to
     * @param cc
     * @param subject
     * @param content
     */
    public Boolean sendVertifyCode(String email, String code) {
        try {
            SimpleMailMessage simpMsg = new SimpleMailMessage();
            //邮件发送方 => 自己的QQ邮箱
            simpMsg.setFrom(this.EMAIL_SENDER);
            // 邮件接受方
            simpMsg.setTo(email);

            //simpMsg.setCc(cc);

            simpMsg.setSubject("dyapp项目 => 验证消息");
            simpMsg.setText("欢迎体验dyapp项目,您的验证码是:" + code + ",有效时间120s");
            this.javaMailSender.send(simpMsg);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
