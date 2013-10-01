package Condomino;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Alpro2 - Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMenu.setBounds(124, 31, 156, 44);
		contentPane.add(lblMenu);
		
		JRadioButton rdbtnCadastrarVisitante = new JRadioButton("Cadastrar Visitante");
		rdbtnCadastrarVisitante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCadastrarVisitante.setBounds(32, 102, 156, 23);
		contentPane.add(rdbtnCadastrarVisitante);
		
		JRadioButton rdbtnCadastrarMorador = new JRadioButton("Cadastrar Morador");
		rdbtnCadastrarMorador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCadastrarMorador.setBounds(32, 128, 156, 23);
		contentPane.add(rdbtnCadastrarMorador);
		
		JRadioButton rdbtnVisitaDia = new JRadioButton("Consultar Visitas do Dia");
		rdbtnVisitaDia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnVisitaDia.setBounds(204, 104, 188, 23);
		contentPane.add(rdbtnVisitaDia);
		
		JRadioButton rdbtnVisitaMes = new JRadioButton("Consultar Visitas do M\u00EAs");
		rdbtnVisitaMes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnVisitaMes.setBounds(204, 128, 188, 23);
		contentPane.add(rdbtnVisitaMes);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				redirecionamento();
			}
		});
		btnOk.setBounds(140, 195, 156, 33);
		contentPane.add(btnOk);
	}
	
	private void redirecionamento() {
		
		
		
		if(this.rdbtnCadastrarVisitante.isSelected()){
			
			
		}
		if(this.rdbtnCadastrarMorador.isSelected()){
			
			
		}
		if(this.rdbtnVisitaDia.isSelected()){
	
	
		}
	
		if(this.rdbtnVisitaMes.isSelected()){
			
			
		}
	
		
}

	
	
}
