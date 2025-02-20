import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);//
		this.setSize(800,700);//atributo para modificar el tamano
		this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
		
		this.setTitle("Inicio de sesion"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false); si quiero que sea redimensionable le coloco true

		this.setMaximumSize(new Dimension (800,400));
		this.setMinimumSize(new Dimension(400,400));
		
		//this.add(this.login());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
		this.add(this.registro());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana

		this.repaint();
	}
	
	public JPanel login() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion 
		
		Font fuente=new Font("Nunito",Font.BOLD,16);
		JPanel mipanel = new JPanel ();
		
		mipanel.setBackground(Color.WHITE);
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
		mipanel.setSize(500,500);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		
		
		JLabel etiqueta1=new JLabel ("¡Bienvenido!");
		etiqueta1.setSize(100,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(40,30);
		//etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		mipanel.add(etiqueta1);
		
		JLabel etiqueta2=new JLabel ("Ingresa tu correo");
		etiqueta2.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta2.setLocation(40,120);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
		JTextField email=new JTextField();
		email.setSize(300,40);
		email.setLocation(40,150);
		email.setFont(new Font("Nunito",Font.BOLD,14));
		email.setFont(fuente);
		mipanel.add(email);
		
		JLabel etiqueta3=new JLabel ("Ingresa tu contraseña");
		etiqueta3.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta3.setLocation(40,220);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(etiqueta3);
		
		JTextField contrasena=new JTextField();
		contrasena.setSize(300,40);
		contrasena.setLocation(40,250);
		contrasena.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(contrasena);
		
		JButton recordar=new JButton();
		recordar.setSize(12,12);
		recordar.setLocation(40,323);
		//recordar.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(recordar);
		
		JLabel recordar1=new JLabel ("Recordar mis credenciales");
		recordar1.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		recordar1.setLocation(55,310);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		recordar1.setFont(new Font("Nunito",Font.BOLD,9));
		mipanel.add(recordar1);
		
		
		JLabel recordar2=new JLabel ("¿Olvidaste tu contraseña?");
		recordar2.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		recordar2.setLocation(215,280);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		recordar2.setFont(new Font("Nunito",Font.BOLD,9));
		mipanel.add(recordar2);
		
		
		JTextField ingresar=new JTextField();
		ingresar.setSize(12,12);
		ingresar.setLocation(40,323);
		ingresar.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(recordar);
		
		
		JButton boton=new JButton("Iniciar sesión");
		boton.setBackground(Color.RED);
		boton.setSize(200,40);
		boton.setLocation(40,365);
        boton.setLayout(null);
        boton.setVisible(true);
        mipanel.add(boton);
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
		
		
	}
	
