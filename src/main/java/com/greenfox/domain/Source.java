package com.greenfox.domain;

import java.util.List;

/**
 * Created by Lenovo on 1/26/2017.
 */
public class Source {
    private String sourceName;
    private List<String> testList;

    public String getSourceName()
    {
        return sourceName;
    }

    public void setSourceName(String name)
    {
        this.sourceName = name;
    }

    public List<String> getTestList()
    {
        return testList;
    }

    public void setTestList(List<String> list)
    {
        this.testList = list;
    }

}
