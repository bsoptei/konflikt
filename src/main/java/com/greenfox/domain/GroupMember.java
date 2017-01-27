package com.greenfox.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 1/25/2017.
 */
@Entity
@Table(name = "group_members")
@Data
@NoArgsConstructor
public class GroupMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String firstName;
    private String lastName;
    private Double competingScore;
    private Double compromisingScore;
    private Double avoidingScore;
    private Double accommodatingScore;
    private Double collaboratingScore;

    @Transient
    private Map<String, Double> conflictStrategies;
    @Transient
    private Double[] VKEAPScores;
    @Transient
    private boolean selected;
    @Transient
    private Double sumOfScores;

    public void normalizeScores() {
        sumOfScores = calculateSumOfScores();
        this.competingScore = competingScore / sumOfScores;
        this.compromisingScore = compromisingScore / sumOfScores;
        this.avoidingScore = avoidingScore / sumOfScores;
        this.accommodatingScore = accommodatingScore / sumOfScores;
        this.collaboratingScore = collaboratingScore / sumOfScores;
    }

    private Double calculateSumOfScores() {
        return competingScore + compromisingScore + avoidingScore + accommodatingScore + collaboratingScore;
    }

    private void generateVKEAPScores(){
        this.VKEAPScores = new Double[] {this.competingScore,
                this.compromisingScore,this.avoidingScore, this.accommodatingScore, this.collaboratingScore};
    }

    private void generateConflictStrategies(){
        generateVKEAPScores();
        conflictStrategies = new HashMap<>();
        for (int i = 0; i < VKEAPScores.length; i++) {
            this.conflictStrategies.put(TKRuleSet.strategies.get(i), VKEAPScores[i]);
        }
    }


    Double obtainStrategyProbability(String strategy) {
        if (conflictStrategies == null || conflictStrategies.size() == 0) {
            generateConflictStrategies();
        }
        return conflictStrategies.get(strategy);
    }

}
