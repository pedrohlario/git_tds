package um.tds.Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class Login {

	private JFrame VentanaLogin;
	private JTextField log_usuario;
	private JPasswordField log_contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.VentanaLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		VentanaLogin = new JFrame();
		VentanaLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro\\Desktop\\2ºCuatri2020\\3º\\Tecnologias de Desarrollo de Software\\Proyecto_Git_TDS\\git_tds\\ProyectoAppChat\\src\\main\\resources\\chat_talk_conversation_sms_bubble_icon-icons.com_59983.png"));
		VentanaLogin.setTitle("AppChat");
		VentanaLogin.setBounds(100, 100, 500, 350);
		//Para que se centre la ventana
		VentanaLogin.setLocationRelativeTo(null);
		//Para que no se pueda redimensionar
		VentanaLogin.setResizable(false);
		/*
		 * Esto se usa para que no se puedan redimensionar componentes, no ventanas.
		Dimension dim = new Dimension(500,350);
		VentanaLogin.setPreferredSize(dim);
		VentanaLogin.setMinimumSize(dim);
		VentanaLogin.setMaximumSize(dim);
		*/
		VentanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaLogin.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_superior = new JPanel();
		panel_superior.setForeground(Color.BLACK);
		VentanaLogin.getContentPane().add(panel_superior, BorderLayout.NORTH);
		panel_superior.setBackground(new Color(100, 149, 237));
		panel_superior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FlowLayout fl_panel_superior = new FlowLayout(FlowLayout.LEFT, 10, 20);
		panel_superior.setLayout(fl_panel_superior);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setLabelFor(panel_superior);
		panel_superior.add(lblNewLabel);
		
		JPanel panel_inferior = new JPanel();
		panel_inferior.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_inferior.setBackground(new Color(65, 105, 225));
		FlowLayout fl_panel_inferior = (FlowLayout) panel_inferior.getLayout();
		fl_panel_inferior.setVgap(20);
		fl_panel_inferior.setHgap(10);
		VentanaLogin.getContentPane().add(panel_inferior, BorderLayout.SOUTH);
		
		JButton log_reg = new JButton("Registrarse");
		log_reg.setHorizontalAlignment(SwingConstants.RIGHT);
		log_reg.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_inferior.add(log_reg);
		
		JPanel panel_este = new JPanel();
		FlowLayout fl_panel_este = (FlowLayout) panel_este.getLayout();
		fl_panel_este.setVgap(70);
		fl_panel_este.setHgap(50);
		VentanaLogin.getContentPane().add(panel_este, BorderLayout.EAST);
		
		JButton log_log = new JButton("Acceder");
		log_log.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_este.add(log_log);
		
		JPanel panel_centro = new JPanel();
		VentanaLogin.getContentPane().add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new FlowLayout(FlowLayout.LEFT, 25, 23));
		
		JLabel lblUsuario = new JLabel("");
		lblUsuario.setIcon(new ImageIcon("C:\\Users\\pedro\\Desktop\\2ºCuatri2020\\3º\\Tecnologias de Desarrollo de Software\\Proyecto_Git_TDS\\git_tds\\ProyectoAppChat\\src\\main\\resources\\round-account-button-with-user-inside_icon-icons.com_72596.png"));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_centro.add(lblUsuario);
		
		log_usuario = new JTextField();
		log_usuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_centro.add(log_usuario);
		log_usuario.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\pedro\\Desktop\\2ºCuatri2020\\3º\\Tecnologias de Desarrollo de Software\\Proyecto_Git_TDS\\git_tds\\ProyectoAppChat\\src\\main\\resources\\password_3715.png"));
		panel_centro.add(label);
		
		log_contraseña = new JPasswordField();
		log_contraseña.setColumns(10);
		log_contraseña.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_centro.add(log_contraseña);
	}
}
