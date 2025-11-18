package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class MemberEntity {
    @Id
    private String id;

    private String name;
    private String nic;
    private String address;
    private String telNo;
}
