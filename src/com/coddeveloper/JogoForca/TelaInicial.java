package com.coddeveloper.JogoForca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TelaInicial extends JFrame {
	private JPanel contentPane = new JPanel(new BorderLayout());
	private static JLabel lblOuver = new JLabel();
	private static JLabel lblGame = new JLabel();
	private static String planoFundo = "/img/011.jpg";
	private static boolean iniCialiZacao;
	private static boolean gameOveR;
	private static boolean ganhoU;
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static Image img;
	private Graphics raphics ;
	
	public static void main(String[] args) {
		
		setIniCialiZacao(true);
		if (TelaInicial.isGanhoU() == true) {
			setIniCialiZacao(false);
			lblOuver.setText("Obaa... Você Ganhou");
			lblGame.setText("Mesu Parabensss....>!!<" + "\n" + "De mais..");
		} else if (TelaInicial.isGameOveR() == true) {
			setIniCialiZacao(false);
			lblOuver.setText("GAME");
			lblGame.setText("OVER..> !!");
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					TelaInicial frame = new TelaInicial();
					//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
					//frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}
	public TelaInicial() {
		Graphics g = null;
		 try{
		      img = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource(planoFundo), planoFundo));
		    }
		    catch (Exception e) { /*handled in paintComponent()*/ 
		    }
		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setBackground(UIManager.getColor("Button.background"));
		setForeground(new Color(153, 153, 153));
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInicial.class.getResource("/img/06.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,100,100);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 51, 51));
		contentPane.setBackground(new Color(0, 0, 0));  
	    contentPane.setOpaque(true); 
	    setContentPane(contentPane);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		setSize(this.getWidth(), this.getHeight());
		getInsets();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setFocusTraversalPolicy(null);
		panel_1.requestFocus();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setAutoCreateContainerGaps(true);
		gl_contentPane.setAutoCreateGaps(true);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(27)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE).addGap(38))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(128)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE).addGap(108)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(75)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE).addGap(101)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE).addGap(23)));

		if (TelaInicial.isIniCialiZacao() == true) {
			lblGame.setText("Game da F0rcA");
			lblOuver.setText("BEM VINDO ....");
		}
		panel_1.add(lblOuver);
		panel_1.add(lblGame);
		lblOuver.setForeground(new Color(165, 42, 42));
		lblOuver.setFont(new Font("Dialog", Font.BOLD, 30));
		lblGame.setFont(new Font("Dialog", Font.BOLD, 30));
		lblGame.setForeground(SystemColor.desktop);
		JButton btnStart = new JButton("Start");
		panel.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					gameForca frame = new gameForca();
					//frame.setOver(true);
					gameForca init = new gameForca();
					init.winodwsIN(null);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		JButton btnStop = new JButton("Stop");
		panel.add(btnStop);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.WIDTH);
			}
		});
		contentPane.setLayout(gl_contentPane);
	}
	public static boolean isIniCialiZacao() {
		return iniCialiZacao;
	}
	public static void setIniCialiZacao(boolean iniCialiZacao) {
		TelaInicial.iniCialiZacao = iniCialiZacao;
	}
	public static boolean isGameOveR() {
		return gameOveR;
	}
	public static void setGameOveR(boolean gameOveR) {
		TelaInicial.gameOveR = gameOveR;
	}
	public static boolean isGanhoU() {
		return ganhoU;
	}
	public static void setGanhoU(boolean ganhoU) {
		TelaInicial.ganhoU = ganhoU;
	}
	public static String getPlanoFundo() {
		return planoFundo;
	}
	public static void setPlanoFundo(String planoFundo) {
		TelaInicial.planoFundo = planoFundo;
	}
}