public JPanel registro() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion 
		
		Font fuente=new Font("Nunito",Font.BOLD,16);
		JPanel mipanel = new JPanel ();
		ButtonGroup grupo;
		JComboBox<String> combo,combo1,combo2;
		JRadioButton a,b;
		
		
		
		mipanel.setBackground(Color.decode("0xDFDFD3"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
		mipanel.setSize(800,700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		
		
		JLabel etiqueta1=new JLabel ("¡BIENVENIDO!");
		etiqueta1.setSize(150,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(350,30);
		//etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		mipanel.add(etiqueta1);
		
		JLabel etiqueta5=new JLabel ("Nombre(s)");
		etiqueta5.setSize(200,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta5.setLocation(40,75);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta5.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta5);
		
		JTextField name=new JTextField();
		name.setSize(200,30);
		name.setLocation(40,110);
		name.setFont(new Font("Nunito",Font.PLAIN,14));
		name.setFont(fuente);
		mipanel.add(name);
		
		JLabel etiqueta6=new JLabel ("Primer apellido");
		etiqueta6.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta6.setLocation(280,75);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta6.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta6);
		
		JTextField last_name=new JTextField();
		last_name.setSize(200,30);
		last_name.setLocation(280,110);
		last_name.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(last_name);
		
		JLabel etiqueta7=new JLabel ("Segundo apellido");
		etiqueta7.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta7.setLocation(520,75);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta7.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta7);
		
		JTextField last_second_name=new JTextField();
		last_second_name.setSize(200,30);
		last_second_name.setLocation(520,110);
		last_second_name.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(last_second_name);
		
		JLabel etiqueta8=new JLabel ("Nombre de usuario");
		etiqueta8.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta8.setLocation(40,170);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta8.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta8);
		
		JTextField user=new JTextField();
		user.setSize(200,30);
		user.setLocation(40,200);
		user.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(user);
		
		
		JLabel bio=new JLabel ("Acerca de mí");
		bio.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		bio.setLocation(330,170);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		bio.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(bio);
		
		JLabel preferences=new JLabel ("Selecciona el tema para la interfaz");
		preferences.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		preferences.setLocation(40,300);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		preferences.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(preferences);
		
		
		JTextField about_me=new JTextField();
		about_me.setSize(350,80);
		about_me.setLocation(330,200);
		about_me.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(about_me);
		
		JCheckBox miCheck=new JCheckBox();
		miCheck.setOpaque(true);
		miCheck.setText("Tema claro");
		miCheck.setVisible(true);
		miCheck.setBackground(Color.decode("0xDFDFD3"));
		miCheck.setFont(new Font("Nunito",Font.PLAIN,10));
		miCheck.setBounds(40,340,100,30);
		
		
		JCheckBox miCheck2=new JCheckBox();
		miCheck2.setOpaque(true);
		miCheck2.setText("Tema oscuro");
		miCheck2.setVisible(true);
		miCheck2.setBackground(Color.decode("0xDFDFD3"));
		miCheck2.setFont(new Font("Nunito",Font.PLAIN,10));
		miCheck2.setBounds(40,360,100,30);
		
		add(miCheck);
		add(miCheck2);
		
		grupo=new ButtonGroup();
		grupo.add(miCheck);
		grupo.add(miCheck2);
		
		a=new JRadioButton("",true);
		
		a.setOpaque(true);
		a.setText("Estoy de acuerdo");
		a.setVisible(true);
		a.setBackground(Color.decode("0xDFDFD3"));
		a.setFont(new Font("Nunito",Font.PLAIN,14));
		a.setBounds(310,485,150,30);
		
		b=new JRadioButton();
		//h
		b.setOpaque(true);
		b.setText("No estoy de acuerdo");
		b.setVisible(true);
		b.setBackground(Color.decode("0xDFDFD3"));
		b.setFont(new Font("Nunito",Font.PLAIN,14));
		b.setBounds(310,510,200,30);
		
		add(a);
		add(b);
		
		grupo.add(a);
		grupo.add(b);
		
		combo=new JComboBox<String>();//DIA
		combo.setBounds(350,355,45,30);
		combo.setFont(new Font("Nunito",Font.PLAIN,14));
		combo.setModel(new DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
		add(combo);
		
		combo1=new JComboBox<String>();//MES
		combo1.setBounds(400,355,100,30);
		combo1.setFont(new Font("Nunito",Font.PLAIN,14));
		combo1.setModel(new DefaultComboBoxModel<>(new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}));
		add(combo1);
		
		combo2=new JComboBox<String>();//MES
		combo2.setBounds(505,355,60,30);
		combo2.setFont(new Font("Nunito",Font.PLAIN,14));
		combo2.setModel(new DefaultComboBoxModel<>(new String[] {"1998","1997","1996","1995"}));
		add(combo2);
		
		JLabel date=new JLabel ("Fecha de nacimiento");
		date.setSize(600,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		date.setLocation(400,300);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		date.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(date);
		
		JLabel day=new JLabel ("Día");
		day.setSize(70,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		day.setLocation(360,325);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		day.setFont(new Font("Nunito",Font.PLAIN,10));
		mipanel.add(day);
		
		JLabel month=new JLabel ("Mes");
		month.setSize(70,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		month.setLocation(440,325);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		month.setFont(new Font("Nunito",Font.PLAIN,10));
		mipanel.add(month);
		
		JLabel year=new JLabel ("Año");
		year.setSize(480,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		year.setLocation(525,325);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		year.setFont(new Font("Nunito",Font.PLAIN,10));
		mipanel.add(year);
		
		
		
		JLabel privacy=new JLabel ("Confirmo que he leído y acepto los términos y condiciones y la política de privacidad");
		privacy.setSize(600,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		privacy.setLocation(150,450);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		privacy.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(privacy);
		
		JButton boton=new JButton("REGÍSTRATE");
		boton.setBackground(Color.decode("0x83AD9A"));
		boton.setSize(200,40);
		boton.setLocation(300,570);
        boton.setLayout(null);
        boton.setVisible(true);
        mipanel.add(boton);
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
		
		
	}

}
