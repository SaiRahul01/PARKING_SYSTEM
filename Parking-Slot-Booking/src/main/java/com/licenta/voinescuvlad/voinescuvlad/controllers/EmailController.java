package com.licenta.voinescuvlad.voinescuvlad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;

@Controller
public class EmailController {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendOtp(String to, String username,String otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("your email");
        message.setTo(to);
        message.setSubject("OTP for the Web App");
        message.setText("Welcome " + username +"\n"+ "Your Otp is " + otp);
        javaMailSender.send(message);
    }
    public void sendHelloEmail(String to, String username) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("your email");
        message.setTo(to);
        message.setSubject("HELLO WORLD!");
        message.setText("Welcome " + username + "\nYour Registration is Successful.\n"+ "Thank You, We Hope You Enjoy Our Services!");
        javaMailSender.send(message);
    }

    public void sendBookingInfoForCustomer(String userName,String email, String checkin,String checkout,String parkingName,String parkingCity,String parkingCountry,String street){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("your email");
        message.setTo(email);
        String capitalizaedUserName = userName.substring(0, 1).toUpperCase()+userName.substring(1);
        message.setSubject("Reservation made successfully!!");
        message.setText("Welcome, " + capitalizaedUserName + ". Your parking has been reserved succesfully between "+checkin
                +" and "+checkout+"");
        javaMailSender.send(message);

    }



    private void sendPreparedMail(String body, String sendTo, String subject) {
        try {
            MimeMessage mail = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(sendTo);
            helper.setSubject(subject);
            helper.setText(body, true);
            javaMailSender.send(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
