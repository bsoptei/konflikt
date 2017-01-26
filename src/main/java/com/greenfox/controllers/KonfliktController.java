package com.greenfox.controllers;

import com.greenfox.domain.GroupMember;
import com.greenfox.domain.SimulationForm;
import com.greenfox.domain.Source;
import com.greenfox.service.GroupMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Controller
public class KonfliktController {

    private final GroupMemberService groupMemberService;

    private HashMap<Character, String> strategyNames = new HashMap<Character,String>(){{
        put('V',"Competing");
        put('K',"Compromising");
        put('E',"Avoiding");
        put('A',"Accommodating");
        put('P',"Collaborating");
    }};

    @Autowired
    public KonfliktController(GroupMemberService groupMemberService) {
        this.groupMemberService = groupMemberService;
    }

    @RequestMapping({"/" , "/home", "/index"})
    public String home(){
        return "index";
    }

    @RequestMapping("/add")
    public String addGet(Model model){
        model.addAttribute("groupMember", new GroupMember());
        return "add";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute GroupMember newGroupMember){
        groupMemberService.normalizeGroupMemberScores(newGroupMember);
        groupMemberService.saveGroupMember(newGroupMember);
        return "redirect:/index";
    }

    @RequestMapping("/simulate")
    public String simulateGet(Model model){

        List<GroupMember> memberList = groupMemberService.obtainAllGroupMembers();

        String selectedStatus = "selected";
        model.addAttribute("memberList", memberList);
        model.addAttribute("source", new Source());
        model.addAttribute("selectedStatus", selectedStatus);
        return "simulate";
    }

    @PostMapping("/simulate")
    public void simulatePut(@ModelAttribute Source source, Model model) {
        System.out.println(source.getIdList().toString());
    }

    @RequestMapping("/results")
    public String showResults(Model model){
        return "results";
    }

    @RequestMapping("/easter")
    @ResponseBody
    public HttpStatus easter(){
        return HttpStatus.I_AM_A_TEAPOT;
    }
}
