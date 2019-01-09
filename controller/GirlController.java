package com.epipe.integration_jpa.controller;

import com.epipe.integration_jpa.dao.GirlDaoInf;
import com.epipe.integration_jpa.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    //测试修改后提交到github
    @Autowired//注入GirlDaoInf类
    GirlDaoInf girlDaoInf;

    //查询所有女生列表
    @GetMapping(value = "/girl")
    public List<Girl> girlList(){

        return  girlDaoInf.findAll();
    }

    //添加一个女生
    @GetMapping(value = "/girl/add")
    public  Girl girlAdd(@RequestParam("name") String name,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);
        return girlDaoInf.save(girl);
    }

    //通过ID查询女生
    @GetMapping(value = "/girl/id/{id}")
    public Girl girlFindOne(@PathVariable("id")Integer id){
        return girlDaoInf.findByGid(id);
    }

    //更新一个女生信息
    @GetMapping(value = "/girl/update/{id}")
    public Girl girlUpdate(
            @PathVariable("id")Integer id,
            @RequestParam()String name,
            @RequestParam()Integer age){
        Girl girl = new Girl();
        girl.setGid(id);
        girl.setName(name);
        girl.setAge(age);
        return girlDaoInf.save(girl);
    }

    //删除一个女生
    @GetMapping(value = "/girl/del/{id}")
    public String girlDelete(@PathVariable("id")Integer id){
        try {
            girlDaoInf.deleteById(id);
            return "删除成功";
        }catch (Exception e){
            return "此数据不存在,无法删除";
        }

    }

    //通过年龄查询
    @GetMapping(value = "/girl/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age")Integer age){
        return girlDaoInf.findByAge(age);
    }



}
