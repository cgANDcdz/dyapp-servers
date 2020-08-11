package org.icg.dyapp.mail.controller;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.icg.dyapp.mail.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MailController.class);


    /**
     * 接受发送验证码的请求,调用自己的QQ邮箱发送验证码
     * @param code
     */
    @RequestMapping(value = "/vertify",method = RequestMethod.GET)
    public void vertify(@RequestParam("email") String email, @RequestParam("code") String code){
        Boolean success=this.mailService.sendVertifyCode(email,code);
        if(success){
            LOGGER.info("邮件系统发送邮件成功,email="+email+" code="+code);
        }else{
            LOGGER.info("邮件系统发送邮件失败,email="+email+" code="+code);
        }
    }

}
