package com.example.shirodemo.dao;

import com.example.shirodemo.dataobject.RolePermissionDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..role_permission
     *
     * @mbg.generated Wed Jun 28 14:07:04 CST 2023
     */
    int insert(RolePermissionDO record);

    int insertRolePerms(@Param("roleId") Integer roleId, @Param("permIds") Integer[] permIds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..role_permission
     *
     * @mbg.generated Wed Jun 28 14:07:04 CST 2023
     */
    int insertSelective(RolePermissionDO record);
}