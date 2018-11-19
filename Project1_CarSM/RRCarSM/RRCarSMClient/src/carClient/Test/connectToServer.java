package carClient.Test;

import carClient.Utils.ClientRequestAndResponse;
import carClient.View.ClientView;
import carClient.View.ClientWelcomeView;

public class connectToServer {
	public static void main(String[] args) {
		ClientView clientView = new ClientWelcomeView();
		while(clientView!=null) {
			clientView.showCurrentView();
		}
	}
}
