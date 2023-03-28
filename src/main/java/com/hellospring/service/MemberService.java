package com.hellospring.service;

import com.hellospring.domain.Member;
import com.hellospring.repository.MemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemberRepository() ;
    /**
     * 회원 가입
     */
    public Long join(Memberer member) {
        memberRepository.save(member);
        return member.getId();

    }

}
