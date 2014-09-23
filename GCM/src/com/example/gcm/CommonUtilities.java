package com.example.gcm;

import android.content.Context;
import android.content.Intent;

public class CommonUtilities {
    
   // give your server registration url here
   static final String SERVER_URL = "http://nuaccrepo.mywebcommunity.org/faxtest/gcm/register.php"; 

   // Google project id
   static final String SENDER_ID = "463178114234"; 

   /**
    * Tag used on log messages.
    */
   static final String TAG = "MY GCM";

   static final String DISPLAY_MESSAGE_ACTION =
           "com.example.gcm.DISPLAY_MESSAGE";

   static final String EXTRA_MESSAGE = "message";
   
   
   public static final String PROPERTY_REG_ID = "registration_id";
   public static final String PROPERTY_APP_VERSION = "appVersion";
   
   /**
    * Notifies UI to display a message.
    * <p>
    * This method is defined in the common helper because it's used both by
    * the UI and the background service.
    *
    * @param context application's context.
    * @param message message to be displayed.
    */
   static void displayMessage(Context context, String message) {
       Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
       intent.putExtra(EXTRA_MESSAGE, message);
       context.sendBroadcast(intent);
   }
}
