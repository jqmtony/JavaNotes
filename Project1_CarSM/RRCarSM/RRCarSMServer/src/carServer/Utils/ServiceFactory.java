package carServer.Utils;


public class ServiceFactory {

	public String getService(String str) {
		String[] array = str.split("#");
		String response = null;
		switch (array[0]) {
		case "Login":
			response = "login!!!!!!";
			break;
		default:
			response = "other";
		}
		return response;
	}

}
