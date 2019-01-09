package com.epipe.integration_jpa.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity//告诉jpa是一个实体类，和数据表映射
@Table(name = "GIRL")//指定和哪个数据表对应，省略默认表名是类名小写
public class Girl {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "girlSeq")
    @SequenceGenerator(name = "girlSeq", initialValue = 1, allocationSize = 1, sequenceName = "GIRL_SEQUENCE")
    private Integer gid;
    @Column
    private String name;
    @Column
    private Integer age;

    public Girl() {
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "gid=" + gid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
