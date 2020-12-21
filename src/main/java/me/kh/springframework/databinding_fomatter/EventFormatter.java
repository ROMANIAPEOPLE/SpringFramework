package me.kh.springframework.databinding_fomatter;

import me.kh.springframework.databinding.Event;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EventFormatter implements Formatter<Event> {
    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(text));
    }


    @Override
    public String print(Event event, Locale locale) {
        return event.getId().toString();
    }
}
