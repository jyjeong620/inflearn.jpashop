package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable     //내장할수있게
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    /**
     * JPA에서 기본생성자를 만들어줘야하기때문에
     */
    protected Address() {
    }

    /**
     * 값타입 변경 불가능하게 설계하기위해 @Setter 를 제거하고 생성자에서 초기화 할수있도록 만듬
     */
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
