package com.text.service;

import com.text.po.User;

/**
 * @author 王元圣
 */
public interface UserService {
    public String selectUserByUsername(String username);

    public int selesttypeByUsername(String username);

    public void updateType(String username);
}
