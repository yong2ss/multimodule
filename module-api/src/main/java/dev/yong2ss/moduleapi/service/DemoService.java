package dev.yong2ss.moduleapi.service;

import dev.yong2ss.moduleapi.exception.CustomException;
import dev.yong2ss.modulecommon.domain.Member;
import dev.yong2ss.modulecommon.enums.CodeEnum;
import dev.yong2ss.modulecommon.repository.MemberRepository;
import dev.yong2ss.modulecommon.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DemoService {

    private final CommonService commonService;
    private final MemberRepository memberRepository;

    public String save() {
        memberRepository.save(Member.builder()
                .name(Thread.currentThread().getName())
                .build());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB Member size : " + size);
        log.info("DB Member size : " + size);
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }
}
