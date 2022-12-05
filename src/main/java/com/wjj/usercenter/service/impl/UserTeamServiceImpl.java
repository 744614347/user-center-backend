package com.wjj.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjj.usercenter.mapper.UserTeamMapper;
import com.wjj.usercenter.model.domain.UserTeam;
import com.wjj.usercenter.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
 * @author 74461
 * @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
 * @createDate 2022-12-05 15:10:56
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}




