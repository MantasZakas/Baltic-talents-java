package homework2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.gson.Gson;

public class Execution {

	/**
	 * Write recipes to file
	 * @throws IOException
	 */
	public static void writeMessageToFile (Message newMessage) throws IOException { //TODO delete or replace
		FileOutputStream fos = new FileOutputStream(new File("abc.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(newMessage);
		oos.close();
		fos.close();
	}
	
	/**
	 * Write the supplied string to file
	 * @param message
	 */
	public static void writeToFile (String message) {
		try(FileWriter fw = new FileWriter("abc.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(message);
			    
			} catch (IOException e) {
			    System.out.println("Error");
			}
	}
	
	public static void main(String[] args) {

		Gson gson = new Gson();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		JFrame f = new JFrame("Message log");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		f.add(jp);
		JTextField messageBox = new JTextField(25);
		jp.add(messageBox);
		JButton log = new JButton("Log");
		jp.add(log);
		f.getRootPane().setDefaultButton(log);
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Message newMessage = new Message(messageBox.getText(), dtf.format(LocalDateTime.now()));
				writeToFile(gson.toJson(newMessage));
				messageBox.setText("");
			}
		});
		f.setSize(400, 200);
		f.setVisible(true);		
	}

}
