package mis_clases;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class euros_dolares_libro {
	static final int MIN=0;
	static final int MAX=1000;
	static final int INIT=0;
	private static JLabel label=new JLabel("1 Euro son en dolares:");
	private static JLabel lbleuros=new JLabel("Euros:");
	private static JLabel lbldolares=new JLabel("Dolares:");
	private static JFrame frame=new JFrame("Conversor Euros - Dolares");
	private static JPanel panel1=new JPanel();
	private static JPanel panel2=new JPanel();
	private static JPanel panel3=new JPanel();
	private static JTextField txteuro=new JTextField("0");
	private static JTextField txtdolar=new JTextField("0");
	private static JTextField txtcambio=new JTextField("1.36");
	private static JSlider sliderdolar=new JSlider (JSlider.HORIZONTAL,MIN,MAX,INIT);
	private static JSlider slidereuro=new JSlider (JSlider.HORIZONTAL,MIN,MAX,INIT);
	public static void cambiotexto(ActionEvent e){
		if(e.getSource()==txteuro){
			float icambio=Float.parseFloat(txteuro.getText());
			icambio=100*icambio*Float.parseFloat(txtcambio.getText());
			icambio=Math.round(icambio);
			icambio=icambio/100;
		txtdolar.setText(String.valueOf(icambio));
		//cambiar los slider
		sliderdolar.setValue(Math.round(Float.parseFloat(txtdolar.getText())));
		slidereuro.setValue(Math.round(Float.parseFloat(txteuro.getText())));
		}
		if(e.getSource()==txtdolar){
			System.out.println("dentro");
			float icambio=Float.parseFloat(txtdolar.getText());
			icambio=100*icambio/Float.parseFloat(txtcambio.getText());
			icambio=Math.round(icambio);
			icambio=icambio/100;
		txteuro.setText(String.valueOf(icambio));
		}
	}
	public static void mueveSlider(ChangeEvent e){
		int valor;
		JSlider obj=(JSlider)e.getSource();
		System.out.println(obj.getValueIsAdjusting());
		System.out.println(obj.getValue());
		
		if(!obj.getValueIsAdjusting()){
			System.out.println(obj.getValue());
			valor=(int)obj.getValue();
			if(obj==sliderdolar){
				txtdolar.setText(String.valueOf(valor));
				float icambio=100*valor/Float.parseFloat(txtcambio.getText());
				icambio=Math.round(icambio);
				icambio=icambio/100;
				//cambiar el txteuro
				txteuro.setText(String.valueOf(icambio));
				//cambiar el slidereuro
				int i=Math.round(icambio);
				slidereuro.setValue(i);
			}
			if(obj==slidereuro){
				txteuro.setText(String.valueOf(valor));
				float icambio=100*valor*Float.parseFloat(txtcambio.getText());
				icambio=Math.round(icambio);
				icambio=icambio/100;
				//cambiar el txtdolar
				txtdolar.setText(String.valueOf(icambio));
				//cambiar el sliderdolar
				int i=Math.round(icambio);
				slidereuro.setValue(i);
			}
		}
	}
	@SuppressWarnings("deprecation")
	public static void colocaelementos(){
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		frame.getContentPane().add(panel3);
		
		slidereuro.setBorder(BorderFactory.createTitledBorder("Euros"));
		slidereuro.setMajorTickSpacing(200);
		slidereuro.setMinorTickSpacing(100);
		slidereuro.setPaintTicks(true);
		slidereuro.setPaintLabels(true);
		slidereuro.disable();
		sliderdolar.setBorder(BorderFactory.createTitledBorder("Euros"));
		sliderdolar.setMajorTickSpacing(200);
		sliderdolar.setMinorTickSpacing(100);
		sliderdolar.setPaintTicks(true);
		sliderdolar.setPaintLabels(true);
		sliderdolar.disable();
		panel1.add(lbleuros);
		panel1.add(txteuro);
		panel1.add(slidereuro);
		
		panel2.add(label);
		panel2.add(txtcambio);
		
		panel3.add(lbldolares);
		panel3.add(txtdolar);
		panel3.add(sliderdolar);
	frame.addWindowListener(new WindowAdapter(){
									public void windowClosing(WindowEvent e){
								System.exit(0);
									}
						});
	txteuro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
						cambiotexto(e);
			}
	});
	
	frame.setLayout(new FlowLayout());
	panel1.setLayout(new GridLayout(0,1));
	panel2.setLayout(new GridLayout(0,1));
	panel3.setLayout(new GridLayout(0,1));
	frame.setVisible(true);
		}
		public static void main(String[]args){
			try{
				UIManager.setLookAndFeel(
						UIManager.getCrossPlatformLookAndFeelClassName());
			}catch (Exception e){}
			colocaelementos();
		}
}