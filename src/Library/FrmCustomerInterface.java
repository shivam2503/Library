package Library;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FrmCustomerInterface extends JFrame{
	private JFrame jf;
	private JButton Borrow, Return, Close;
	FrmCustomerInterface(){
		jf = new JFrame("Customer Interface");
		Borrow = new JButton("Borrow Book");
		Return = new JButton("Return Book");
		Close = new JButton("Close");
		jf.add(Borrow);
		jf.add(Return);
		jf.add(Close);
		jf.setSize(300, 150);
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		Return.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me){
				jf.setVisible(false);
				new FrmCustomerReturnBook();
			}
		});
		Close.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me){
				jf.setVisible(false);
				new FrmCustomerLogin();
			}
		});
	}
	public static void main(String[] args){
		new FrmCustomerInterface();
	}
}