package com.epipe.integration_jpa.dao;

import com.epipe.integration_jpa.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

//继承JpaRepository进行操作
public interface GirlDaoInf extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);
    public Girl findByGid(Integer gid);
}
