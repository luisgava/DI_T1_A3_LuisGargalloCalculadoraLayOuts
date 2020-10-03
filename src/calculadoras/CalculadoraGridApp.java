package calculadoras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CalculadoraGridApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String num1=null;	
	private String num2=null;
	private String operacion;
	
	private JButton btnSuma;
	private JLabel lblOperacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGridApp frame = new CalculadoraGridApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraGridApp() {
		

		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\img\\calculadora.png"));
		setResizable(false);
		setTitle("Calculadora Grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 4, 5, 5));

		JButton btnResultado = new JButton("=");
		btnResultado.setBackground(new Color(245, 222, 179));
		contentPane.add(btnResultado);

		// Label para dejar espacio blanco en el grid
		JLabel lblBlanca1 = new JLabel("");
		contentPane.add(lblBlanca1);

		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);

		// Label para dejar espacio blanco en el grid
		lblOperacion = new JLabel("");
		contentPane.add(lblOperacion);

		// Listeners
		ListenerBotonNumerico listenerBotonNumerico = new ListenerBotonNumerico();
		ListenerBotonOperacion listenerBotonOperacion = new ListenerBotonOperacion();

		JButton btn7 = new JButton("7");
		btn7.addActionListener(listenerBotonNumerico);
		btn7.setBackground(new Color(250, 128, 114));
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(listenerBotonNumerico);
		btn8.setBackground(new Color(250, 128, 114));
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(listenerBotonNumerico);
		btn9.setBackground(new Color(250, 128, 114));
		contentPane.add(btn9);

		btnSuma = new JButton("+");
		btnSuma.addActionListener(listenerBotonOperacion);		
		btnSuma.setBackground(new Color(189, 183, 107));
		contentPane.add(btnSuma);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(listenerBotonNumerico);
		btn4.setBackground(new Color(250, 128, 114));
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(listenerBotonNumerico);
		btn5.setBackground(new Color(250, 128, 114));
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(listenerBotonNumerico);
		btn6.setBackground(new Color(250, 128, 114));
		contentPane.add(btn6);

		JButton btnResta = new JButton("-");
		btnResta.addActionListener(listenerBotonOperacion);	
		btnResta.setBackground(new Color(189, 183, 107));
		contentPane.add(btnResta);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(listenerBotonNumerico);
		btn1.setBackground(new Color(250, 128, 114));
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(listenerBotonNumerico);
		btn2.setBackground(new Color(250, 128, 114));
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(listenerBotonNumerico);
		btn3.setBackground(new Color(250, 128, 114));
		contentPane.add(btn3);

		JButton btnMultiplicacion = new JButton("X");
		btnMultiplicacion.addActionListener(listenerBotonOperacion);	
		btnMultiplicacion.setBackground(new Color(189, 183, 107));
		contentPane.add(btnMultiplicacion);

		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(240, 230, 140));
		contentPane.add(btnClear);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(listenerBotonNumerico);
		btn0.setBackground(new Color(250, 128, 114));
		contentPane.add(btn0);

		JButton btnComa = new JButton(".");
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
					textField.setText(textField.getText() + ((AbstractButton) e.getSource()).getText());
				}
			}
		});
		btnComa.setBackground(new Color(240, 230, 140));
		contentPane.add(btnComa);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(listenerBotonOperacion);	
		btnDivision.setBackground(new Color(189, 183, 107));
		contentPane.add(btnDivision);

	}

	public class ListenerBotonNumerico implements ActionListener {
		public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText() + ((AbstractButton) e.getSource()).getText());
			
		}
	}
	
	public class ListenerBotonOperacion implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			num1 = textField.getText();	
			textField.setText("");
			operacion = ((AbstractButton) e.getSource()).getText();
			((AbstractButton) e.getSource()).setBackground(new Color(0,255,255));
			lblOperacion.setText(operacion);			
		}
		
	}
}
