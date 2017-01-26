package com.greenfox.service;

import com.greenfox.domain.GroupMember;
import com.greenfox.repository.GroupMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
