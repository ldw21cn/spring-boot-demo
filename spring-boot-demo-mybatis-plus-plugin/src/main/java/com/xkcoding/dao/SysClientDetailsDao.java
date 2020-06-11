package com.xkcoding.dao;

import com.github.pagehelper.Page;
import com.xkcoding.model.po.SysClientDetailsPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 的dao层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:38
 * @since jdk1.8
 */
@Mapper
@Component
public interface SysClientDetailsDao {

    /*<AUTOGEN--BEGIN>*/

    Page<SysClientDetailsPo> selectPaged(RowBounds rowBounds);

    SysClientDetailsPo selectByPrimaryKey(Long id);

    Integer deleteByPrimaryKey(Long id);

    Integer insert(SysClientDetailsPo sysClientDetails);

    Integer insertSelective(SysClientDetailsPo sysClientDetails);

    Integer insertSelectiveIgnore(SysClientDetailsPo sysClientDetails);

    Integer updateByPrimaryKeySelective(SysClientDetailsPo sysClientDetails);

    Integer updateByPrimaryKey(SysClientDetailsPo sysClientDetails);

    Integer batchInsert(List<SysClientDetailsPo> list);

    Integer batchUpdate(List<SysClientDetailsPo> list);

    /**
     * 存在即更新
     *
     * @param sysClientDetails
     * @return
     */
    Integer upsert(SysClientDetailsPo sysClientDetails);

    /**
     * 存在即更新，可选择具体属性
     *
     * @param sysClientDetails
     * @return
     */
    Integer upsertSelective(SysClientDetailsPo sysClientDetails);

    List<SysClientDetailsPo> query(SysClientDetailsPo sysClientDetails);

    Long queryTotal();

    Integer deleteBatch(List<Long> list);

    /*<AUTOGEN--END>*/

}
