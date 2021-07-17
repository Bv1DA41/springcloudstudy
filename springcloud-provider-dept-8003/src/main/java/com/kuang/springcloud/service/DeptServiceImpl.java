package com.kuang.springcloud.service;

import com.kuang.springcloud.dao.DeptDao;
import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.service
 * @Author: cxy
 * @Date: 2021/7/16 19:17
 * @Description: TODO
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
