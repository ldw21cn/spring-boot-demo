package com.xkcoding.dao;

import com.github.pagehelper.Page;
import com.xkcoding.model.po.SysUserRolePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户与角色对应关系的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:46
 * @since jdk1.8
 */
@Mapper
@Component
public interface SysUserRoleDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysUserRolePo> selectPaged(RowBounds rowBounds);

    SysUserRolePo selectByPrimaryKey(Long id);

    Integer deleteByPrimaryKey(Long id);

    Integer insert(SysUserRolePo sysUserRole);

    Integer insertSelective(SysUserRolePo sysUserRole);

    Integer insertSelectiveIgnore(SysUserRolePo sysUserRole);

    Integer updateByPrimaryKeySelective(SysUserRolePo sysUserRole);

    Integer updateByPrimaryKey(SysUserRolePo sysUserRole);

    Integer batchInsert(List<SysUserRolePo> list);

    Integer batchUpdate(List<SysUserRolePo> list);

    /**
     * 存在即更新
     *
     * @param sysUserRole
     * @return
     */
    Integer upsert(SysUserRolePo sysUserRole);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysUserRole
     * @return
     */
    Integer upsertSelective(SysUserRolePo sysUserRole);

    List<SysUserRolePo> query(SysUserRolePo sysUserRole);

    Long queryTotal();

    Integer deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
