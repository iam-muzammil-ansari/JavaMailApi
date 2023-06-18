package org.example.controller;

import org.example.EmailService;
import org.example.objects.ObjectA;
import org.example.objects.ObjectB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private final ObjectA objectA;
    private final EmailService emailService;

    @Autowired
    public MyController(ObjectA objectA, EmailService emailService) {
        this.objectA = objectA;
        this.emailService = emailService;
    }

    @GetMapping("/objects")
    public String getObjects() {
        ObjectB objectB = objectA.getObjectB();

        if (objectB != null) {
            String subject = "Object from Spring Framework";
            String message = "Object A: " + objectA + "\nObject B: " + objectB;
            emailService.sendEmail(subject, message);
            return objectA.toString() + "\n" +objectB.toString();
        } else {
            return "Object A: " + objectA + "\nObject B: " + objectB;
        }
    }
}
