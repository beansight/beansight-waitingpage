package fr.steren.beansight.waitingpage.client;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PrevisionServiceAsync {

	  public void addWaitingEmail(String email, AsyncCallback<Void> callback);
}
