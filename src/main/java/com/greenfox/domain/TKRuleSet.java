package com.greenfox.domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lenovo on 1/25/2017.
 */
public class TKRuleSet {


    public static ArrayList<String> strategies = new ArrayList<>(Arrays.asList("V", "K", "E", "A", "P"));
    private ArrayList<String> compatibleMatchesInGroups = new ArrayList<>(Arrays.asList(
            "VK", "VE", "VA", "KK", "KP", "EP", "AP", "PP",
            "KV", "EV", "AV", "PK", "PE", "PA"
            , "KA", "AK"
            ,"KE","EK"
    ));
    private ArrayList<String> incompatibleInCaseOfTwoPlayers = new ArrayList<>(Arrays.asList(
            "KA", "AK"
            ,"KE","EK"
    ));


    public ArrayList<String> createCompatiblePairs(){
        ArrayList<String> compatiblePairs = compatibleMatchesInGroups;
        for (String incompatibleInPair: incompatibleInCaseOfTwoPlayers) {
            compatiblePairs.remove(incompatibleInPair);
        }
        return compatiblePairs;
    }

    public ArrayList<String> createCompatibleGroups(int numberOfPlayers) {
        ArrayList<String> compatibleGroups = new ArrayList<>();
        if (numberOfPlayers == 2) {
            return compatibleMatchesInGroups;
        } else  {
            for (String strategy : strategies) {
                ArrayList<String> referenceGroups = createCompatibleGroups(numberOfPlayers - 1);
                compatibleGroups = appendGroups(compatibleGroups, referenceGroups, strategy);
            }
            return compatibleGroups;
        }
    }

    public ArrayList<String> filterGroups(ArrayList<String> groups) {
        groups.remove(generateString(groups.get(0).length(), "E"));
        groups.remove(generateString(groups.get(0).length(), "A"));
        return groups;
    }

    private String generateString(int length, String e) {
        String generatedString ="";
        for (int i = 0; i < length; i++) {
            generatedString += e;
        }
        return generatedString;
    }

    private ArrayList<String> appendGroups(ArrayList<String> compatibleGroups,
                                           ArrayList<String> referenceGroups,
                                           String strategy) {
        for (String referenceGroup : referenceGroups) {
            if (strategyIsCompatibleWithReferenceGroup(strategy, referenceGroup)) {
                compatibleGroups.add(referenceGroup + strategy);
            }
        }
        return compatibleGroups;
    }

    private boolean strategyIsCompatibleWithReferenceGroup(String strategy, String referenceGroup) {
        boolean itIsCompatible = true;
        for (int i = 0; i < referenceGroup.length(); i++) {
            if (!isCompatible(strategy, referenceGroup.substring(i, i+1))) {
                itIsCompatible = false;
            }
        }
        return itIsCompatible;
    }

    private boolean isCompatible(String strategyOne, String strategyTwo) {
        return (compatibleMatchesInGroups.contains(strategyOne + strategyTwo));
    }
}
