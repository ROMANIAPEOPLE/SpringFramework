package me.kh.springframework.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppResourceRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource resource = resourceLoader.getResource("classpath:text.txt");
        System.out.println("exist " + resource.exists());
        System.out.println("Description " + resource.getDescription());
        System.out.println("URI " + Files.readString(Path.of(resource.getURI())));
    }
}
