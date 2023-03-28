package com.hellospring.repository;

import com.hellospring.domain.Member;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MemberRepository {
    public Member save(Member member);
    public Optional<Member> findById(Long id);
    public Optional<Member> findByName(String name);

}
