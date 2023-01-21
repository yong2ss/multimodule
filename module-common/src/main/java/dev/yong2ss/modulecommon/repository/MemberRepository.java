package dev.yong2ss.modulecommon.repository;

import dev.yong2ss.modulecommon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
