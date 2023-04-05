package com.wjj.usercenter.controller;

import com.wjj.usercenter.common.BaseResponse;
import com.wjj.usercenter.common.ResultUtils;
import com.wjj.usercenter.model.domain.User;
import com.wjj.usercenter.service.UserService;
import com.wjj.usercenter.utils.OSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"}, allowCredentials = "true")
@Slf4j
public class UploadImageController {

    @Autowired
    UserService userService;

    @RequestMapping("/uploadImage")
    public BaseResponse<Boolean> uploadImage(HttpServletRequest request, @RequestParam("file") MultipartFile fileUpload) {
        User loginUser = userService.getLoginUser(request);
        File file = OSSUtils.multipartFileToFile(fileUpload);
        String url = OSSUtils.uploadImage(file, loginUser.getUserAccount());
        loginUser.setAvatarUrl(url);
        boolean update = userService.updateById(loginUser);
        return ResultUtils.success(update);

    }
}
