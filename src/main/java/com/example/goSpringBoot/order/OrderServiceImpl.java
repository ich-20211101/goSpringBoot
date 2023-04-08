package com.example.goSpringBoot.order;

import com.example.goSpringBoot.discount.DiscountPolicy;
import com.example.goSpringBoot.discount.FixDiscountPolicy;
import com.example.goSpringBoot.member.Member;
import com.example.goSpringBoot.member.MemberRepository;
import com.example.goSpringBoot.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
