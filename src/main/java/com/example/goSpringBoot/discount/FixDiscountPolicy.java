package com.example.goSpringBoot.discount;

import com.example.goSpringBoot.member.Grade;
import com.example.goSpringBoot.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    // 1000 고정 할인
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        
        // enum 타입은 == 사용
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
        
    }

}
