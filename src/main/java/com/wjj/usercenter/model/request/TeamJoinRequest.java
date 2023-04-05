package com.wjj.usercenter.model.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍
 *
 * @author 74461
 */
@Data
public class TeamJoinRequest implements Serializable {


    private static final long serialVersionUID = -4694534434805724798L;
    /**
     * 队伍id
     */
    private Long teamId;


    /**
     * 密码
     */
    private String password;
}
