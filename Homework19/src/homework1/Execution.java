package homework1;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

public class Execution {

	public static ULocale locale = new ULocale("En");
	public static NumberFormat formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
	public static JLabel output;
	public static JTextField input;
	
	/**
	 * Display the number is the input field as words in a selected language
	 */
	public static void updateOutput() {
		try {
			output.setText(formatter.format(Double.parseDouble(input.getText())));
		} catch (Exception e) {
			output.setText("Invalid number");
		}			
	}
	
	public static void main(String[] args) {
		
		//construct a map containing locale codes
		Map<String, LinkedList<String>> languages = new TreeMap<String, LinkedList<String>>();
		languages.put("English", new LinkedList<String>());
		languages.get("English").add("En");
		languages.put("Lithuanian", new LinkedList<String>());
		languages.get("Lithuanian").add("Lt");
		languages.put("French", new LinkedList<String>());
		languages.get("French").add("Fr");
		languages.put("German", new LinkedList<String>());
		languages.get("German").add("De");
		languages.put("Russian", new LinkedList<String>());
		languages.get("Russian").add("Ru");
		
		//create the window and its components
		JFrame f = new JFrame("Numbers");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpOuter = new JPanel();
		f.add(jpOuter);
		JPanel jp = new JPanel();
		jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));
		jpOuter.add(jp);
		input = new JTextField(20);
		jp.add(input);
		output = new JLabel("Test");
		output.setMinimumSize(new Dimension(500, 20));
		output.setPreferredSize(new Dimension(500, 20));
		output.setMaximumSize(new Dimension(500, 20));
		jp.add(output);
		JComboBox<String> languageChooser = new JComboBox<String>();
		for (String language: languages.keySet()) {
			languageChooser.addItem(language);
		}
		jp.add(languageChooser);
		
		//listener that fires every time a change is made in the text field
		input.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				updateOutput();				
			}
			public void insertUpdate(DocumentEvent e) {
				updateOutput();				
			}			
			public void changedUpdate(DocumentEvent e) {
				updateOutput();
			}			
		});
		
		//combo box event listener that changes the locale of the number formatter
		languageChooser.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String localeCode = languages.get(languageChooser.getSelectedItem()).getFirst();
				locale = new ULocale(localeCode);
				formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
				updateOutput();			
			}
		});
				
		//display the window
		f.setSize(700, 200);
		f.setVisible(true);

	}

}
