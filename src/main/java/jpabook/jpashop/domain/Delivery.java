package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)        // EnumType.ORDINAL 은 숫자타입으로 들어감 그래서 STRING 으로해줘야함(default 값이 ORDINAL 이다)
    private DeliveryStatus status; //READY, COMP
}
