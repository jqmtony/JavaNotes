package carClient.Test;

import java.io.IOException;

import carClient.View.ClientView;
import carClient.View.ClientWelcomeView;

public class connectToServer {
	public static void main(String[] args) throws IOException {
		ClientView clientView = new ClientWelcomeView();
		while(clientView!=null) {
			clientView.showCurrentView();
		}
	}
}
