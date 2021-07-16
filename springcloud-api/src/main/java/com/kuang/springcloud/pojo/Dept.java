package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.pojo
 * @Author: cxy
 * @Date: 2021/7/16 18:18
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    //一个服务对应一个数据库，同一个信息可能对应不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

}
