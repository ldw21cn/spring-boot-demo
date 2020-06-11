package com.xkcoding.service;

import com.github.pagehelper.Page;
import com.xkcoding.model.po.SysClientDetailsPo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * service层
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2020-05-15 09:05:38
 * @since jdk 1.8
 */
public interface SysClientDetailsService {

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
