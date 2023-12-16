package hello.login.web.session;

import hello.login.domain.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.http.HttpServletResponse;

class SessionManagerTest {

    SessionManager sessionManager = new SessionManager();

    @Test
    void sessionTest() {
        HttpServletResponse response = new MockHttpServletResponse(); // 가짜로 http response를 경험할 수 있게s

        Member member = new Member();
        // 세션 생성
        sessionManager.createSession(member, response);

    }

}