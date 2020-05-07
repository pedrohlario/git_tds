package um.tds.Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_telefono;
	private JTextField txt_nacimiento;
	private JTextField txt_email;
	private JTextField txt_usuario;
	private JPasswordField txt_pass;
	private JPasswordField txt_pass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setTitle("AppChat");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro\\Desktop\\2ºCuatri2020\\3º\\Tecnologias de Desarrollo de Software\\Proyecto_Git_TDS\\git_tds\\ProyectoAppChat\\src\\main\\resources\\chat_talk_conversation_sms_bubble_icon-icons.com_59983.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 405);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_superior = new JPanel();
		panel_superior.setBackground(new Color(100, 149, 237));
		FlowLayout fl_panel_superior = (FlowLayout) panel_superior.getLayout();
		fl_panel_superior.setAlignment(FlowLayout.LEFT);
		fl_panel_superior.setVgap(20);
		contentPane.add(panel_superior, BorderLayout.NORTH);
		
		JLabel lblRegistroEnAppchat = new JLabel("Crea tu cuenta de AppChat");
		lblRegistroEnAppchat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegistroEnAppchat.setForeground(new Color(0, 0, 255));
		lblRegistroEnAppchat.setLabelFor(panel_superior);
		panel_superior.add(lblRegistroEnAppchat);
		
		JPanel panel_inferior = new JPanel();
		panel_inferior.setBackground(new Color(65, 105, 225));
		FlowLayout fl_panel_inferior = (FlowLayout) panel_inferior.getLayout();
		fl_panel_inferior.setVgap(20);
		contentPane.add(panel_inferior, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_inferior.add(btnNewButton);
		
		JPanel panel_centro = new JPanel();
		contentPane.add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_nombre = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_nombre.getLayout();
		flowLayout_1.setAlignOnBaseline(true);
		panel_centro.add(panel_nombre, BorderLayout.NORTH);
		
		JLabel lblNombre = new JLabel(" Nombre:");
		panel_nombre.add(lblNombre);
		
		txt_nombre = new JTextField();
		lblNombre.setLabelFor(txt_nombre);
		panel_nombre.add(txt_nombre);
		txt_nombre.setColumns(20);
		
		JPanel panel_var = new JPanel();
		panel_centro.add(panel_var, BorderLayout.CENTER);
		panel_var.setLayout(new BorderLayout(5, 5));
		
		JPanel panel_telefono = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_telefono.getLayout();
		flowLayout_4.setAlignOnBaseline(true);
		panel_var.add(panel_telefono, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Teléfono:");
		panel_telefono.add(lblNewLabel);
		
		txt_telefono = new JTextField();
		lblNewLabel.setLabelFor(txt_telefono);
		panel_telefono.add(txt_telefono);
		txt_telefono.setColumns(20);
		
		JPanel panel_var2 = new JPanel();
		panel_var.add(panel_var2, BorderLayout.CENTER);
		panel_var2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_nacimiento = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_nacimiento.getLayout();
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_var2.add(panel_nacimiento, BorderLayout.NORTH);
		
		JLabel lblFechaNacimiento = new JLabel("                Fecha Nacimiento:");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		panel_nacimiento.add(lblFechaNacimiento);
		
		txt_nacimiento = new JTextField();
		lblFechaNacimiento.setLabelFor(txt_nacimiento);
		txt_nacimiento.setColumns(20);
		panel_nacimiento.add(txt_nacimiento);
		
		JPanel panel_var3 = new JPanel();
		panel_var2.add(panel_var3, BorderLayout.CENTER);
		panel_var3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_email = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_email.getLayout();
		flowLayout_3.setAlignOnBaseline(true);
		panel_var3.add(panel_email, BorderLayout.NORTH);
		
		JLabel lblEmail = new JLabel("     Email:");
		panel_email.add(lblEmail);
		
		txt_email = new JTextField();
		lblEmail.setLabelFor(txt_email);
		panel_email.add(txt_email);
		txt_email.setColumns(20);
		
		JPanel panel_usuario = new JPanel();
		FlowLayout fl_panel_usuario = (FlowLayout) panel_usuario.getLayout();
		fl_panel_usuario.setVgap(7);
		fl_panel_usuario.setAlignOnBaseline(true);
		panel_var3.add(panel_usuario, BorderLayout.CENTER);
		
		JLabel lblUsuario = new JLabel(" Usuario:");
		panel_usuario.add(lblUsuario);
		
		txt_usuario = new JTextField();
		lblUsuario.setLabelFor(txt_usuario);
		panel_usuario.add(txt_usuario);
		txt_usuario.setColumns(20);
		
		JPanel panel_contraseña = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_contraseña.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_var2.add(panel_contraseña, BorderLayout.SOUTH);
		
		JLabel lblContrasea = new JLabel("                           Contraseña:");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		panel_contraseña.add(lblContrasea);
		
		txt_pass = new JPasswordField();
		lblContrasea.setLabelFor(txt_pass);
		txt_pass.setColumns(20);
		panel_contraseña.add(txt_pass);
		
		JPanel panel_confirmacion = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_confirmacion.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_var.add(panel_confirmacion, BorderLayout.SOUTH);
		
		JLabel lblConfirmarContrasea = new JLabel("       Confirmar Contraseña:");
		panel_confirmacion.add(lblConfirmarContrasea);
		
		txt_pass2 = new JPasswordField();
		lblConfirmarContrasea.setLabelFor(txt_pass2);
		txt_pass2.setColumns(20);
		panel_confirmacion.add(txt_pass2);
		
		JPanel panel_warning = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_warning.getLayout();
		flowLayout_7.setAlignOnBaseline(true);
		panel_centro.add(panel_warning, BorderLayout.SOUTH);
		
		JLabel lblLosCampos = new JLabel("*Los campos indicados son obligatorios");
		lblLosCampos.setForeground(Color.RED);
		panel_warning.add(lblLosCampos);
	}
}
