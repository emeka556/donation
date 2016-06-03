package controllers;

import models.User;
import play.Logger;
import play.mvc.Controller;

public class Accounts extends Controller{

	  public static void signup()
	  {
	    render();
	  }
	  
	  public static void register(User user)
	  {
	    user.save();
	    login();	    
	  }

	  public static void login()
	  {
	    render();
	  }

	  public static void logout()
	  {
	    session.clear();
	    Welcome.index();
	  }
	  
	  public static User getCurrentUser()
	  {
	    String userId = session.get("logged_in_userid");
	    if (userId == null)
	    {
	      return null;
	    }
	    User logged_in_user = User.findById(Long.parseLong(userId));
	    Logger.info("In Accounts controller: Logged in user is " + logged_in_user.firstName);
	    return logged_in_user;
	  }


}
