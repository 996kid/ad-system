package com.kid.ad.service;

import com.kid.ad.exception.AdException;
import com.kid.ad.vo.CreateUserRequest;
import com.kid.ad.vo.CreateUserResponse;

public interface IUserService {
    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
