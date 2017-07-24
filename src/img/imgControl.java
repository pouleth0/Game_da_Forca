package img;

import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import com.coddeveloper.JogoForca.gameForca;

public class imgControl {
BufferedImage imgControl = new BufferedImage(148, 341, BufferedImage.TYPE_INT_ARGB);
public static void imgControl(int imgNumer) throws Exception {
System.out.println("dentro Metodo IMG -- ok  numero: "+imgNumer);
String[] img = new String[8];
img[1]="/img/01.png";
img[2]="/img/02.png";
img[3]="/img/03.png";
img[4]="/img/04.png";
img[5]="/img/05.png";
img[6]="/img/06.png";
img[7]="/img/011.jpg";
System.out.println("Todas As Img Geradas ---- ");
if(img[imgNumer].equals(null)){
	JOptionPane.showMessageDialog(null, "A imagem esta faltando ERRO INTERNO .."+img[imgNumer]);
}
gameForca.imG(img[imgNumer]);
}}
