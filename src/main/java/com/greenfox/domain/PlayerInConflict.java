package com.greenfox.domain;

import groovy.transform.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 1/25/2017.
 */
@ToString
public class PlayerInConflict {
    private Map<String, Double> conflictStrategies = new HashMap<>();

    private String name;

    public PlayerInConflict(String name, Double[] VKEAPScores) {
        this.name = name;
        initialize(VKEAPScores);
    }

    private void initialize(Double[] VKEAPScores) {
        Double sumOfScores = VKEAPScores[0] + VKEAPScores[1] + VKEAPScores[2] + VKEAPScores[3] + VKEAPScores[4];
        for (int i = 0; i < VKEAPScores.length; i++) {
            this.conflictStrategies.put(TKRuleSet.strategies.get(i), VKEAPScores[i]/ sumOfScores);
        }
    }

    public Map<String, Double> getConflictStrategies() {
        return conflictStrategies;
    }

    public Double obtainStrategyProbability(String strategy) {
        return conflictStrategies.get(strategy);
    }

    public String getName() {
        return name;
    }

}
