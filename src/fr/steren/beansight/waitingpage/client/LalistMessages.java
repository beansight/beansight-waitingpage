package fr.steren.beansight.waitingpage.client;

import com.google.gwt.i18n.client.Messages;

import java.util.Date;

public interface LalistMessages extends Messages {

  @DefaultMessage("Last update: {0,date,medium} {0,time,medium}")
  String lastUpdate(Date timestamp);

}
