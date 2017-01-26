package com.greenfox.service;

import com.greenfox.domain.GroupMember;
import com.greenfox.domain.ResolutionFinder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Service
@Data
public class SimulationService {
    private Map<String, Double> simulationResults = new HashMap<>();
    private ArrayList<GroupMember> groupMembers;

    public void generateSimulationResults() {
        ResolutionFinder myResolutionFinder = new ResolutionFinder();
        simulationResults = myResolutionFinder.generateSolutionsWithProbabilities(groupMembers);
    }

}
