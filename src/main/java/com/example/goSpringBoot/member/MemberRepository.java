package com.example.goSpringBoot.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);

}
