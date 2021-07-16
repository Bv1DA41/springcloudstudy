package com.kuang.springcloud.service;

import com.kuang.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.service
 * @Author: cxy
 * @Date: 2021/7/16 19:16
 * @Description: TODO
 */

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();

}
