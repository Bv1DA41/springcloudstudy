package com.kuang.springcloud.dao;

import com.kuang.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.dao
 * @Author: cxy
 * @Date: 2021/7/16 19:07
 * @Description: TODO
 */
@Mapper
@Repository
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();

}
