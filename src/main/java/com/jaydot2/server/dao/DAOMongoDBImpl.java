package com.jaydot2.server.dao;

import com.jaydot2.server.model.ContactMessage;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by jamesbray on 11/27/16.
 */
@Component("mongoDao")
public class DAOMongoDBImpl {

    private static final Logger LOG = LogManager.getLogger(DAOMongoDBImpl.class);

    private static final String TAG = "DAOMongoDBImpl";

    protected static final String CONTACT_EMAIL = "email";
    protected static final String CONTACT_MESSAGE = "message";

    private DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    private static DAOMongoDBImpl dao;
    private MongoClient mongoClient;
    private String host = "localhost";
    private int port = 27017;

    // 2016-07-17T23:46:20.993Z
    //final DateTimeFormatter dateInputFormat = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
    //final DateTimeFormatter dateOutputFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public static DAOMongoDBImpl getInstance() {
        if(dao == null) {
            dao = new DAOMongoDBImpl();
        }
        return dao;
    }

    /**
     *
     * @param server
     * @param port
     */
    public void setDatabaseConnection(String server, int port) {
        LOG.debug(TAG + " ::ENTER:: setDatabaseConnection(String,int)...");
        if(mongoClient == null) {
            mongoClient = new MongoClient(server,port);
        }
        LOG.debug(TAG + " ::EXIT:: setDatabaseConnection(String,int)...");
    }

    /**
     *
     * @param cs
     * @return
     */
    public String insertRecord(ContactMessage cs) {
        LOG.debug("::ENTER:: " + TAG + ".insertRecord(ContactMessage)...");
        String result = "success";
        if(mongoClient == null) {
            setDatabaseConnection(host,port);
        }

        MongoDatabase db = mongoClient.getDatabase("jaydot2");
        MongoCollection<Document> messagesCollection = db.getCollection("messages");

        Document cmDoc = new Document(CONTACT_EMAIL, cs.getEmail()).append(CONTACT_MESSAGE, cs.getMessage());

        messagesCollection.insertOne(cmDoc);

        LOG.debug("::EXIT:: " + TAG + ".insertRecord(ContactMessage)...");
        return result;
    }
}
