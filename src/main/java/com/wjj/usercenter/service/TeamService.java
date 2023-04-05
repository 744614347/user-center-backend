package com.wjj.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjj.usercenter.model.domain.Team;
import com.wjj.usercenter.model.domain.User;
import com.wjj.usercenter.model.dto.TeamQuery;
import com.wjj.usercenter.model.request.TeamJoinRequest;
import com.wjj.usercenter.model.request.TeamQuitRequest;
import com.wjj.usercenter.model.request.TeamUpdateRequest;
import com.wjj.usercenter.model.vo.TeamUserVO;

import java.util.List;

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

    /**
     * 搜索队伍
     *
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散）队伍
     *
     * @param id
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
