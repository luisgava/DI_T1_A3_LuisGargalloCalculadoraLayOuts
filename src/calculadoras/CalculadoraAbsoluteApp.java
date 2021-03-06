package calculadoras;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CalculadoraAbsoluteApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String num1 = "0";
	private String num2 = "0";
	private String operacion = "";
	private JLabel lblOperacion;

	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;

	private JButton btnComa;
	private JButton btnClear;

	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplicacion;
	private JButton btnDivision;
	private JButton btnResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraAbsoluteApp frame = new CalculadoraAbsoluteApp();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Clase para crear el frame
	 */
	public CalculadoraAbsoluteApp() {

		// Frame
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\img\\calculadora.png"));
		setResizable(false);
		setTitle("Calculadora Absolute");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Listeners
		ListenerBotonNumerico listenerBotonNumerico = new ListenerBotonNumerico();
		ListenerBotonOperacion listenerBotonOperacion = new ListenerBotonOperacion();
		ListenerBotonIgual listenerBotonIgual = new ListenerBotonIgual();
		ListenerBotonComa listenerBotonComa = new ListenerBotonComa();
		ListenerBotonClear listenerBotonClear = new ListenerBotonClear();
		contentPane.setLayout(null);

		// TextField para los n�meros y el resultado
		textField = new JTextField();
		textField.setBounds(112, 14, 68, 50);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setColumns(15);
		contentPane.add(textField);

		// Label operaci�n
		lblOperacion = new JLabel(operacion);
		lblOperacion.setBounds(70, 14, 50, 50);
		contentPane.add(lblOperacion);

		// Bot�n 1
		btn1 = new JButton("1");
		btn1.setBounds(10, 197, 50, 50);
		btn1.addActionListener(listenerBotonNumerico);
		btn1.setBackground(new Color(250, 128, 114));
		contentPane.add(btn1);

		// Bot�n 2
		btn2 = new JButton("2");
		btn2.setBounds(70, 197, 50, 50);
		btn2.addActionListener(listenerBotonNumerico);
		btn2.setBackground(new Color(250, 128, 114));
		contentPane.add(btn2);

		// Bot�n 3
		btn3 = new JButton("3");
		btn3.setBounds(130, 197, 50, 50);
		btn3.addActionListener(listenerBotonNumerico);
		btn3.setBackground(new Color(250, 128, 114));
		contentPane.add(btn3);

		// Bot�n 4
		btn4 = new JButton("4");
		btn4.setBounds(10, 136, 50, 50);
		btn4.addActionListener(listenerBotonNumerico);
		btn4.setBackground(new Color(250, 128, 114));
		contentPane.add(btn4);

		// Bot�n 5
		btn5 = new JButton("5");
		btn5.setBounds(70, 136, 50, 50);
		btn5.addActionListener(listenerBotonNumerico);
		btn5.setBackground(new Color(250, 128, 114));
		contentPane.add(btn5);

		// Bot�n 6
		btn6 = new JButton("6");
		btn6.setBounds(130, 136, 50, 50);
		btn6.addActionListener(listenerBotonNumerico);
		btn6.setBackground(new Color(250, 128, 114));
		contentPane.add(btn6);

		// Bot�n 7
		btn7 = new JButton("7");
		btn7.setBounds(10, 75, 50, 50);
		btn7.addActionListener(listenerBotonNumerico);
		btn7.setBackground(new Color(250, 128, 114));
		contentPane.add(btn7);

		// Bot�n 8
		btn8 = new JButton("8");
		btn8.setBounds(70, 75, 50, 50);
		btn8.addActionListener(listenerBotonNumerico);
		btn8.setBackground(new Color(250, 128, 114));
		contentPane.add(btn8);

		// Bot�n 9
		btn9 = new JButton("9");
		btn9.setBounds(130, 75, 50, 50);
		btn9.addActionListener(listenerBotonNumerico);
		btn9.setBackground(new Color(250, 128, 114));
		contentPane.add(btn9);

		// Bot�n 0
		JButton btn0 = new JButton("0");
		btn0.setBounds(70, 258, 50, 50);
		btn0.addActionListener(listenerBotonNumerico);
		btn0.setBackground(new Color(250, 128, 114));
		contentPane.add(btn0);

		// Bot�n .
		btnComa = new JButton(".");
		btnComa.setBounds(10, 258, 50, 50);
		btnComa.addActionListener(listenerBotonComa);
		btnComa.setBackground(new Color(240, 230, 140));
		contentPane.add(btnComa);

		// Bot�n +
		btnSuma = new JButton("+");
		btnSuma.setBounds(219, 75, 50, 50);
		btnSuma.addActionListener(listenerBotonOperacion);
		btnSuma.setBackground(new Color(189, 183, 107));
		btnSuma.setEnabled(false);
		contentPane.add(btnSuma);

		// Bot�n -
		btnResta = new JButton("-");
		btnResta.setBounds(219, 136, 50, 50);
		btnResta.addActionListener(listenerBotonOperacion);
		btnResta.setBackground(new Color(189, 183, 107));
		btnResta.setEnabled(false);
		contentPane.add(btnResta);

		// Bot�n X
		btnMultiplicacion = new JButton("X");
		btnMultiplicacion.setBounds(219, 197, 50, 50);
		btnMultiplicacion.addActionListener(listenerBotonOperacion);
		btnMultiplicacion.setBackground(new Color(189, 183, 107));
		btnMultiplicacion.setEnabled(false);
		contentPane.add(btnMultiplicacion);

		// Bot�n /
		btnDivision = new JButton("/");
		btnDivision.setBounds(219, 258, 50, 50);
		btnDivision.addActionListener(listenerBotonOperacion);
		btnDivision.setBackground(new Color(189, 183, 107));
		btnDivision.setEnabled(false);
		contentPane.add(btnDivision);

		// Bot�n C
		btnClear = new JButton("C");
		btnClear.setBounds(10, 14, 50, 50);
		btnClear.addActionListener(listenerBotonClear);
		btnClear.setBackground(new Color(240, 230, 140));
		contentPane.add(btnClear);

		// Bot�n =
		btnResultado = new JButton("=");
		btnResultado.setBounds(130, 258, 50, 50);
		btnResultado.addActionListener(listenerBotonIgual);
		btnResultado.setBackground(new Color(245, 222, 179));
		btnResultado.setEnabled(false);
		contentPane.add(btnResultado);
		
		JLabel lblNewLabel = new JLabel("lblImg");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alu01-dam2\\eclipse-workspace\\DI_T1_A3_LuisGargalloCalculadoraLayOuts\\src\\img\\calculadora.png"));
		lblNewLabel.setBounds(223, 14, 46, 50);
		contentPane.add(lblNewLabel);

	}

	/**
	 * Clase para crear los listener de los botones num�ricos.
	 */
	private class ListenerBotonNumerico implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String valor = ((AbstractButton) e.getSource()).getText();
			textField.setText(textField.getText() + valor);
			if(operacion.equals("")) {
				btnSuma.setEnabled(true);
				btnResta.setEnabled(true);
				btnMultiplicacion.setEnabled(true);
				btnDivision.setEnabled(true);
			}
		}
	}

	/**
	 * Clase para crear los listener de los botones de operaciones.
	 */
	private class ListenerBotonOperacion implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			num1 = textField.getText();
			textField.setText("");
			operacion = ((AbstractButton) e.getSource()).getText();
			lblOperacion.setText(operacion);
			btnSuma.setEnabled(false);
			btnResta.setEnabled(false);
			btnMultiplicacion.setEnabled(false);
			btnDivision.setEnabled(false);
			btnResultado.setEnabled(true);
		}
	}

	/**
	 * Clase para crear el listener del bot�n =.
	 */
	private class ListenerBotonIgual implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			num2 = textField.getText();
			double resultado = 0;
			lblOperacion.setText("=");
			try {
				switch (operacion) {
				case "+":
					resultado = (Double.parseDouble(num1) + Double.parseDouble(num2));
					break;
				case "-":
					resultado = (Double.parseDouble(num1) - Double.parseDouble(num2));
					break;
				case "X":
					resultado = (Double.parseDouble(num1) * Double.parseDouble(num2));
					break;
				case "/":
					resultado = (Double.parseDouble(num1) / Double.parseDouble(num2));
					break;
				case "":
					resultado = (Double.parseDouble(num1));

				default:
					break;
				}
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			}
			textField.setText(String.valueOf(resultado));
		}
	}

	/**
	 * Clase para crear el listener del bot�n. S�lo funciona si hay alg�n numero en
	 * el textField
	 */
	private class ListenerBotonComa implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (!textField.getText().equals("")) {
				if (!textField.getText().contains(".")) {
					textField.setText(textField.getText() + ((AbstractButton) e.getSource()).getText());
				}
			}
		}
	}

	/**
	 * Clase para crear el listener del bot�n C.
	 */
	private class ListenerBotonClear implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			textField.setText("");
			lblOperacion.setText("   ");
			num1 = "0";
			num2 = "0";
			btnSuma.setEnabled(true);
			btnResta.setEnabled(true);
			btnMultiplicacion.setEnabled(true);
			btnDivision.setEnabled(true);
		}
	}
}
