package com.example.shirodemo.dao;

import com.example.shirodemo.dataobject.UserRoleDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..user_role
     *
     * @mbg.generated Wed Jun 28 14:07:04 CST 2023
     */
    int insert(UserRoleDO record);

    List<Integer> selectUserIdByRoleId(Integer roleId);

    int insertUserRole(@Param("userId") Integer userId, @Param("roleIds") Integer[] roleIds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..user_role
     *
     * @mbg.generated Wed Jun 28 14:07:04 CST 2023
     */
    int insertSelective(UserRoleDO record);
}