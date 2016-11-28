package com.jaydot2.server.controller;

import com.jaydot2.server.dao.DAOMongoDBImpl;
import com.jaydot2.server.model.ContactMessage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jamesbray on 11/27/16.
 */
@RestController
@CrossOrigin
@RequestMapping("/jaydot2/services")
@EnableAutoConfiguration
public class ContactUsController {

    private static final Logger LOG = LogManager.getLogger(ContactUsController.class);

    private DAOMongoDBImpl dao;

    public static void main(String[] args) {
        SpringApplication.run(ContactUsController.class, args);
    }

    @CrossOrigin
    @RequestMapping(value="/insert/{email}/{message}")
    public String insertRecord(@PathVariable("email") String email, @PathVariable("message") String message) {
        LOG.debug("::ENTER:: ContactUsController.insertRecord(String,String)...");
        String result = null;
        ContactMessage contactMessage = new ContactMessage(email, message);
        dao = DAOMongoDBImpl.getInstance();
        dao.insertRecord(contactMessage);
        LOG.debug("::EXIT:: ContactUsController.insertRecord(String,String)...");
        return result;
    }
}
