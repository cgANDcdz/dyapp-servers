package org.icg.dyapp.sso.controller;

import org.icg.dyapp.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam("email") String email,@RequestParam("password") String password){

        Boolean flag=this.userService.addUser(email,password);
        if(flag) return "成功";
        else return "失败";

    }

}
