package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.MemberDTO;
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

    @GetMapping
    public MemberDTO getMember(){
        return new MemberDTO("M001","Kamla","2008746541","Eight seven store","0785698521");
    }

    @PostMapping("/add")
    public ResponseEntity<String> putMember(@RequestBody MemberEntity memberEntity){
        if (memberService.addMember(memberEntity)){
            return ResponseEntity.ok("Member added success!");
        }
        return ResponseEntity.ok("Member NOT added!");
    }
}
