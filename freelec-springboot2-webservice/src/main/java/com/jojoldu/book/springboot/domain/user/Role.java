package com.jojoldu.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "손님"), //권한 코드에 `ROLE_`로 시작하는 것 필수.
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
