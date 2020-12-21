package me.kh.springframework.valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;


@Component
public class AppValidRunner implements ApplicationRunner {
    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event = new Event();
        //event의 title이 null인 상태

        Errors errors = new BeanPropertyBindingResult(event,"eventTitle");

        validator.validate(event,errors);

        //에러코드 출력
        System.out.println(errors.hasErrors());
        errors.getAllErrors().forEach(e -> {
            System.out.println("====error code=====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
        });
    }
}
