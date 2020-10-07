package calculadoras;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CalculadoraGridApp extends JFrame {

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
					CalculadoraGridApp frame = new CalculadoraGridApp();
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
	public CalculadoraGridApp() {
		setBackground(new Color(245, 245, 220));

		// Frame
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\img\\calculadora.png"));
		setResizable(true);
		setTitle("Calculadora Grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 4, 5, 5));

		// Listeners
		ListenerBotonNumerico listenerBotonNumerico = new ListenerBotonNumerico();
		ListenerBotonOperacion listenerBotonOperacion = new ListenerBotonOperacion();
		ListenerBotonIgual listenerBotonIgual = new ListenerBotonIgual();
		ListenerBotonComa listenerBotonComa = new ListenerBotonComa();
		ListenerBotonClear listenerBotonClear = new ListenerBotonClear();

		// Botón =
		btnResultado = new JButton("=");
		btnResultado.addActionListener(listenerBotonIgual);
		btnResultado.setBackground(new Color(245, 222, 179));
		btnResultado.setEnabled(false);
		contentPane.add(btnResultado);

		// Label imagen
		lblOperacion = new JLabel("");
		contentPane.add(lblOperacion);

		// TextField para los números y el resultado
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);

		// Label para dejar espacio blanco en el grid
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("src\\img\\calculadora.png"));
		contentPane.add(lblImg);

		// Botón 7
		btn7 = new JButton("7");
		btn7.addActionListener(listenerBotonNumerico);
		btn7.setBackground(new Color(250, 128, 114));
		contentPane.add(btn7);

		// Botón 8
		btn8 = new JButton("8");
		btn8.addActionListener(listenerBotonNumerico);
		btn8.setBackground(new Color(250, 128, 114));
		contentPane.add(btn8);

		// Botón 9
		btn9 = new JButton("9");
		btn9.addActionListener(listenerBotonNumerico);
		btn9.setBackground(new Color(250, 128, 114));
		contentPane.add(btn9);

		// Botón +
		btnSuma = new JButton("+");
		btnSuma.addActionListener(listenerBotonOperacion);
		btnSuma.setBackground(new Color(189, 183, 107));
		btnSuma.setEnabled(false);
		contentPane.add(btnSuma);

		// Botón 4
		btn4 = new JButton("4");
		btn4.addActionListener(listenerBotonNumerico);
		btn4.setBackground(new Color(250, 128, 114));
		contentPane.add(btn4);

		// Botón 5
		btn5 = new JButton("5");
		btn5.addActionListener(listenerBotonNumerico);
		btn5.setBackground(new Color(250, 128, 114));
		contentPane.add(btn5);

		// Botón 6
		btn6 = new JButton("6");
		btn6.addActionListener(listenerBotonNumerico);
		btn6.setBackground(new Color(250, 128, 114));
		contentPane.add(btn6);

		// Botón -
		btnResta = new JButton("-");
		btnResta.addActionListener(listenerBotonOperacion);
		btnResta.setBackground(new Color(189, 183, 107));
		btnResta.setEnabled(false);
		contentPane.add(btnResta);

		// Botón 1
		btn1 = new JButton("1");
		btn1.addActionListener(listenerBotonNumerico);
		btn1.setBackground(new Color(250, 128, 114));
		contentPane.add(btn1);

		// Botón 2
		btn2 = new JButton("2");
		btn2.addActionListener(listenerBotonNumerico);
		btn2.setBackground(new Color(250, 128, 114));
		contentPane.add(btn2);

		// Botón 3
		btn3 = new JButton("3");
		btn3.addActionListener(listenerBotonNumerico);
		btn3.setBackground(new Color(250, 128, 114));
		contentPane.add(btn3);

		// Botón X
		btnMultiplicacion = new JButton("X");
		btnMultiplicacion.addActionListener(listenerBotonOperacion);
		btnMultiplicacion.setBackground(new Color(189, 183, 107));
		btnMultiplicacion.setEnabled(false);
		contentPane.add(btnMultiplicacion);

		// Botón C
		btnClear = new JButton("C");
		btnClear.addActionListener(listenerBotonClear);
		btnClear.setBackground(new Color(240, 230, 140));
		contentPane.add(btnClear);

		// Botón 0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(listenerBotonNumerico);
		btn0.setBackground(new Color(250, 128, 114));
		contentPane.add(btn0);

		// Botón .
		btnComa = new JButton(".");
		btnComa.addActionListener(listenerBotonComa);
		btnComa.setBackground(new Color(240, 230, 140));
		contentPane.add(btnComa);

		// Botón /
		btnDivision = new JButton("/");
		btnDivision.addActionListener(listenerBotonOperacion);
		btnDivision.setBackground(new Color(189, 183, 107));
		btnDivision.setEnabled(false);
		contentPane.add(btnDivision);

	}

	/**
	 * Clase para crear los listener de los botones numéricos.
	 */
	private class ListenerBotonNumerico implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String valor = ((AbstractButton) e.getSource()).getText();
			textField.setText(textField.getText() + valor);
			if (operacion.equals("")) {
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
	 * Clase para crear el listener del botón =.
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
	 * Clase para crear el listener del botón. Sólo funciona si hay algún numero en
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
	 * Clase para crear el listener del botón C.
	 */
	private class ListenerBotonClear implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			textField.setText("");
			lblOperacion.setText("");
			num1 = "0";
			num2 = "0";
			btnSuma.setEnabled(true);
			btnResta.setEnabled(true);
			btnMultiplicacion.setEnabled(true);
			btnDivision.setEnabled(true);
		}
	}
}
