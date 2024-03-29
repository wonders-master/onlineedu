package com.ww.onlineedu.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @TableId(type=IdType.ID_WORKER)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill= FieldFill.INSERT)
    private Date createTime;
    @TableField(fill =FieldFill.INSERT_UPDATE)
    private Date updateTime;
    //乐观锁注解（版本号）
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
    //逻辑删除标记
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;
}
