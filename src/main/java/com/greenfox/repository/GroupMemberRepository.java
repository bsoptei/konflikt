package com.greenfox.repository;

import com.greenfox.domain.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lenovo on 1/26/2017.
 */
public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {
}
