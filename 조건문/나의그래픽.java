package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
         JFrame f = new JFrame();
         
         f.setTitle("���� ù �׷���");
         
         f.setSize(500,500);
         
         JButton button = new JButton("\uB098\uB97C \uB20C\uB7EC\uBCF4\uC138\uC694.");
         button.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {
         		System.out.println("��� ��ư�� ��������.");
         	}
         });
         button.setForeground(Color.RED);
         button.setBackground(Color.PINK);
         button.setFont(new Font("�ü�", Font.BOLD, 30));
         f.getContentPane().add(button, BorderLayout.CENTER);
         
         JButton btnNewButton = new JButton("\uC704\uCABD\uBC84\uD2BC");
         btnNewButton.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		System.out.println("���� �ִ� ��ư�� ��������.");
         	}
         });
         btnNewButton.setForeground(Color.WHITE);
         btnNewButton.setBackground(Color.DARK_GRAY);
         btnNewButton.setFont(new Font("���级��üM", Font.BOLD, 20));
         f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
         
         JButton btnNewButton_1 = new JButton("\uC67C\uCABD\uBC84\uD2BC");
         btnNewButton_1.setForeground(Color.WHITE);
         btnNewButton_1.setBackground(Color.DARK_GRAY);
         btnNewButton_1.setFont(new Font("���级��üM", Font.BOLD, 20));
         f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
         
         JButton btnNewButton_2 = new JButton("\uC624\uB978\uCABD\uBC84\uD2BC");
         btnNewButton_2.setForeground(Color.WHITE);
         btnNewButton_2.setBackground(Color.DARK_GRAY);
         btnNewButton_2.setFont(new Font("���级��üM", Font.BOLD, 20));
         f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
         
         JButton btnNewButton_3 = new JButton("\uC544\uB798\uCABD\uBC84\uD2BC");
         btnNewButton_3.setForeground(Color.WHITE);
         btnNewButton_3.setBackground(Color.DARK_GRAY);
         btnNewButton_3.setFont(new Font("���级��üM", Font.BOLD, 20));
         f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
         
         f.setVisible(true); //������ ���ƶ�� �� �׻��� �������� �־�� ��
	}

}
