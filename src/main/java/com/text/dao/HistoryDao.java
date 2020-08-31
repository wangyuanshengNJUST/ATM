package com.text.dao;

import com.text.po.History;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * @author 王元圣
 */
@Repository
public interface HistoryDao {
    @Insert("insert into history values (null,#{username},#{type},#{money},#{time})")
    public void insertAddHistory(@Param("username") String username, @Param("type") String type, @Param("money") BigDecimal money, @Param("time") Timestamp time);
    @Select("select *  from history where  username =  #{username}")
    public ArrayList<History> selectHistory(String username);
}
