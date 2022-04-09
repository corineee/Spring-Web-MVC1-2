package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController //문자를 반환하면 String 이 그대로 반환된다.
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);
//        log.info(" info log="+ name); 사용하면 안된다. 자바는 연산이 먼저 일어나서 쓸모없는 리소스 발생하기 때문이다.

        log.trace("trace log={}", name);
        log.debug("debug log={}", name); //개발서버
        log.info(" info log={}", name); //비지니스 정보, 운영시스템 로그
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
