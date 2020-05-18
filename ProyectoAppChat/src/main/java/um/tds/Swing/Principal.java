package um.tds.Swing;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;

public class Principal {

	private JFrame frame;

	/**
	 * Launch thJAJAJA HOLIIIIIDDDD
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *JAJAJAJAJA QUE FIESTA ES HABLAR POR GIT
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//IMAGENES
		ImageIcon iconosEmoticonoMenu = new ImageIcon(Principal.class.getResource("/resources/chat_talk_conversation_sms_bubble_icon-icons.com_59983.png"));
		
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/resources/chat_talk_conversation_sms_bubble_icon-icons.com_59983.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel panel_2 = new JPanel();
		
		JTextArea area_chat=new JTextArea(10,12);
		JPanel Panelarea_chat=new JPanel();
		Panelarea_chat.setLayout(new GridLayout(1,1));
		Panelarea_chat.add(area_chat);
		
		JTextField txt_mensaje=new JTextField(4);
		//txt_mensaje.setPreferredSize(new Dimension(40, 40));
		JButton btn_enviar=new JButton("enviar");
		btn_enviar.setPreferredSize(new Dimension(10, 10));
		JPanel Panelbtn=new JPanel();
		Panelbtn.setLayout(new GridLayout(1,3));
		
		JMenu menuEmoticonos = new JMenu();
		menuEmoticonos.setIcon(iconosEmoticonoMenu);
		Panelbtn.add(menuEmoticonos);
		Panelbtn.add(txt_mensaje);
		Panelbtn.add(btn_enviar);
		
		panel_2.setLayout(new BorderLayout());
		panel_2.add(Panelarea_chat,BorderLayout.NORTH);
		panel_2.add(Panelbtn,BorderLayout.SOUTH);
		panel_2.setSize(300, 220);
		splitPane.setRightComponent(panel_2);
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
