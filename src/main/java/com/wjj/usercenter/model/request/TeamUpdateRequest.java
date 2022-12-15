package com.wjj.usercenter.model.request;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TeamUpdateRequest implements Serializable {

    private static final long serialVersionUID = -3050382612530134363L;

    /**
     * 队伍id
     */
    private Long id;
    /**
     * 用户昵称
     */
    private String name;

    /**
     * 描述
     */
    private String description;


    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 创建人id
     */
    private Long userId;

    /**
     * 0 - 公开, 1 - 私有, 2 - 加密
     */
    private Integer status;

    /**
     * 密码
     */
    private String password;
}
