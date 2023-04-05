package com.wjj.usercenter.service;

import com.wjj.usercenter.common.BaseResponse;
import com.wjj.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjj.usercenter.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Jie_744614347
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-03-12 21:44:25
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount,String userPassword,String checkPassword);

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 根据标签搜索用户
     *
     * @param tagNameList
     * @return
     */
    List<User> searchUserByTags(List<String> tagNameList);

    /**
     * 更新用户信息
     *
     * @param user
     * @param loginUser
     * @return
     */
    int updateUser(User user, User loginUser);

    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 是否为管理员
     *
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 是否为管理员
     *
     * @param loginUser
     * @return
     */
    boolean isAdmin(User loginUser);

    /**
     * 匹配用户
     * @param num
     * @param loginUser
     * @return
     */
    List<User> matchUser(long num, User loginUser);
}
