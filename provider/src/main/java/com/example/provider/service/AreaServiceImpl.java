/*
 * Powered By [Frank-Liz-Lee]
 * Copyright(C) 2018-2020 diyuns Company
 * All rights reserved.
 * -----------------------------------------------
 */

package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboApi.model.Area;
import com.example.dubboApi.service.AreaService;
import com.example.dubboApi.service.GenericIService;
import com.example.provider.mapper.AreaMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
@Service
public class AreaServiceImpl extends GenericService<Area, Integer> implements AreaService {

    private AreaMapper areaMapper;

    @Autowired
    public void setAreaMapper(AreaMapper areaMapper) {
        this.areaMapper = areaMapper;
    }

    /**
     * 通过主键查询实体对象
     * @param primaryKey
     * @return
     */
    public Area getByPK(Integer primaryKey) {
        return areaMapper.getByPK(primaryKey);
    }

    /**
     * 查询所有记录
     * @return
     */
    public List<Area> list() {
        return areaMapper.list();
    }

    /**
     * 根据查询条件查询所有记录
     * @return
     */
    public List<Area> listByProperty(Area area){
        return areaMapper.listByProperty(area);
    }


    /**
     * 根据主键删除记录
     * @param primaryKey
     * @return
     */
    public int deleteByPK(Integer primaryKey) {
        return areaMapper.deleteByPK(primaryKey);
    }

    /**
     * 根据多个主键删除记录
     * @param primaryKeys
     */
    public void deleteByPKeys(List<Integer> primaryKeys) {
        areaMapper.deleteByPKeys(primaryKeys);
    }

    /**
     * 根据传入参数删除记录
     * @param area
     * @return
     */
    public int deleteByProperty(Area area){
        return areaMapper.deleteByProperty(area);
    }

    /**
     * 保存记录
     * @param area
     * @return
     */
    public int save(Area area){
        return areaMapper.save(area);
    }

    /**
     * 更新记录
     * @param area
     * @return
     */
    public int update(Area area){
        return areaMapper.update(area);
    }

    /**
     * 根据条件查询记录条数
     * @param area
     * @return
     */
    public int findByCount(Area area){
        return areaMapper.findByCount(area);
    }

     /**
     * 根据查询条件查询分页记录
     * @return
     */
    public Page<Area> findByPage(Page<Area> page, Area area) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Area> areaList = areaMapper.listByProperty(area);
        if(null == areaList || areaList.size() == 0){
            return new Page<Area>();
        }
        return (Page<Area>)areaList;
    }
}
