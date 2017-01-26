package com.greenfox.service;

import com.greenfox.domain.GroupMember;
import com.greenfox.domain.ResolutionFinder;
import com.greenfox.domain.TKRuleSet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Service
public class SimulationService {

    public Map<String, Double> generateSimulationResults(ArrayList<GroupMember> groupMembers) {
        ResolutionFinder myResolutionFinder = new ResolutionFinder();
        return myResolutionFinder.generateSolutionsWithProbabilities(groupMembers);
    }

}
