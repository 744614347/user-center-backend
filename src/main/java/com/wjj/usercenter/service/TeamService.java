package com.wjj.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjj.usercenter.model.domain.Team;
import com.wjj.usercenter.model.domain.User;

/**
 * @author 74461
 * @description 针对表【team(队伍)】的数据库操作Service
 * @createDate 2022-12-05 10:53:10
 */
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @return
     */
    long addTeam(Team team, User loginUser);

}
