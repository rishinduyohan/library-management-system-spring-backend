package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
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
