package com.xkcoding.dao;

import com.github.pagehelper.Page;
import com.xkcoding.model.po.SysUserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统用户的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:44
 * @since jdk1.8
 */
@Mapper
@Component
public interface SysUserDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysUserPo> selectPaged(RowBounds rowBounds);

    SysUserPo selectByPrimaryKey(Long id);

    Integer deleteByPrimaryKey(Long id);

    Integer insert(SysUserPo sysUser);

    Integer insertSelective(SysUserPo sysUser);

    Integer insertSelectiveIgnore(SysUserPo sysUser);

    Integer updateByPrimaryKeySelective(SysUserPo sysUser);

    Integer updateByPrimaryKey(SysUserPo sysUser);

    Integer batchInsert(List<SysUserPo> list);

    Integer batchUpdate(List<SysUserPo> list);

    /**
     * 存在即更新
     *
     * @param sysUser
     * @return
     */
    Integer upsert(SysUserPo sysUser);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysUser
     * @return
     */
    Integer upsertSelective(SysUserPo sysUser);

    List<SysUserPo> query(SysUserPo sysUser);

    Long queryTotal();

    Integer deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
