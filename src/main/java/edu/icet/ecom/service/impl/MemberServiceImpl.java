package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.entity.MemberEntity;
import edu.icet.ecom.repository.impl.MemberRepositoryImpl;
import edu.icet.ecom.service.MemberService;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    MemberRepositoryImpl memberRepository = new MemberRepositoryImpl();

    @Override
    public boolean addMember(MemberEntity member){
        return memberRepository.addMember(member);
    }
    @Override
    public boolean updateMember(MemberEntity member){
        return memberRepository.updateMember(member);
    }
    @Override
    public MemberEntity getMember(String id){
        return memberRepository.getMember(id);
    }
    @Override
    public boolean deleteMember(String id){
        return memberRepository.deleteMember(id);
    }
    @Override
    public List<MemberEntity> getAll(){
        return memberRepository.getAll();
    }
}
