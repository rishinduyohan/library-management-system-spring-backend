package edu.icet.ecom.controller;

import edu.icet.ecom.model.entity.MemberEntity;
import edu.icet.ecom.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api/library/members")
public class MemberController {
    MemberService memberService = new MemberService();

    @GetMapping("{id}")
    public MemberEntity getMember(@PathVariable String id){
        if (memberService.getMember(id)!=null){
            ResponseEntity.ok("Member Not found!");
        }
        return memberService.getMember(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> putMember(@RequestBody MemberEntity memberEntity){
        if (memberService.addMember(memberEntity)){
            return ResponseEntity.ok("Member added success!");
        }
        return ResponseEntity.ok("Member NOT added!");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateMember(@RequestBody MemberEntity member){
        if (memberService.updateMember(member)){
            return ResponseEntity.ok("Member updated!");
        }
        return ResponseEntity.ok("Member NOT updated!");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMembers(@PathVariable String id){
        if (memberService.deleteMember(id)){
            return ResponseEntity.ok("Member deleted!");
        }
        return ResponseEntity.ok("Member NOT deleted!");
    }
}
