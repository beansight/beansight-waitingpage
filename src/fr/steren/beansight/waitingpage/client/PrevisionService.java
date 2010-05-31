package fr.steren.beansight.waitingpage.client;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("previsions")
public interface PrevisionService extends RemoteService {

	public void addWaitingEmail(String email);
	
}
