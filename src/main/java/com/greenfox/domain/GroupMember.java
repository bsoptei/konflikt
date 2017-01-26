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
    private String name;
    private Double competingScore;
    private Double compromisingScore;
    private Double avoidingScore;
    private Double accommodatingScore;
    private Double collaboratingScore;

    @Transient
    private Map<String, Double> conflictStrategies = new HashMap<>();

    @Transient
    private Double[] VKEAPScores;

    @Transient
    private boolean selected;

    public GroupMember(String name,
                       Double competingScore,
                       Double compromisingScore,
                       Double avoidingScore,
                       Double accommodatingScore,
                       Double collaboratingScore) {
        this.name = name;
        Double sum = competingScore + compromisingScore + avoidingScore + accommodatingScore + collaboratingScore;
        this.competingScore = competingScore / sum;
        this.compromisingScore = compromisingScore / sum;
        this.avoidingScore = avoidingScore / sum;
        this.accommodatingScore = accommodatingScore / sum;
        this.collaboratingScore = collaboratingScore / sum;


        normalizeScores();
    }

    public GroupMember(String name, Double[] VKEAPScores) {
        this.name = name;
        this.VKEAPScores = VKEAPScores;
        normalizeScores();
    }

    public void normalizeScores() {
        this.VKEAPScores = new Double[] {this.competingScore,
                this.compromisingScore,this.avoidingScore, this.accommodatingScore, this.collaboratingScore};
        Double sumOfScores = VKEAPScores[0] + VKEAPScores[1] + VKEAPScores[2] + VKEAPScores[3] + VKEAPScores[4];
        for (int i = 0; i < VKEAPScores.length; i++) {
            this.conflictStrategies.put(TKRuleSet.strategies.get(i), VKEAPScores[i] / sumOfScores);
        }
    }


    public Double obtainStrategyProbability(String strategy) {
        return conflictStrategies.get(strategy);
    }


}
