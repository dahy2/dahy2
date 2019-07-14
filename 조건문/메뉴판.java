package Á¶°Ç¹®;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ¸Þ´ºÆÇ {

	public static void main(String[] args) {
           JFrame menu = new JFrame();
           menu.setTitle("\uBA54\uB274\uD310\uC785\uB2C8\uB2E4.");
           menu.setSize(800, 354);
           
           JButton b1 = new JButton("\uBA54\uB274\uD310\uC785\uB2C8\uB2E4.");
           JButton b5 = new JButton("\uB2F9\uC2E0\uC758 \uC120\uD0DD\uC740?");
           b1.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           	}
           });
           menu.getContentPane().add(b1, BorderLayout.NORTH);
           
           JButton b3 = new JButton("");
           b3.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uC9EC\uBF55.PNG"));
           b3.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		System.out.println("Â«»Í ¸ÔÀ¸·¯ °¡¿ä~");
           		b5.setText("Â«»Í!");
           	}
           });
           
           JButton b2 = new JButton("");
           b2.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		System.out.println("Â¥Àå ¸ÔÀ¸·¯ °¡¿ä~");
           		b5.setText("Â¥Àå!");
           	}
           });
           b2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uC9DC\uC7A5.PNG"));
           menu.getContentPane().add(b2, BorderLayout.WEST);
           menu.getContentPane().add(b3, BorderLayout.CENTER);
           
           JButton b4 = new JButton("");
           b4.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		System.out.println("¿ìµ¿ ¸ÔÀ¸·¯ °¡¿ä~");
           		b5.setText("¿ìµ¿!");
           	}
           });
           b4.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uC6B0\uB3D9.PNG"));
           menu.getContentPane().add(b4, BorderLayout.EAST);
           
           menu.getContentPane().add(b5, BorderLayout.SOUTH);
           
           menu.setVisible(true);
	}

}
