import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculadora {

	private JFrame frmCalculadora;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setBackground(new Color(255, 175, 175));
		frmCalculadora.setFont(new Font("Arial", Font.PLAIN, 12));
		frmCalculadora.setForeground(Color.MAGENTA);
		frmCalculadora.setTitle("CALCULADORA");
		frmCalculadora.getContentPane().setFont(new Font("Arial", Font.PLAIN, 20));
		frmCalculadora.getContentPane().setEnabled(false);
		frmCalculadora.getContentPane().setForeground(new Color(255, 175, 175));
		frmCalculadora.setBounds(100, 100, 376, 455);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botaoSoma = new JButton("+");
		botaoSoma.setBackground(new Color(255, 255, 255));
		botaoSoma.setForeground(Color.ORANGE);
		botaoSoma.setBounds(263, 142, 41, 50);
		botaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmCalculadora.getContentPane().setLayout(null);
		frmCalculadora.getContentPane().add(botaoSoma);
		
		JButton botaoSubtrai = new JButton("-");
		botaoSubtrai.setBackground(Color.WHITE);
		botaoSubtrai.setForeground(Color.RED);
		botaoSubtrai.setBounds(263, 203, 41, 50);
		frmCalculadora.getContentPane().add(botaoSubtrai);
		
		JButton botaoMultiplica = new JButton("*");
		botaoMultiplica.setBackground(Color.WHITE);
		botaoMultiplica.setForeground(Color.BLUE);
		botaoMultiplica.setBounds(263, 264, 41, 51);
		frmCalculadora.getContentPane().add(botaoMultiplica);
		
		JButton botaoDividi = new JButton("/");
		botaoDividi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoDividi.setBackground(Color.WHITE);
		botaoDividi.setForeground(Color.MAGENTA);
		botaoDividi.setBounds(263, 328, 41, 48);
		frmCalculadora.getContentPane().add(botaoDividi);
		
		JButton botaoigual = new JButton("=");
		botaoigual.setBackground(Color.MAGENTA);
		botaoigual.setBounds(189, 326, 53, 50);
		frmCalculadora.getContentPane().add(botaoigual);
		
		JButton botaoUm = new JButton("1");
		botaoUm.setBounds(63, 264, 53, 50);
		frmCalculadora.getContentPane().add(botaoUm);
		botaoUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"1");
			}
			});
		
		JButton botaoDois = new JButton("2");
		botaoDois.setBounds(126, 264, 53, 50);
		frmCalculadora.getContentPane().add(botaoDois);
		botaoDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"2");
			}
			});
		
		JButton botaoTres = new JButton("3");
		botaoTres.setBounds(189, 264, 53, 51);
		frmCalculadora.getContentPane().add(botaoTres);
		botaoTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"3");
			}
			});
		
		JButton botaoQuatro = new JButton("4");
		botaoQuatro.setBounds(63, 203, 53, 50);
		frmCalculadora.getContentPane().add(botaoQuatro);
		botaoQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"4");
			}
			});
		
		JButton botaoCinco = new JButton("5");
		botaoCinco.setBounds(126, 203, 53, 50);
		botaoCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"5");
			}
			});
		frmCalculadora.getContentPane().add(botaoCinco);
		
		JButton botaoSeis = new JButton("6");
		botaoSeis.setBounds(189, 203, 53, 50);
		frmCalculadora.getContentPane().add(botaoSeis);
		botaoSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"6");
			}
			});
		
		JButton botaoSete = new JButton("7");
		botaoSete.setBounds(63, 142, 53, 50);
		frmCalculadora.getContentPane().add(botaoSete);
		botaoSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"7");
			}
			});
		
		JButton botaoOito = new JButton("8");
		botaoOito.setBounds(126, 142, 53, 50);
		frmCalculadora.getContentPane().add(botaoOito);
		botaoOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"8");
			}
			});
		
		JButton botaoNove = new JButton("9");
		botaoNove.setBounds(189, 142, 53, 50);
		frmCalculadora.getContentPane().add(botaoNove);
		botaoNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"9");
			}
			});
		
		JButton botaoZero = new JButton("0");
		botaoZero.setBounds(63, 325, 53, 50);
		frmCalculadora.getContentPane().add(botaoZero);
		botaoZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"0");
			}
			});
		
		JButton botaoPonto = new JButton(".");
		botaoPonto.setBounds(126, 325, 53, 50);
		frmCalculadora.getContentPane().add(botaoPonto);
		botaoPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+".");
			}
			});
		
		display = new JTextField();
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Tahoma", Font.PLAIN, 40));
		display.setText("0");
		display.setBounds(63, 24, 241, 93);
		frmCalculadora.getContentPane().add(display);
		display.setColumns(10);
	}
}
