package com.kuang.springcloud.service;

import com.kuang.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.service
 * @Author: cxy
 * @Date: 2021/7/18 18:18
 * @Description: TODO
 */
//服务降级
@Component
public class DeptClintServiceFallbackFactory implements FallbackFactory {
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id=>" + id + "没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭")
                        .setDb_source("没有数据~");
            }

            public List<Dept> queryAll() {
                return null;
            }

            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}

