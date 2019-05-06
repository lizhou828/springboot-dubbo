/*
 * Powered By [Frank-Liz-Lee]
 * Copyright(C) 2018-2020 diyuns Company
 * All rights reserved.
 * -----------------------------------------------
 */
package com.example.dubboApi.model;

import java.io.Serializable;

/**
 *
 */
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    /*  */
    private Integer id;

    /* 行政区划代码 */
    private String areaCode;

    /* 名称 */
    private String areaName;

    /* 城乡分类代码 */
    private String cityRuralCode;

    /* 统计截止日期 */
    private java.sql.Timestamp deadline;

    /* 行政区域级别(1:省,直辖市,自治区 2:市 3:区县 4:乡镇, 5 村) */
    private Integer level;

    /* 父级id */
    private Integer parentId;

    /* 该行政区域的链接 */
    private String href;


    /* get  */
    public Integer getId() {
        return id;
    }

    /* set  */
    public void setId(Integer id) {
        this.id = id;
    }
    /* get 行政区划代码 */
    public String getAreaCode() {
        return areaCode;
    }

    /* set 行政区划代码 */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    /* get 名称 */
    public String getAreaName() {
        return areaName;
    }

    /* set 名称 */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    /* get 城乡分类代码 */
    public String getCityRuralCode() {
        return cityRuralCode;
    }

    /* set 城乡分类代码 */
    public void setCityRuralCode(String cityRuralCode) {
        this.cityRuralCode = cityRuralCode;
    }
    /* get 统计截止日期 */
    public java.sql.Timestamp getDeadline() {
        return deadline;
    }

    /* set 统计截止日期 */
    public void setDeadline(java.sql.Timestamp deadline) {
        this.deadline = deadline;
    }
    /* get 行政区域级别(1:省,直辖市,自治区 2:市 3:区县 4:乡镇, 5 村) */
    public Integer getLevel() {
        return level;
    }

    /* set 行政区域级别(1:省,直辖市,自治区 2:市 3:区县 4:乡镇, 5 村) */
    public void setLevel(Integer level) {
        this.level = level;
    }
    /* get 父级id */
    public Integer getParentId() {
        return parentId;
    }

    /* set 父级id */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    /* get 该行政区域的链接 */
    public String getHref() {
        return href;
    }

    /* set 该行政区域的链接 */
    public void setHref(String href) {
        this.href = href;
    }

    public String toString() {
        return "Area {" +
                    " id = " + id +
                    " , areaCode = " + areaCode +
                    " , areaName = " + areaName +
                    " , cityRuralCode = " + cityRuralCode +
                    " , deadline = " + deadline +
                    " , level = " + level +
                    " , parentId = " + parentId +
                    " , href = " + href +
            "}";
        }
}