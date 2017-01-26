package com.greenfox.service;

import org.springframework.stereotype.Service;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Service
public class QuestionnaireService {


    public Double[] evaluateAnswers(String[] answers) {
        Double[] conflictManagementScores = new Double[] {0.0,0.0,0.0,0.0,0.0};
        if (answers[1].equals("A")) {
            conflictManagementScores[3] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[2].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[1] += 1;
        }

        if (answers[3].equals("A")) {
            conflictManagementScores[0] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[4].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[5].equals("A")) {
            conflictManagementScores[1] += 1;
        } else {
            conflictManagementScores[3] += 1;
        }

        if (answers[6].equals("A")) {
            conflictManagementScores[3] += 1;
        } else {
            conflictManagementScores[0] += 1;
        }

        if (answers[7].equals("A")) {
            conflictManagementScores[3] += 1;
        } else {
            conflictManagementScores[2] += 1;
        }

        if (answers[8].equals("A")) {
            conflictManagementScores[0] += 1;
        } else {
            conflictManagementScores[1] += 1;
        }

        if (answers[9].equals("A")) {
            conflictManagementScores[4] += 1;
        } else {
            conflictManagementScores[0] += 1;
        }

        if (answers[10].equals("A")) {
            conflictManagementScores[0] += 1;
        } else {
            conflictManagementScores[2] += 1;
        }

        if (answers[11].equals("A")) {
            conflictManagementScores[1] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[12].equals("A")) {
            conflictManagementScores[3] += 1;
        } else {
            conflictManagementScores[2] += 1;
        }

        if (answers[13].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[0] += 1;
        }

        if (answers[14].equals("A")) {
            conflictManagementScores[1] += 1;
        } else {
            conflictManagementScores[0] += 1;
        }

        if (answers[15].equals("A")) {
            conflictManagementScores[4] += 1;
        } else {
            conflictManagementScores[3] += 1;
        }

        if (answers[16].equals("A")) {
            conflictManagementScores[4] += 1;
        } else {
            conflictManagementScores[0] += 1;
        }

        if (answers[17].equals("A")) {
            conflictManagementScores[0] += 1;
        } else {
            conflictManagementScores[3] += 1;
        }

        if (answers[18].equals("A")) {
            conflictManagementScores[4] += 1;
        } else {
            conflictManagementScores[2] += 1;
        }

        if (answers[19].equals("A")) {
            conflictManagementScores[1] += 1;
        } else {
            conflictManagementScores[3] += 1;
        }

        if (answers[20].equals("A")) {
            conflictManagementScores[1] += 1;
        } else {
            conflictManagementScores[2] += 1;
        }

        if (answers[21].equals("A")) {
            conflictManagementScores[4] += 1;
        } else {
            conflictManagementScores[1] += 1;
        }

        if (answers[22].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[0] += 1;
        }

        if (answers[23].equals("A")) {
            conflictManagementScores[1] += 1;
        } else {
            conflictManagementScores[3] += 1;
        }

        if (answers[24].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[25].equals("A")) {
            conflictManagementScores[0] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[26].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[1] += 1;
        }

        if (answers[27].equals("A")) {
            conflictManagementScores[3] += 1;
        } else {
            conflictManagementScores[4] += 1;
        }

        if (answers[28].equals("A")) {
            conflictManagementScores[0] += 1;
        } else {
            conflictManagementScores[1] += 1;
        }

        if (answers[29].equals("A")) {
            conflictManagementScores[2] += 1;
        } else {
            conflictManagementScores[3] += 1;
        }

        if (answers[30].equals("A")) {
            conflictManagementScores[4] += 1;
        } else {
            conflictManagementScores[1] += 1;
        }


        return conflictManagementScores;
    }
}
