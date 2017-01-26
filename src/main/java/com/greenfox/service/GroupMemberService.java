package com.greenfox.service;

import com.greenfox.domain.GroupMember;
import com.greenfox.domain.Source;
import com.greenfox.repository.GroupMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 1/26/2017.
 */
@Service
public class GroupMemberService {

    private final GroupMemberRepository groupMemberRepository;

    @Autowired
    public GroupMemberService(GroupMemberRepository groupMemberRepository) {
        this.groupMemberRepository = groupMemberRepository;
    }

    public List<GroupMember> obtainAllGroupMembers(){
        return groupMemberRepository.findAll();
    }

    public void saveGroupMember(GroupMember myGroupMember) {
        groupMemberRepository.save(myGroupMember);
    }

    public void normalizeGroupMemberScores(GroupMember myGroupMember) {
        myGroupMember.normalizeScores();
    }

    public ArrayList<GroupMember> generateSimulationGroup(Source source) {
        ArrayList<GroupMember> simulationGroup = new ArrayList<>();
        for (Long id : source.getIdList()) {
            simulationGroup.add(groupMemberRepository.findOne(id));
        }
        return simulationGroup;
    }

    public void adjustMemberScores(Double[] VKEAPScoresFromQuestionnaire,
                                          GroupMember newGroupMember) {
        newGroupMember.setCompetingScore(VKEAPScoresFromQuestionnaire[0]);
        newGroupMember.setCompromisingScore(VKEAPScoresFromQuestionnaire[1]);
        newGroupMember.setAvoidingScore(VKEAPScoresFromQuestionnaire[2]);
        newGroupMember.setAccommodatingScore(VKEAPScoresFromQuestionnaire[3]);
        newGroupMember.setCollaboratingScore(VKEAPScoresFromQuestionnaire[4]);
    }
}
