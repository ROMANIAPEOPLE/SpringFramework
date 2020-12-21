//package me.kh.springframework;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppRunner implements ApplicationRunner {
//    @Autowired
//    ApplicationContext act;
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(act.getBean(Proto.class));
//        System.out.println(act.getBean(Proto.class));
//        System.out.println(act.getBean(Proto.class));
//
//        System.out.println("------------");
//
//        System.out.println(act.getBean(Single.class));
//        System.out.println(act.getBean(Single.class));
//        System.out.println(act.getBean(Single.class));
//
//        System.out.println("------------");
//
//        System.out.println(act.getBean(Single.class).getProto());
//        System.out.println(act.getBean(Single.class).getProto());
//        System.out.println(act.getBean(Single.class).getProto());
//
//    }
//}
