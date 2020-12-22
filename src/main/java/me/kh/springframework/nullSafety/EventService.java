package me.kh.springframework.nullSafety;

import org.springframework.context.annotation.Primary;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EventService {

    @NonNull
    public String createEvent(@NonNull String name) {
        return "hello " + name;
    }


}
