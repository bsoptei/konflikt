package com.greenfox.domain;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 1/25/2017.
 */
public class ResolutionFinder {

    private ArrayList<String> findSolutions(Integer groupSize) {
        TKRuleSet tkRuleSet = new TKRuleSet();
        if (groupSize == 2) {
            return tkRuleSet.createCompatiblePairs();
        } else {
            return tkRuleSet.filterGroups(tkRuleSet.createCompatibleGroups(groupSize));
        }
    }

    public Map<String, Double> generateSolutionsWithProbabilities(ArrayList<GroupMember> groupOfPlayers) {
        Map<String, Double> solutionsWithProbabilities = new HashMap<>();
        Integer groupSize = groupOfPlayers.size();
        ArrayList<String> solutions = findSolutions(groupSize);
        for (String solution : solutions) {
            Double weightedProbability = 0.000;
            for (int i = 0; i < solution.length(); i++) {
                GroupMember currentPlayer = groupOfPlayers.get(i);
                weightedProbability += (1 / Double.valueOf(groupSize)) * currentPlayer.obtainStrategyProbability(solution.substring(i, i + 1));
            }
            solutionsWithProbabilities.put(solution, weightedProbability);
        }
        return sortByValue(solutionsWithProbabilities);
    }

    private <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
