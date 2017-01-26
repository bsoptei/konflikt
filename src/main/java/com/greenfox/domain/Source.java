package com.greenfox.domain;

import java.util.List;

/**
 * Created by Lenovo on 1/26/2017.
 */
public class Source {
    private String sourceName;
    private List<String> idList;

    public String getSourceName()
    {
        return sourceName;
    }

    public void setSourceName(String name)
    {
        this.sourceName = name;
    }

    public List<String> getIdList()
    {
        return idList;
    }

    public void setIdList(List<String> list)
    {
        this.idList = list;
    }

}
