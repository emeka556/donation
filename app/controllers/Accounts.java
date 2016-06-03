package controllers;

import models.User;
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

}
