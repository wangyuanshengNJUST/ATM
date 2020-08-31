package com.text.dao;

import com.text.po.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author 王元圣
 */
@Repository
public interface UserDao {
    @Select("select password from users where username=#{username}")
    public String selectUserByUsername(String username);

    @Select("select isdelete from users where username=#{username}")
    public int selesttypeByUsername(String username);

    @Update("update users set isdelete = 1 where username =#{username}")
    public void updateType(String username);
}
