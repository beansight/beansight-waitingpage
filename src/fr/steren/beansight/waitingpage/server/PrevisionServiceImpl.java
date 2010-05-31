package fr.steren.beansight.waitingpage.server;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.steren.beansight.waitingpage.client.PrevisionService;

public class PrevisionServiceImpl extends RemoteServiceServlet implements PrevisionService {

  private static final PersistenceManagerFactory PMF =
      JDOHelper.getPersistenceManagerFactory("transactions-optional");

 	
	public void addWaitingEmail(String email) {
	    // add opinion
	    PersistenceManager pm = getPersistenceManager();
	    try {
	      pm.makePersistent(new WaitingEmail(email));
	    } finally {
		      pm.close();
	    }
	}
  

  private PersistenceManager getPersistenceManager() {
    return PMF.getPersistenceManager();
  }

}
