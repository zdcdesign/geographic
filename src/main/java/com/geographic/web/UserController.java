package com.geographic.web;

import com.geographic.entity.AnimalForm;
import com.geographic.entity.TbUser;
import com.geographic.entity.User;
import com.geographic.service.TbUserService;
import com.geographic.service.UserService;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;

import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhoudachao on 2018/7/23.
 */
@Controller
public class UserController {

   /* @Autowired
    private UserService userService;*/

    @Autowired
    private TbUserService tbUserService;

    /*@RequestMapping(value = "/listUser",method = RequestMethod.GET)
    private Map<String,Object> listUser(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<User>  list = userService.getUserList();
        modelMap.put("userService",list);
        return modelMap;
    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    private Map<String,Object> getUserById(Integer userId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        User user = userService.getUserById(userId);
        modelMap.put("user",user);
        return modelMap;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    private Map<String,Object> addUser(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userService.addUser(user));
        return modelMap;
    }

    @RequestMapping(value = "/modifyUser",method = RequestMethod.POST)
    private Map<String,Object> modifyUser(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        //修改个人信息
        modelMap.put("success",userService.modifyUser(user));
        return modelMap;
    }

    @RequestMapping(value = "/removeUser",method = RequestMethod.GET)
    private Map<String,Object> removeUser(Integer userId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userService.deleteUser(userId));
        return modelMap;
    }*/

    /**
     * 测试thymeleaf
     */

   @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        //把数据存入model
        model.addAttribute("name","dachao");
        //返回test.html
        return "/test";
    }
   /* @RequestMapping("/form")
    public String form(){
        return "/form";
    }*/

    @RequestMapping("/add")
    public String add(){
        return "/user/add";
    }

    @RequestMapping("/update")
    public String update(){
        return "/user/update";
    }

    @RequestMapping("/toLogin")
    public String tologin(){
        return "/login";
    }
    @RequestMapping("/noAuth")
    public String noAuth(){
        return "/noAuth";
    }

    @RequestMapping("/login")
    public String login(String name,String password,Model model){
        /**
         * 使用Shiro编写认证操作
         */
        //1.获取Subject

        Subject subject = SecurityUtils.getSubject();
        //2.封装用户信息
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        //3.执行登录方法
       try {
           subject.login(token);
           return "redirect:/testThymeleaf";
           //登录成功
           //跳转到test.html
       }catch (UnknownAccountException e){
           //登录失败：用户名不存在
           model.addAttribute("msg","用户名不存在");
           return "redirect:/toLogin";
       }catch (IncorrectCredentialsException e){
           //登录失败：密码错误
           model.addAttribute("msg","密码错误");
           return "redirect:/toLogin";
       }

    }

    @RequestMapping(value = "/form",method =RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView  modelAndView = new ModelAndView();
        modelAndView.setViewName("form");
        modelAndView.addObject("tbUser",new TbUser());
        return  modelAndView;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    private String register(@ModelAttribute TbUser tbUser, Model model){
        System.out.println("打印前端传过来的数据");
        System.out.println("用户名：" + tbUser.getUsername());
        System.out.println("密码：" + tbUser.getPassword());
        System.out.println("电话：" + tbUser.getTelephone());

        try {
            int i = tbUserService.insertUser(tbUser);
            if (i==1)
            System.out.println("用户注册成功" );
            return "redirect:/toLogin";
        }catch (Exception e){
            //注册失败
            model.addAttribute("msg","服务出错请重试");
            return "redirect:/form";
        }



    }


    }
