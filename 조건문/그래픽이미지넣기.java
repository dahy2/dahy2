package ���ǹ�;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class �׷����̹����ֱ� {

	public static void main(String[] args) {
          JFrame f = new JFrame();
          f.setFont(new Font("HY������M", Font.BOLD, 12));
          f.setBackground(Color.PINK);
          f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\\uAC00\uC704.PNG"));
          f.setTitle("\uAC00\uC704\uBC14\uC704\uBCF4");
          f.setSize(600,271);
          
          JButton btnNewButton = new JButton("");
          btnNewButton.setForeground(Color.RED);
          btnNewButton.setFont(new Font("����", Font.BOLD, 12));
          btnNewButton.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		System.out.println("������ �����̱���");
          		Random r = new Random();
          	    int computer = r.nextInt(3);
          	    if (computer == 0) { //���� 
          	    	System.out.println("�����");
          	    }else if (computer == 1) { //����
          	    	System.out.println("��ǻ�� ��");
          	    }else if (computer == 2) { //��
          	    	System.out.println("���� ��");
          	    }
          	}
          });
          btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uAC00\uC704.PNG"));
          f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
          
          JButton btnNewButton_1 = new JButton("");
          btnNewButton_1.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		System.out.println("������ �����̱���");
          		Random r = new Random();
          	    int computer = r.nextInt(3);
          	    if (computer == 0) { //���� 
          	    	System.out.println("���� ��");
          	    }else if (computer == 1) { //����
          	    	System.out.println("�����");
          	    }else if (computer == 2) { //��
          	    	System.out.println("��ǻ�� ��");
          	    }
          	}
          });
          btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uBC14\uC704.PNG"));
          f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
          
          JButton btnNewButton_2 = new JButton("");
          btnNewButton_2.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		System.out.println("���� �����̱���");
          		Random r = new Random();
          	    int computer = r.nextInt(3);
          	    if (computer == 0) { //���� 
          	    	System.out.println("��ǻ�� ��");
          	    }else if (computer == 1) { //����
          	    	System.out.println("���� ��");
          	    }else if (computer == 2) { //��
          	    	System.out.println("�����");
          	    }
          	}
          });
          btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uBCF4.PNG"));
          f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
          f.setVisible(true);
          
	}

}
