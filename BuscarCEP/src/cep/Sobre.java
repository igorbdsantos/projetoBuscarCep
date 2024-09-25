package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/botao-home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Version 1.0");
		lblNewLabel.setBounds(10, 23, 199, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author Igor Santos");
		lblNewLabel_1.setBounds(10, 64, 144, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service: ");
		lblNewLabel_2.setBounds(10, 101, 85, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(112, 101, 192, 13);
		getContentPane().add(lblWebService);
		
		JButton btnGithub = new JButton("");
		btnGithub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/igorbdsantos/projetoBuscaCep");
			}
		});
		btnGithub.setToolTipText("Github");
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github_3291695.png")));
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setBackground(SystemColor.control);
		btnGithub.setBorder(null);
		btnGithub.setBounds(32, 185, 48, 48);
		getContentPane().add(btnGithub);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/igor-santos-2aa516240/");
			}
		});
		btnLinkedin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.linkedin.com/in/igor-santos-2aa516240/");
			}
		});
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin_3536569.png")));
		btnLinkedin.setToolTipText("Linkedin");
		btnLinkedin.setBorder(null);
		btnLinkedin.setBackground(SystemColor.control);
		btnLinkedin.setBounds(137, 185, 48, 48);
		getContentPane().add(btnLinkedin);

	} //fim do cursor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
		}
	}



