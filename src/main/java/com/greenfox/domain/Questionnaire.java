package com.greenfox.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Data
public class Questionnaire {
    private String sourceName;
    private String[] answers;
    private String personName;
    private final ArrayList<String> CHOICES = new ArrayList<>(Arrays.asList("A", "B"));
}
