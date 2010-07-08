package fr.steren.beansight.waitingpage.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Beansight_WaitingPage implements EntryPoint {

	private LalistConstants constants = GWT.create(LalistConstants.class);
	// leave your email
	private TextBox addEmailTextbox = new TextBox();
	private Button addEmailButton = new Button("Ok");
	private Label addEmailConfirm = new Label("");

	private PrevisionServiceAsync previsionService = GWT
			.create(PrevisionService.class);

	/**
	 * Entry point method.
	 */
	public void onModuleLoad() {
		// Set the window title, the header and powered by text, and the Add
		// button text.
		//Window.setTitle(constants.sitename());
		//RootPanel.get("sitename").add(new Label(constants.sitename()));

		// Baseline
		//RootPanel.get("baseline").getElement().setInnerText("");
		//RootPanel.get("baseline").add(new Label(constants.baseline()));

		addEmailTextbox.setStylePrimaryName("inputTextField");
		
		HorizontalPanel enterEmail = new HorizontalPanel();
		enterEmail.add(addEmailTextbox);
		enterEmail.add(addEmailButton);
		
		VerticalPanel emailInputSystem = new VerticalPanel();
		emailInputSystem.add(enterEmail);
		emailInputSystem.add(addEmailConfirm);
		
		RootPanel.get("enterEmail").add(emailInputSystem);

		// Move cursor focus to the input box.
		addEmailTextbox.setFocus(true);
		
		addEmailButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				sendEmail();
			}
		});

		addEmailTextbox.addKeyPressHandler(new KeyPressHandler() {
			@Override
			public void onKeyPress(KeyPressEvent event) {
				if (event.getCharCode() == KeyCodes.KEY_ENTER) {
					sendEmail();
				}
			}
		});
	}

	private void sendEmail() {
		final String email = addEmailTextbox.getText().trim();
		addEmailButton.setFocus(true);

		// check if empty
		if (email.equals("")) {
			return;
		}

		previsionService.addWaitingEmail(email, new AsyncCallback<Void>() {
			public void onFailure(Throwable error) {
			}

			public void onSuccess(Void ignore) {
				addEmailConfirm.setText("Thanks! We've got your e-mail.");
				addEmailTextbox.setText("");
			}
		});

	}

}