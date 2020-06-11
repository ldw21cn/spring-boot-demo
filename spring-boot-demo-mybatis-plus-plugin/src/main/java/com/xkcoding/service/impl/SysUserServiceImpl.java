package com.xkcoding.service.impl;

import com.github.pagehelper.Page;
import com.xkcoding.dao.SysUserDao;
import com.xkcoding.model.po.SysUserPo;
import com.xkcoding.service.SysUserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 系统用户
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:44
 * @since jdk 1.8
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    /*<AUTOGEN--BEGIN>*/

    @Autowired
    public SysUserDao sysUserDao;


    @Override
    public Page<SysUserPo> selectPaged(RowBounds rowBounds) {
        return sysUserDao.selectPaged(rowBounds);
    }

    @Override
    public SysUserPo selectByPrimaryKey(Long id) {
        return sysUserDao.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) {
        return sysUserDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insert(SysUserPo sysUser) {
        return sysUserDao.insert(sysUser);
    }

    @Override
    public Integer insertSelective(SysUserPo sysUser) {
        return sysUserDao.insertSelective(sysUser);
    }

    @Override
    public Integer insertSelectiveIgnore(SysUserPo sysUser) {
        return sysUserDao.insertSelectiveIgnore(sysUser);
    }

    @Override
    public Integer updateByPrimaryKeySelective(SysUserPo sysUser) {
        return sysUserDao.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Integer updateByPrimaryKey(SysUserPo sysUser) {
        return sysUserDao.updateByPrimaryKey(sysUser);
    }

    @Override
    public Integer batchInsert(List<SysUserPo> list) {
        return sysUserDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<SysUserPo> list) {
        return sysUserDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsert(SysUserPo sysUser) {
        return sysUserDao.upsert(sysUser);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param map
     * @return
     */
    @Override
    public Integer upsertSelective(SysUserPo sysUser) {
        return sysUserDao.upsertSelective(sysUser);
    }

    @Override
    public List<SysUserPo> query(SysUserPo sysUser) {
        return sysUserDao.query(sysUser);
    }

    @Override
    public Long queryTotal() {
        return sysUserDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Long> list) {
        return sysUserDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
