package com.example.goSpringBoot;

import com.example.goSpringBoot.member.Grade;
import com.example.goSpringBoot.member.Member;
import com.example.goSpringBoot.member.MemberService;
import com.example.goSpringBoot.member.MemberServiceImpl;
import com.example.goSpringBoot.order.Order;
import com.example.goSpringBoot.order.OrderService;
import com.example.goSpringBoot.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.createOrder(memberA.getId(), "itemA", 10000);
        System.out.println(order);
        System.out.println(order.calculatePrice());

    }

}
