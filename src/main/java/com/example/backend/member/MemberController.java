package com.example.backend.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/member")
    public ResponseEntity<?> getMember() {
        List<Member> memberList = memberService.findAllMember();
        return ResponseEntity.ok(memberList);
    }

    @PostMapping("/member/create")
    public String addMember(@RequestBody MemberDTO memberDTO) {
        memberService.addMember(memberDTO);
        return "add member success";
    }

}
