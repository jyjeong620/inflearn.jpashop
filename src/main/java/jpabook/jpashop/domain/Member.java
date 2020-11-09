package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")  // 연관관계의 주인이 아니다라는걸 알려주기위해 mappedBy 세팅
                                     // FK가 되는 필드의 값 입력
    private List<Order> orders = new ArrayList<>();
}
