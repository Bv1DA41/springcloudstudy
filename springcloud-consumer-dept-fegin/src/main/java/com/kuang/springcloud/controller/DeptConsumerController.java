package com.kuang.springcloud.controller;


import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud
 * @Author: cxy
 * @Date: 2021/7/16 19:46
 * @Description: TODO
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService = null;

    /**
     * 消费方添加部门信息
     *
     * @param dept
     * @return
     */
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.addDept(dept);
    }

    /**
     * 消费方根据id查询部门信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.queryById(id);
    }

    /**
     * 消费方查询部门信息列表x
     *
     * @return
     */
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.queryAll();
    }
}
