package com.example.gcm;

public interface Config {
    
    // CONSTANTS
    static final String YOUR_SERVER_URL =  
                          "nuaccrepo.mywebcommunity.org/faxtest/gcm/gcm_server_files/register.php";
     
    // Google project id
    static final String GOOGLE_SENDER_ID = "463178114234"; 
 
    /**
     * Tag used on log messages.
     */
    static final String TAG = "GCM Android Example";
 
    static final String DISPLAY_MESSAGE_ACTION =
            "com.example.gcm.DISPLAY_MESSAGE";
 
    static final String EXTRA_MESSAGE = "message";
         
     
}