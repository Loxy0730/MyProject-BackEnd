package com.example.backend.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Member")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    @Column(length = 10)
    private String memberName;

    private String memberPassword;

    private String memeberPhone;

    @JsonIgnore
    @Lob
    private byte[] memberImg;

}
