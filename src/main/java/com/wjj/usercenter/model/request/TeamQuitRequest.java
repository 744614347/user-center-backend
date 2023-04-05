package com.wjj.usercenter.model.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍
 *
 * @author 74461
 */
@Data
public class TeamQuitRequest implements Serializable {


    private static final long serialVersionUID = -7533512315521908336L;
    /**
     * 队伍id
     */
    private Long teamId;


}
