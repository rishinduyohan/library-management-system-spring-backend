package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.MemberEntity;
import edu.icet.ecom.repository.MemberRepository;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();

    public boolean addMember(MemberEntity member){
        return memberRepository.addMember(member);
    }
    public boolean updateMember(MemberEntity member){
        return memberRepository.updateMember(member);
    }
    public MemberEntity getMember(String id){
        return memberRepository.getMember(id);
    }
}
