package com.jaydot2.server.controller;

import com.jaydot2.server.dao.DAOMongoDBImpl;
import com.jaydot2.server.model.ContactMessage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jamesbray on 11/27/2016.
 * Modified by jamesbray on 02/19/2018
 */
@RestController
@CrossOrigin
@RequestMapping("/jaydot2/services")
public class ContactUsController {

    private static final Logger LOG = LogManager.getLogger(ContactUsController.class);

    @Autowired
    private DAOMongoDBImpl dao;

    /**
     * Default service operation
     * @return
     */
    @CrossOrigin
    @RequestMapping( value = "/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET )
    public Map<String,String> home() {
        Map<String,String> result = new HashMap<String, String>();
        result.put("data","default service response");
        return result;
    }

    @CrossOrigin
    @RequestMapping(value="/insert/{email}/{message}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String insertRecord(@PathVariable("email") String email, @PathVariable("message") String message) {
        LOG.debug("::ENTER:: ContactUsController.insertRecord(String,String)...");
        String result = null;
        ContactMessage contactMessage = new ContactMessage(email, message);
        dao = DAOMongoDBImpl.getInstance();
        dao.insertRecord(contactMessage);
        LOG.debug("::EXIT:: ContactUsController.insertRecord(String,String)...");
        result = "success";
        return result;
    }

    /**
     * <p>
     *     Operation used to add a new user record to the data repository
     * </p>
     * @return
     */
    @CrossOrigin
    @RequestMapping( value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
    public boolean createUser() {
        boolean result = false;

        return result;
    }
}
