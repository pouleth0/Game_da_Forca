package com.coddeveloper.JogoForca;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import org.eclipse.wb.swing.FocusTraversalOnArray;
public class gameForca extends JFrame {
	
	public static boolean bt;
	public JPanel contentPane;
	private static JLabel[] label;
	public static int numeroLetras;
	public static JPanel pn_Palavra = new JPanel();
	public static JLabel lbl_dica = new JLabel("");
	private static JPanel panel = new JPanel();
	private static JPanel pn_Forca = new JPanel();
	private static JLabel lbl_ico = new JLabel("");
	private static boolean over;
	private static boolean vitoriA;
	private static JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				if (over == true|vitoriA==true) {
					System.out.println("dentro função repetição IF game over true. vitoria true...");
					gameForca.limpar();
					System.out.println("Voltou do mentodo limpar estrut repetição if ");
				}
			gameForca init = new gameForca();
			init.winodwsIN(null);
		}});}
	public void gameForca() {
		System.out.println("Confirmando GameOver = "+isOver());
		System.out.println("Confirmando Vitorai = "+isVitoriA());
		setLocationRelativeTo(null);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(gameForca.class.getResource("/img/06.png")));
		setTitle("JOGO -------- DA -------- FORCA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));
		contentPane.setLocale(null);
		contentPane.repaint();
		setContentPane(contentPane);
		repaint();
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					compNome.comparaPalavra(btnA.getText());
				} catch (Exception e) {
					e.printStackTrace();}
					btnA.setEnabled(false);
				if (bt == false) {
					btnA.setBackground(Color.RED);
				}
				if (bt == true) {
					btnA.setBackground(Color.GREEN);					
				}
				if(over==true&&vitoriA==false){
						TelaInicial.setGameOveR(true);
						gameForca.limpar();	
						dispose();
						RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
						TelaInicial.setGanhoU(true);
						dispose();
						gameForca.limpar();					
						RumInicio.main(null);	
				}
			}});
		btnA.setForeground(new Color(148, 0, 211));
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					compNome.comparaPalavra(btnB.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
				btnB.setEnabled(false);
				if (bt == false) {
					btnB.setBackground(Color.RED);
				}
				if (bt == true) {
					btnB.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnB.setForeground(new Color(148, 0, 211));
		btnB.setFont(new Font("Dialog", Font.BOLD, 11));

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					compNome.comparaPalavra(btnC.getText());
				} catch (Exception e) {

					e.printStackTrace();
				}
				btnC.setEnabled(false);
				if (bt == false) {
					btnC.setBackground(Color.RED);
				}
				if (bt == true) {
					btnC.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnC.setForeground(new Color(148, 0, 211));
		btnC.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnD.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnD.setEnabled(false);

				if (bt == false) {
					btnD.setBackground(Color.RED);
				}
				if (bt == true) {
					btnD.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnD.setForeground(new Color(148, 0, 211));
		btnD.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnE = new JButton("E");
		
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					compNome.comparaPalavra(btnE.getText());
				} catch (Exception e) {

					e.printStackTrace();
				}
				btnE.setEnabled(false);
				if (bt == false) {
					btnE.setBackground(Color.RED);
				}if (bt == true) {
					btnE.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnE.setForeground(new Color(148, 0, 211));
		btnE.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnF.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnF.setEnabled(false);
				if (bt == false) {
					btnF.setBackground(Color.RED);
				}
				if (bt == true) {
					btnF.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnF.setForeground(new Color(148, 0, 211));
		btnF.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnG.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnG.setEnabled(false);
				if (bt == false) {
					btnG.setBackground(Color.RED);
				}
				if (bt == true) {
					btnG.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnG.setForeground(new Color(148, 0, 211));
		btnG.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnH.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnH.setEnabled(false);
				if (bt == false) {
					btnH.setBackground(Color.RED);
				}
				if (bt == true) {
					btnH.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnH.setForeground(new Color(148, 0, 211));
		btnH.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnI.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnI.setEnabled(false);
				if (bt == false) {
					btnI.setBackground(Color.RED);
				}
				if (bt == true) {
					btnI.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnI.setForeground(new Color(148, 0, 211));
		btnI.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnJ.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnJ.setEnabled(false);
				if (bt == false) {
					btnJ.setBackground(Color.RED);
				}
				if (bt == true) {
					btnJ.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnJ.setForeground(new Color(148, 0, 211));
		btnJ.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnK.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnK.setEnabled(false);
				if (bt == false) {
					btnK.setBackground(Color.RED);
				}
				if (bt == true) {
					btnK.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnK.setForeground(new Color(148, 0, 211));
		btnK.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnL.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnL.setEnabled(false);
				if (bt == false) {
					btnL.setBackground(Color.RED);
				}
				if (bt == true) {
					btnL.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnL.setForeground(new Color(148, 0, 211));
		btnL.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnM.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnM.setEnabled(false);
				if (bt == false) {
					btnM.setBackground(Color.RED);
				}
				if (bt == true) {
					btnM.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnM.setForeground(new Color(148, 0, 211));
		btnM.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnn = new JButton("N");
		btnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnn.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnn.setEnabled(false);
				if (bt == false) {
					btnn.setBackground(Color.RED);
				}
				if (bt == true) {
					btnn.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnn.setForeground(new Color(148, 0, 211));
		btnn.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnO.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnO.setEnabled(false);
				if (bt == false) {
					btnO.setBackground(Color.RED);
				}
				if (bt == true) {
					btnO.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnO.setForeground(new Color(148, 0, 211));
		btnO.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnP.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnP.setEnabled(false);
				if (bt == false) {
					btnP.setBackground(Color.RED);
				}
				if (bt == true) {
					btnP.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnP.setForeground(new Color(148, 0, 211));
		btnP.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnQ.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnQ.setEnabled(false);
				if (bt == false) {
					btnQ.setBackground(Color.RED);
				}
				if (bt == true) {
					btnQ.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnQ.setForeground(new Color(148, 0, 211));
		btnQ.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnR.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnR.setEnabled(false);
				if (bt == false) {
					btnR.setBackground(Color.RED);
				}
				if (bt == true) {
					btnR.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnR.setForeground(new Color(148, 0, 211));
		btnR.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnS.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnS.setEnabled(false);
				if (bt == false) {
					btnS.setBackground(Color.RED);
				}
				if (bt == true) {
					btnS.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnS.setForeground(new Color(148, 0, 211));
		btnS.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnT.getText());
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				btnT.setEnabled(false);
				if (bt == false) {
					btnT.setBackground(Color.RED);
				}
				if (bt == true) {
					btnT.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnT.setForeground(new Color(148, 0, 211));
		btnT.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnU.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				btnU.setEnabled(false);
				if (bt == false) {
					btnU.setBackground(Color.RED);
				}
				if (bt == true) {
					btnU.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnU.setForeground(new Color(148, 0, 211));
		btnU.setFont(new Font("Dialog", Font.BOLD, 11));
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnV.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				btnV.setEnabled(false);
				if (bt == false) {
					btnV.setBackground(Color.RED);
				}
				if (bt == true) {
					btnV.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnV.setForeground(new Color(148, 0, 211));
		btnV.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnW.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				btnW.setEnabled(false);
				if (bt == false) {
					btnW.setBackground(Color.RED);
				}
				if (bt == true) {
					btnW.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnW.setForeground(new Color(148, 0, 211));
		btnW.setFont(new Font("Dialog", Font.BOLD, 9));
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnX.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				btnX.setEnabled(false);
				if (bt == false) {
					btnX.setBackground(Color.RED);
				}
				if (bt == true) {
					btnX.setBackground(Color.GREEN);
				}
				if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}
			}});
		btnX.setForeground(new Color(148, 0, 211));
		btnX.setFont(new Font("Dialog", Font.BOLD, 10));
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					compNome.comparaPalavra(btnY.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				btnY.setEnabled(false);
				if (bt == false) {
					btnY.setBackground(Color.RED);
				}
				if (bt == true) {
					btnY.setBackground(Color.GREEN);
				}if(over==true&&vitoriA==false){
					TelaInicial.setGameOveR(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
				}else if(over==false&&vitoriA==true){
					TelaInicial.setGanhoU(true);
					dispose();
					gameForca.limpar();					
					RumInicio.main(null);	
			}}});
		btnY.setForeground(new Color(148, 0, 211));
		btnY.setFont(new Font("Dialog", Font.BOLD, 10));
		pn_Palavra.setBorder(new LineBorder(new Color(0, 128, 0), 2));
		pn_Palavra.setForeground(new Color(51, 51, 51));
		JLabel lblNewLabel = new JLabel("ADIVINHE A PALAVRA:");
		JLabel lblPauloHA = new JLabel("Paulo H A Moreia®");
		JLabel lbl_Relogio = new JLabel("");
		lbl_Relogio.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				new Thread() {
					public void run() {
						while (true) {
							Calendar c = new GregorianCalendar();
							int h = c.get(Calendar.HOUR);
							int m = c.get(Calendar.MINUTE);
							int s = c.get(Calendar.SECOND);
							int AM_PM = c.get(Calendar.AM_PM);
							String am_pm;
							if (AM_PM == 1) {
								am_pm = "PM";
							} else {
								am_pm = "AM";
							}
							lbl_Relogio.setText(h + ":" + m + ":" + s + " " + am_pm);
						}
					}
				}.start();}
			@Override public void ancestorMoved(AncestorEvent arg0) {}
			@Override public void ancestorRemoved(AncestorEvent arg0) {}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(24)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(pn_Palavra, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
								.addComponent(lbl_dica, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
						.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(lbl_Relogio, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 549, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addGap(54))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnA).addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnD, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnF, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnG, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnI, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(btnJ, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(31)
										.addComponent(btnK, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnL, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnM, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnn, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnO, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnP, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnQ, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(56)
										.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnT, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnU, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnY,
												GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(437, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(781, Short.MAX_VALUE)
						.addComponent(lblPauloHA, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addComponent(lbl_Relogio, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(23)
										.addComponent(pn_Palavra, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(lbl_dica, GroupLayout.PREFERRED_SIZE, 24,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(panel,
												GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel,
								GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnB).addComponent(btnC)
						.addComponent(btnD).addComponent(btnA).addComponent(btnE).addComponent(btnF).addComponent(btnG)
						.addComponent(btnH).addComponent(btnI).addComponent(btnJ))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnK).addComponent(btnL)
						.addComponent(btnM).addComponent(btnn).addComponent(btnO).addComponent(btnP).addComponent(btnQ)
						.addComponent(btnR))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnS).addComponent(btnT)
						.addComponent(btnU).addComponent(btnV)
						.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnX).addComponent(btnY))
				.addGap(17).addComponent(lblPauloHA, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		JLabel label_3 = new JLabel("|");
		label_3.setFont(new Font("Dialog", Font.BOLD, 98));

		JLabel label_4 = new JLabel("|");
		label_4.setFont(new Font("Dialog", Font.BOLD, 98));

		JLabel label_1 = new JLabel("|");
		label_1.setFont(new Font("Dialog", Font.BOLD, 98));

		JLabel label_5 = new JLabel("|");
		label_5.setFont(new Font("Dialog", Font.BOLD, 98));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addGap(40)
						.addComponent(pn_Forca, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addGroup(gl_panel
						.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addGap(17)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addComponent(pn_Forca, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		GroupLayout gl_pn_Forca = new GroupLayout(pn_Forca);
		gl_pn_Forca.setHorizontalGroup(gl_pn_Forca.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_pn_Forca.createSequentialGroup().addGap(80)
						.addComponent(lbl_ico, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(44, Short.MAX_VALUE)));
		gl_pn_Forca.setVerticalGroup(gl_pn_Forca.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pn_Forca.createSequentialGroup().addContainerGap()
						.addComponent(lbl_ico, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE).addContainerGap()));
		pn_Forca.setLayout(gl_pn_Forca);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);	
	}
	public void winodwsIN(WindowEvent ev) {
		compNome.geraPalavra();
		geraLetrasPN_Palavra();
		gameForca();
	}
	private static void limpar() {
		int cont = getNumeroLetras();
		if (getNumeroLetras() > 0) {
			for (int i = 0; i < getNumeroLetras(); i++) {
				pn_Palavra.remove(label[i]);;
				cont--; }}

		System.out.println("Contador "+cont);
		setNumeroLetras(cont);
		pn_Palavra.repaint();
		pn_Palavra.revalidate();
		lbl_ico.setIcon(Icon.class.cast(null));
	}
	public static void geraLetrasPN_Palavra() {
		int cont = 0;
		label = new JLabel[getNumeroLetras()];
		for (int i = 0; i < getNumeroLetras(); i++) {
			label[i] = new JLabel();
			label[i].setText("_");
			label[i].setHorizontalAlignment(SwingConstants.RIGHT);
			label[i].setFont(new Font("Dialog", Font.BOLD, 38));
			pn_Palavra.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { label[i] }));
			pn_Palavra.add(label[i]);
			cont++;
			if (cont >= getNumeroLetras()) {
				lbl_dica.setText("Dica esta Palavra Contem " + cont + " Letras!! Boa Sorte...");
			}}
	}
	public static boolean isBt() {
		return bt;
	}
	public static void setBt(boolean bt) {
		gameForca.bt = bt;
	}
	public static int getNumeroLetras() {
		return numeroLetras;
	}
	public static void setNumeroLetras(int numeroLetras) {
		gameForca.numeroLetras = numeroLetras;
	}
	public static JLabel[] getLabel() {
		return label;
	}
	public static void setLabel(int num, String text) {
		label[num].setText(text);
	}
	public static String imG(String ox) throws Exception {
		lbl_ico.setIcon(new ImageIcon(gameForca.class.getResource(ox)));
		return ox;
	}
	public static boolean gameOver(boolean over) {

		return gameForca.over = over;
	}
	public static boolean isOver() {
		return over;
	}
	public static void setOver(boolean over) {
		gameForca.over = over;
	}
	public static boolean isVitoriA() {
		return vitoriA;
	}
	public static void setVitoriA(boolean vitoriA) {

		gameForca.vitoriA = vitoriA;
	}
}
