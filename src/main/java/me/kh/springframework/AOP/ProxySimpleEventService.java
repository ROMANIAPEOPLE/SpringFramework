//package me.kh.springframework.AOP;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
///**
// * 동적으로 프록시를 생성하는 방법이 아님.
// * 이 예제에서는 더이상 사용하지 않음.
// */
//
//@Primary
//@Service
//public class ProxySimpleEventService implements  EventService {
//
//    @Autowired
//    EventService simpleEventService;
//
//    @Override
//    public void createEvent() {
//        long begin = System.currentTimeMillis();
//        simpleEventService.createEvent();
//        System.out.println(begin-System.currentTimeMillis());
//    }
//
//    @Override
//    public void publishEvent() {
//        long begin = System.currentTimeMillis();
//        simpleEventService.publishEvent();
//        System.out.println(begin-System.currentTimeMillis());
//    }
//
//    @Override
//    public void deleteEvent() {
//        simpleEventService.deleteEvent();
//
//    }
//}
