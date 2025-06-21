package com.df.bbt.entity;

import java.io.Serializable;

public class Collect implements Serializable {
    private static final long serialVersionUID = -10917650042070520L;
    
    private String collectTime;
    
    private Integer userId;
    
    private Integer goodsId;
    
    private Double collectPrice;


    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getCollectPrice() {
        return collectPrice;
    }

    public void setCollectPrice(Double collectPrice) {
        this.collectPrice = collectPrice;
    }

}