package com.greenfox.controllers;

import com.greenfox.domain.PlayerInConflict;
import com.greenfox.domain.ResolutionFinder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Controller
public class KonfliktController {
    private ArrayList<PlayerInConflict> players = new ArrayList<>(Arrays.asList(
            new PlayerInConflict("Joe", new Double[]{0.1, 0.2, 0.1, 0.4, 0.1}),
            new PlayerInConflict("Jane", new Double[]{0.05, 0.05, 0.5, 0.2, 0.2}),
            new PlayerInConflict("Judith", new Double[]{0.4, 0.3, 0.2, 0.1, 0.1}),
            new PlayerInConflict("Jeremiah", new Double[]{0.1, 0.2, 0.2, 0.2, 0.4})
    ));

    @RequestMapping("/results")
    public String showResults(Model model){
        ResolutionFinder myResolutionFinder = new ResolutionFinder(players);
        model.addAttribute("players", players);
        model.addAttribute("solutions",myResolutionFinder.generateSolutionsWithProbabilities());
        return "results";
    }

    @RequestMapping("/easter")
    @ResponseBody
    public HttpStatus easter(){
        return HttpStatus.I_AM_A_TEAPOT;
    }
}
