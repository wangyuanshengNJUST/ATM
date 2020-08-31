package com.text.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author 王元圣
 */
@Repository
public interface BalanceDao {
    @Select("select balance from balance where username = #{username}")
    public BigDecimal selectBalanceByUsername(String username);

    @Update("update balance set balance = balance + #{money} where username = #{username}")
    public void updateAddBalance(@Param("username") String username, @Param("money") BigDecimal money);

    @Update("update balance set balance = balance - #{money} where username = #{username}")
    public void updateDrawBalance(@Param("username") String username, @Param("money") BigDecimal money);
}
