package com.example.goSpringBoot;

import com.example.goSpringBoot.member.Grade;
import com.example.goSpringBoot.member.Member;
import com.example.goSpringBoot.member.MemberService;
import com.example.goSpringBoot.member.MemberServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoSpringBootApplication {

	public static void main(String[] args) {

		MemberService memberService = new MemberServiceImpl();
		Member memberA = new Member(1L, "memberA", Grade.VIP);
		Member memberB = new Member(2L, "memberB", Grade.BASIC);
		memberService.join(memberA);
		memberService.join(memberB);

		Member findMemberA = memberService.findMember(1L);
		System.out.println(findMemberA.getName());

	}

}
