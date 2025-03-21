package com.example.backend.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAllMember(){
      return memberRepository.findAll();
    }

    public void addMember(MemberDTO memberDTO){
        //建立對應的實體類（mapping 過程）
        Member member = new Member();
        member.setMemberName(memberDTO.getMemberName());
        member.setMemberPassword(memberDTO.getMemberPassword());
        member.setMemeberPhone(memberDTO.getMemeberPhone());
        memberRepository.save(member);
    }

}
