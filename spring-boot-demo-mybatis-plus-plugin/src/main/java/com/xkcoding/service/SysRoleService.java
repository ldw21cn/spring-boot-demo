package com.xkcoding.service;

import com.github.pagehelper.Page;
import com.xkcoding.model.po.SysRolePo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 角色 service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:42
 * @since jdk 1.8
 */
public interface SysRoleService {

    /*<AUTOGEN--BEGIN>*/

    Page<SysRolePo> selectPaged(RowBounds rowBounds);

    SysRolePo selectByPrimaryKey(Long id);

    Integer deleteByPrimaryKey(Long id);

    Integer insert(SysRolePo sysRole);

    Integer insertSelective(SysRolePo sysRole);

    Integer insertSelectiveIgnore(SysRolePo sysRole);

    Integer updateByPrimaryKeySelective(SysRolePo sysRole);

    Integer updateByPrimaryKey(SysRolePo sysRole);

    Integer batchInsert(List<SysRolePo> list);

    Integer batchUpdate(List<SysRolePo> list);

    /**
     * 存在即更新
     *
     * @param sysRole
     * @return
     */
    Integer upsert(SysRolePo sysRole);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysRole
     * @return
     */
    Integer upsertSelective(SysRolePo sysRole);

    List<SysRolePo> query(SysRolePo sysRole);

    Long queryTotal();

    Integer deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
