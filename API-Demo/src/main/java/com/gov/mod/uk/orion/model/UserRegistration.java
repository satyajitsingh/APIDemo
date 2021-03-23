package com.gov.mod.uk.orion.model;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	
	private List<User> userRecords;

    private static UserRegistration usrregd = null;

    private UserRegistration(){
    	userRecords = new ArrayList<User>();
    }

    public static UserRegistration getInstance() {

        if(usrregd == null) {
        	usrregd = new UserRegistration();
              return usrregd;
            }
            else {
                return usrregd;
            }
    }

    public void add(User usr) {
    	userRecords.add(usr);
    }

public String upDateUser(User usr) {

for(int i=0; i<userRecords.size(); i++)
        {
            User usrn = userRecords.get(i);
            if(usrn.getUserID().equals(usr.getUserID())) {
            	userRecords.set(i, usr);//update the new record
              return "Update successful";
            }
        }

return "Update un-successful";
}

public String deleteStudent(String userID) {

for(int i=0; i<userRecords.size(); i++)
        {
            User usrn = userRecords.get(i);
            if(usrn.getUserID().equals(userID)){
              userRecords.remove(i);//update the new record
              return "Delete successful";
            }
        }

return "Delete un-successful";
}

    public List<User> getUserRecords() {
    return userRecords;
    }

}
