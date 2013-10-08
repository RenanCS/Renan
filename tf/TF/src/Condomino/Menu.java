package Condomino;


import java.awt.EventQueue;

public class Menu extends JFrame {

	private JPanel contentPane;
	private String radioSelecionado;
	
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
		
		final JRadioButton rdbtnCadastrarVisitante = new JRadioButton("Cadastrar Visitante");
		rdbtnCadastrarVisitante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCadastrarVisitante.setBounds(32, 102, 156, 23);
		contentPane.add(rdbtnCadastrarVisitante);
		
		final JRadioButton rdbtnCadastrarMorador = new JRadioButton("Cadastrar Morador");
		rdbtnCadastrarMorador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCadastrarMorador.setBounds(32, 128, 156, 23);
		contentPane.add(rdbtnCadastrarMorador);
		
		final JRadioButton rdbtnVisitaDia = new JRadioButton("Consultar Visitas do Dia");
		rdbtnVisitaDia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnVisitaDia.setBounds(204, 104, 188, 23);
		contentPane.add(rdbtnVisitaDia);
		
		final JRadioButton rdbtnVisitaMes = new JRadioButton("Consultar Visitas do M\u00EAs");
		rdbtnVisitaMes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnVisitaMes.setBounds(204, 128, 188, 23);
		contentPane.add(rdbtnVisitaMes);
		
		ButtonGroup opcao = new ButtonGroup();
		opcao.add(rdbtnVisitaMes);
		opcao.add(rdbtnVisitaDia);
		opcao.add(rdbtnCadastrarMorador);
		opcao.add(rdbtnCadastrarVisitante);

		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnVisitaDia.isSelected()){
				  IntefaceConsultaMes mes  = new IntefaceIntefaceConsultaMes();  
			          mes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
			          mes.setLocationRelativeTo(null);  
			          mes.setVisible(true);  
			
				}
				if(rdbtnVisitaMes.isSelected()){
				  IntefaceConsultaMes mes  = new IntefaceIntefaceConsultaMes();  
			          mes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
			          mes.setLocationRelativeTo(null);  
			          mes.setVisible(true);  
					
				}
				if(rdbtnCadastrarMorador.isSelected()){
				InterfaceMorador morador  = new IntefaceMorador();  
		        	morador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		                morador.setLocationRelativeTo(null);  
		                morador.setVisible(true);  
					
				}
				if(rdbtnCadastrarVisitante.isSelected()){
				  Inteface visitante  = new Inteface();  
			          visitante.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
			          visitante.setLocationRelativeTo(null);  
			          visitante.setVisible(true);  
				}
				
				
			}
		});
		btnOk.setBounds(140, 195, 156, 33);
		contentPane.add(btnOk);
	}
	
	private void redirecionamento() {
		
		
		
		
}

	
	
}
