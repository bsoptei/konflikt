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

    private final ArrayList<String> questions = new ArrayList<>(Arrays.asList(
            "A. There are times when I let others take responsibility for solving the problem. \n B. Rather than negotiate the things on which we disagree, I try to stress those things upon which we both agree.",
    "A. I try to find a compromise solution. \n B. I attempt to deal with all of his/her and my concerns.",
    "A. I am usually firm in pursuing my goals.\n B. I might try to soothe the other's feelings and preserve our relationship.",
            "A. I try to find a compromise solution.\n" +
                    "B. I sometimes sacrifice my own wishes for the wishes of the other person.",
            "A. I consistently seek the other's help in working out a solution.\n" +
                    "B. I try to do what is necessary to avoid useless tensions.",
            "A. I try to avoid creating unpleasantness for myself.\n" +
                    "B. I try to win my position.",
            "A. I try to postpone the issue until I have had some time to think it over.\n" +
                    "B. I give up some points in exchange for others.",
            "A. I am usually firm in pursuing my goals.\n" +
                    "B. I attempt to get all concerns and issues immediately out in the open.",
            "A. I feel that differences are not always worth worrying about.\n" +
                    "B. I make some effort to get my way.",
            "A. I am firm in pursuing my goals.\n" +
                    "B. I try to find a compromise solution.",
            "A. I attempt to get all concerns and issues immediately out in the open.\n" +
                    "B. I might try to soothe the other's feelings and preserve our relationship.",
            "A. I sometimes avoid taking positions which would create controversy.\n" +
                    "B. I will let the other person have some of his/her positions if he/she lets me have some of\n" +
                    "mine.",
            "A. I propose a middle ground.\n" +
                    "B. I press to get my points made.",
            "A. I tell the other person my ideas and ask for his/hers.\n" +
                    "B. I try to show the other person the logic and benefits of my position.",
            "A. I might try to soothe the other's feelings and preserve our relationship.\n" +
                    "B. I try to do what is necessary to avoid tensions.",
            "A. I try not to hurt the other's feelings.\n" +
                    "B. I try to convince the other person of the merits of my position.",
            "A. I am usually firm in pursuing my goals.\n" +
                    "B. I try to do what is necessary to avoid useless tensions.",
            "A. If it makes other people happy, I might let them maintain their views.\n" +
                    "B. I will let other people have some of their positions if they let me have some of mine.",
            "A. I attempt to get all concerns and issues immediately out in the open.\n" +
                    "B. I try to postpone the issue until I have had some time to think it over.",
            "A. I attempt to immediately work through our differences.\n" +
                    "B. I try to find a fair combination of gains and losses for both of us.",
            "A. In negotiations, I try to be considerate of the other person's wishes.\n" +
                    "B. I always lean toward a direct discussion of the problem.",
            "A. I try to find a position that is intermediate between his/hers and mine.\n" +
                    "B. I assert my wishes.",
            "A. I am very often concerned with satisfying all our wishes.\n" +
                    "B. There are times when I let others take responsibility for solving the problem.",
            "A. I try meet to meet the wishes of others when it’s important to them.\n" +
                    "B. I try to get the other person to settle for a compromise.",
            "A. I try to show the other person the logic and benefits of my position.\n" +
                    "B. In negotiations, I try to be considerate of the other person's wishes.",
            "A. I propose a middle ground.\n" +
                    "B. I am nearly always concerned with satisfying all our wishes.",
            "A. I sometimes avoid taking positions that would create controversy.\n" +
                    "B. If it makes other people happy, I might let them maintain their views.",
    "A. I am usually firm in pursuing my goals. \n B. I usually seek the other's help in working out a solution.",
    "A. I propose a middle ground. \n B. I feel that differences are not always worth worrying about.",
    "A. I try not to hurt the other's feelings. \n B. I always share a problem with the other person so that we can work it out."
    ));
}
