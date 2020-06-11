package com.xkcoding.service.impl;

import com.github.pagehelper.Page;
import com.xkcoding.dao.SysClientDetailsDao;
import com.xkcoding.model.po.SysClientDetailsPo;
import com.xkcoding.service.SysClientDetailsService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:38
 * @since jdk 1.8
 */
@Service("sysClientDetailsService")
public class SysClientDetailsServiceImpl implements SysClientDetailsService {
    /*<AUTOGEN--BEGIN>*/

    @Resource
    public SysClientDetailsDao sysClientDetailsDao;


    @Override
    public Page<SysClientDetailsPo> selectPaged(RowBounds rowBounds) {
        return sysClientDetailsDao.selectPaged(rowBounds);
    }

    @Override
    public SysClientDetailsPo selectByPrimaryKey(Long id) {
        return sysClientDetailsDao.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) {
        return sysClientDetailsDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insert(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.insert(sysClientDetails);
    }

    @Override
    public Integer insertSelective(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.insertSelective(sysClientDetails);
    }

    @Override
    public Integer insertSelectiveIgnore(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.insertSelectiveIgnore(sysClientDetails);
    }

    @Override
    public Integer updateByPrimaryKeySelective(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.updateByPrimaryKeySelective(sysClientDetails);
    }

    @Override
    public Integer updateByPrimaryKey(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.updateByPrimaryKey(sysClientDetails);
    }

    @Override
    public Integer batchInsert(List<SysClientDetailsPo> list) {
        return sysClientDetailsDao.batchInsert(list);
    }

    @Override
    public Integer batchUpdate(List<SysClientDetailsPo> list) {
        return sysClientDetailsDao.batchUpdate(list);
    }

    /**
     * 存在即更新
     *
     * @param sysClientDetails
     * @return
     */
    @Override
    public Integer upsert(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.upsert(sysClientDetails);
    }

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysClientDetails
     * @return
     */
    @Override
    public Integer upsertSelective(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.upsertSelective(sysClientDetails);
    }

    @Override
    public List<SysClientDetailsPo> query(SysClientDetailsPo sysClientDetails) {
        return sysClientDetailsDao.query(sysClientDetails);
    }

    @Override
    public Long queryTotal() {
        return sysClientDetailsDao.queryTotal();
    }

    @Override
    public Integer deleteBatch(List<Long> list) {
        return sysClientDetailsDao.deleteBatch(list);
    }

    /*<AUTOGEN--END>*/

}
