import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Registro extends JFrame{
	
	
	public Registro() {
		
	this.setVisible(true);//
	this.setSize(500,500);//atributo para modificar el tamano
	this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
	
	this.setTitle("R"); 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//this.setResizable(false); si quiero que sea redimensionable le coloco true

	this.setMaximumSize(new Dimension (800,400));
	this.setMinimumSize(new Dimension(400,400));
	
	this.add(this.info());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana

	this.repaint();
	}


	public JPanel info() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion 
	
	Font fuente=new Font("Nunito",Font.BOLD,16);
	JPanel mipanel = new JPanel ();
	
	mipanel.setBackground(Color.WHITE);
	mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
	mipanel.setSize(500,500);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
	mipanel.setLocation(0,0);
	mipanel.setLayout(null);
	return mipanel;
	
	}
	
}
