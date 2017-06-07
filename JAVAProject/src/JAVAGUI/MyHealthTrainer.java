package JAVAGUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyHealthTrainer extends JFrame {
	/*��������
	 * purposeOption 1:��ũ�� 2:���̾�Ʈ 3:������
	 * locationOption 1:�� 2:�ｺ��
	 */
	private int purposeOption = 0;
	private int locationOption = 0;
	//����������
	private JFrame mainFrame;
	//���� �г�
	private JTabbedPane mainPanel;
	//���� �г�
	private JPanel routinePanel;
	private JPanel dietPanel;
	private JPanel motivationPanel;
	private JPanel optionPanel;
	
	public MyHealthTrainer() {
		mainFrame = new JFrame();
		mainFrame.setTitle("\uB098\uB9CC\uC758 \uD5EC\uC2A4 \uD2B8\uB808\uC774\uB108");
		mainFrame.getContentPane().setLayout(null);
		mainPanel = new JTabbedPane();
		mainPanel.setBounds(0, 0, 404, 282);
		mainFrame.getContentPane().add(mainPanel);
		routinePanel = new JPanel();
		dietPanel = new JPanel();
		motivationPanel = new JPanel();
		optionPanel = new JPanel();
		
		//1.�ｺ��ƾ
		mainPanel.add("�ｺ��ƾ",routinePanel);
		routinePanel.setLayout(null);
		
		//2.�Ĵ�
		mainPanel.add("�Ĵ�",dietPanel);
		dietPanel.setLayout(null);
		
		//3.����ο�
		mainPanel.add("����ο�",motivationPanel);
		motivationPanel.setLayout(null);
		
		//4.����
		mainPanel.add("����",optionPanel);
		optionPanel.setLayout(null);
		
		//4-1 �����
		JLabel lb1 = new JLabel("\uC6B4\uB3D9\uBAA9\uC801");
		lb1.setBounds(12, 54, 57, 15);
		optionPanel.add(lb1);
		
		JRadioButton bt1 = new JRadioButton("\uBC8C\uD06C\uC5C5");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 1;
			}
		});
		bt1.setBounds(74, 50, 70, 23);
		optionPanel.add(bt1);
		
		JRadioButton bt2 = new JRadioButton("\uB2E4\uC774\uC5B4\uD2B8");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 2;
			}
		});
		bt2.setBounds(148, 50, 79, 23);
		optionPanel.add(bt2);
		
		JRadioButton bt3 = new JRadioButton("\uD798\uC99D\uAC00(\uAE30\uB2A5\uC131 \uC6B4\uB3D9)");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 3;
			}
		});
		bt3.setBounds(231, 50, 140, 23);
		optionPanel.add(bt3);
		
		ButtonGroup purposeButton = new ButtonGroup();
		purposeButton.add(bt1);
		purposeButton.add(bt2);
		purposeButton.add(bt3);
		
		//4-2 ���ġ
		JLabel lb2 = new JLabel("\uC6B4\uB3D9\uC704\uCE58");
		lb2.setBounds(12, 99, 57, 15);
		optionPanel.add(lb2);
		
		JRadioButton bt4 = new JRadioButton("\uC9D1");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationOption = 1;
			}
		});
		bt4.setBounds(74, 95, 70, 23);
		optionPanel.add(bt4);
		
		JRadioButton bt5 = new JRadioButton("\uD5EC\uC2A4\uC7A5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationOption = 2;
			}
		});
		bt5.setBounds(148, 95, 79, 23);
		optionPanel.add(bt5);
		
		ButtonGroup locationButton = new ButtonGroup();
		locationButton.add(bt4);
		locationButton.add(bt5);
		
		//���������� ����
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(420,320);
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] ar){ 
		new MyHealthTrainer();
	}
}
