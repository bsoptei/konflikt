package com.greenfox.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Data
public class Source {
    private String sourceName;
    private List<Long> idList;

}
