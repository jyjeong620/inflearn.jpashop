package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("M") // 구분 컬럼에 입력할 값을 지정
public class Movie extends Item {

    private String director;
    private String actor;
}
