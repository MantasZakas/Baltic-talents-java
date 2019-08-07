package homework2;

import java.io.Serializable;

public class Message implements Serializable{

	private static final long serialVersionUID = 1L;
	String message;
	String date;
	
	/**
	 * @param message
	 * @param date
	 */
	public Message(String message, String date) {
		this.message = message;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", date=" + date + "]";
	}
	
}
