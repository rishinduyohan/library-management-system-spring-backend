package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.MemberEntity;

import java.util.List;

public interface MemberService {
    boolean addMember(MemberEntity member);

    boolean updateMember(MemberEntity member);

    MemberEntity getMember(String id);

    boolean deleteMember(String id);

    List<MemberEntity> getAll();
}
