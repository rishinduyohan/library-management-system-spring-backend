package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.MemberEntity;
import edu.icet.ecom.repository.MemberRepository;

import java.util.List;

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
    public boolean deleteMember(String id){
        return memberRepository.deleteMember(id);
    }
    public List<MemberEntity> getAll(){
        return memberRepository.getAll();
    }
}
