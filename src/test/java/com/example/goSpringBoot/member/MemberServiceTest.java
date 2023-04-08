package com.example.goSpringBoot.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {

        // given
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        Member memberB = new Member(2L, "memberB", Grade.BASIC);

        // when
        memberService.join(memberA);
        Member findMemberA = memberService.findMember(memberA.getId());

        // then
        Assertions.assertThat(memberA).isEqualTo(findMemberA);

    }

}
