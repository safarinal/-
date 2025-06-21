package com.df.bbt.entity;

import java.io.Serializable;

public class Search implements Serializable {
    private static final long serialVersionUID = 829464335607699508L;
    
    private String searchName;
    
    private Integer searchCount;


    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public Integer getSearchCount() {
        return searchCount;
    }

    public void setSearchCount(Integer searchCount) {
        this.searchCount = searchCount;
    }

    @Override
    public String toString() {
        return "Search{" +
                "searchName='" + searchName + '\'' +
                ", searchCount=" + searchCount +
                '}';
    }
}