package com.wjj.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjj.usercenter.mapper.TeamMapper;
import com.wjj.usercenter.model.domain.Team;
import com.wjj.usercenter.service.TeamService;
import org.springframework.stereotype.Service;

/**
 * @author 74461
 * @description 针对表【team(队伍)】的数据库操作Service实现
 * @createDate 2022-12-05 10:53:10
 */
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
        implements TeamService {

}




