package com.example.goSpringBoot.discount;

import com.example.goSpringBoot.member.Member;

public interface DiscountPolicy {

    // 할인 금액 return
    int discount(Member member, int price);

}