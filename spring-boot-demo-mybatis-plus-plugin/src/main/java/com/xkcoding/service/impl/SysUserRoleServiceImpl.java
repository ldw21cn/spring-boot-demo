package com.xkcoding.service.impl;

import com.github.pagehelper.Page;
import com.xkcoding.dao.SysUserRoleDao;
import com.xkcoding.model.po.SysUserRolePo;
import com.xkcoding.service.SysUserRoleService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 用户与角色对应关系
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:46
 * @since jdk 1.8
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public SysUserRoleDao sysUserRoleDao;


    @Override
    public Page<SysUserRolePo> selectPaged(RowBounds rowBounds) {
        return sysUserRoleDao.selectPaged(rowBounds);
    }

    @Override
    public SysUserRolePo selectByPrimaryKey(Long id) {
        return sysUserRoleDao.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) {
        return sysUserRoleDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insert(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.insert(sysUserRole);
    }

    @Override
    public Integer insertSelective(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.insertSelective(sysUserRole);
    }

    @Override
    public Integer insertSelectiveIgnore(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.insertSelectiveIgnore(sysUserRole);
    }

    @Override
    public Integer updateByPrimaryKeySelective(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.updateByPrimaryKeySelective(sysUserRole);
    }

    @Override
    public Integer updateByPrimaryKey(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.updateByPrimaryKey(sysUserRole);
    }

    @Override
    public Integer batchInsert(List<SysUserRolePo> list) {
        return sysUserRoleDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<SysUserRolePo> list) {
        return sysUserRoleDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.upsert(sysUserRole);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.upsertSelective(sysUserRole);
    }

    @Override
    public List<SysUserRolePo> query(SysUserRolePo sysUserRole) {
        return sysUserRoleDao.query(sysUserRole);
    }

    @Override
    public Long queryTotal() {
        return sysUserRoleDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Long> list) {
        return sysUserRoleDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
