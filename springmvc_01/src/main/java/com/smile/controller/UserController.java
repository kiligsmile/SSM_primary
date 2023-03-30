package com.smile.controller;

import com.smile.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
//    @RequestMapping("/commonParam")
//    @ResponseBody
//    public String commonParam(@RequestParam("name") String userName, String age){
//        System.out.println("普通参数传递 name==> "+userName);
//        System.out.println("普通参数传递 age==> "+age);
//        return "{'module':'commonParam'}";
//    }

//    @RequestMapping("/pojoParam")
//    @ResponseBody
//    public String pojoParam(User user){
//        System.out.println("pojo参数传递 user ==> "+user);
//        return "{'module':'pojo param'}";
//    }

//    @RequestMapping("/listParamForJson")
//    @ResponseBody
//    public String listParamForJson(@RequestBody User user){
//        System.out.println("集合参数传递 like ==> "+ user.toString());
//        return "{'module':'list param'}";
//    }

//    @RequestMapping("/listParamForJson")
//    @ResponseBody
//    public String listParamForJson(@RequestBody List<User> list){
//        System.out.println("集合参数传递 like ==> "+list);
//        return "{'module':'list param'}";
//    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save1'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Integer userId) {
        System.out.println("user delete..." + userId);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById..." + id);
        return "{'module':'user getById'}";
    }

    @RequestMapping("/findAll")
    @ResponseBody public String getAll() {
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }

}
