package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private String id;
    private String name;
    private String nic;
    private String address;
    private String telNo;
}
