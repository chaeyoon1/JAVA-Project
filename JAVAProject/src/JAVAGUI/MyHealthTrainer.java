package JAVAGUI;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.awt.*;

public class MyHealthTrainer extends JFrame {
	// ��¥, ����
	private Calendar calendar = Calendar.getInstance();
	private String[] days = { "��", "��", "ȭ", "��", "��", "��", "��" };
	private String yoil = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	private Date date = new Date();
	private SimpleDateFormat sdformat = new SimpleDateFormat("yyyy�� MM�� dd��");
	private String today = sdformat.format(date);

	/*
	 * �������� 
	 * purposeOption 1:��ũ�� 2:���̾�Ʈ 3:������ 
	 * locationOption 1:�� 2:�ｺ��
	 */
	private int purposeOption = 0;
	private int locationOption = 0;

	// ����������,�����г�
	private JFrame mainFrame;
	private JTabbedPane mainPanel;
	// ���� �г�
	private JPanel routinePanel;
	private JPanel dietPanel;
	private JPanel motivationPanel;
	private JPanel optionPanel;
	private JPanel diaryPanel;

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
		diaryPanel = new JPanel();

		mainPanel.add("�ｺ��ƾ", routinePanel);
		mainPanel.add("�Ĵ�", dietPanel);
		mainPanel.add("����ο�", motivationPanel);
		mainPanel.add("����", optionPanel);
		mainPanel.add("��Ͻ�",diaryPanel);

		RoutinePanel();
		DietPanel();
		MotivationPanel();
		OptionPanel();
		DiaryPanel();

		// ���������� ����
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(420, 320);
		mainFrame.setVisible(true);
	}

	public void RoutinePanel() {
		// 1.�ｺ��ƾ
		routinePanel.setLayout(null);

		// 1-1 ��¥,�ð�
		JLabel label_2 = new JLabel(today + " " + yoil + "����");
		label_2.setFont(new Font("����", Font.BOLD, 17));
		label_2.setBounds(0, 0, 209, 30);
		routinePanel.add(label_2);
	}

	public void DietPanel() {
		// 2.�Ĵ�
		dietPanel.setLayout(null);

		// 2-1 ��¥,�ð�
		JLabel label_1 = new JLabel(today + " " + yoil + "����");
		label_1.setFont(new Font("����", Font.BOLD, 17));
		label_1.setBounds(0, 0, 209, 30);
		dietPanel.add(label_1);
	}

	public void MotivationPanel() {
		// 3.����ο�
		motivationPanel.setLayout(null);

		// 3-1 ��¥,�ð�
		JLabel label = new JLabel(today + " " + yoil + "����");
		label.setFont(new Font("����", Font.BOLD, 17));
		label.setBounds(0, 0, 209, 30);
		motivationPanel.add(label);
		
		//3-2 ������ ����
		JButton picbt = new JButton("\uC624\uB298\uC758 \uC0AC\uC9C4");
		picbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(purposeOption==1){
					if(yoil=="��"){
						new ImageLoad("motivationImage//bul//bul1.jpg");
					}else if(yoil=="ȭ"){
						new ImageLoad("motivationImage//bul//bul2.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//bul//bul3.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//bul//bul4.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//bul//bul5.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//bul//bul6.jpg");
					}else if(yoil=="��"){
						JOptionPane.showMessageDialog(null,"������ ���³�!");
					}
				}else if(purposeOption==2){
					if(yoil=="��"){
						new ImageLoad("motivationImage//diet//diet1.jpg");
					}else if(yoil=="ȭ"){
						new ImageLoad("motivationImage//diet//diet2.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//diet//diet3.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//diet//diet4.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//diet//diet5.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//diet//diet6.jpg");
					}else if(yoil=="��"){
						JOptionPane.showMessageDialog(null,"������ ���³�!");
					}
				}else if(purposeOption==3){
					if(yoil=="��"){
						new ImageLoad("motivationImage//func//func1.jpg");
					}else if(yoil=="ȭ"){
						new ImageLoad("motivationImage//func//func2.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//func//func3.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//func//func4.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//func//func5.jpg");
					}else if(yoil=="��"){
						new ImageLoad("motivationImage//func//func6.jpg");
					}else if(yoil=="��"){
						JOptionPane.showMessageDialog(null,"������ ���³�!");
					}
				}
			}	
		});
		picbt.setBounds(150, 87, 103, 23);
		motivationPanel.add(picbt);
		
		//3-3 ������ ����
		JButton vidbt = new JButton("\uC624\uB298\uC758 \uC601\uC0C1");
		vidbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(locationOption==1){
					new VideoLink("https://www.youtube.com/watch?v=I0PLnLDxYV4");
				} else if (locationOption==2){
					new VideoLink("https://www.youtube.com/watch?v=n-uWtKO6JDo");
				}
				
			}
		});
		vidbt.setBounds(150, 159, 103, 23);
		motivationPanel.add(vidbt);
	}

	public void OptionPanel() {
		// 4.����
		optionPanel.setLayout(null);

		// 4-1 �����
		JLabel lb1 = new JLabel("\uC6B4\uB3D9\uBAA9\uC801");
		lb1.setBounds(12, 109, 57, 15);
		optionPanel.add(lb1);

		JRadioButton bt1 = new JRadioButton("\uBC8C\uD06C\uC5C5");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 1;
			}
		});
		bt1.setBounds(74, 105, 70, 23);
		optionPanel.add(bt1);

		JRadioButton bt2 = new JRadioButton("\uB2E4\uC774\uC5B4\uD2B8");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 2;
			}
		});
		bt2.setBounds(148, 105, 79, 23);
		optionPanel.add(bt2);

		JRadioButton bt3 = new JRadioButton("\uAE30\uB2A5\uC131 \uC6B4\uB3D9");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 3;
			}
		});
		bt3.setBounds(231, 105, 110, 23);
		optionPanel.add(bt3);

		ButtonGroup purposeButton = new ButtonGroup();
		purposeButton.add(bt1);
		purposeButton.add(bt2);
		purposeButton.add(bt3);

		// 4-2 ���ġ
		JLabel lb2 = new JLabel("\uC6B4\uB3D9\uC704\uCE58");
		lb2.setBounds(12, 150, 57, 15);
		optionPanel.add(lb2);

		JRadioButton bt4 = new JRadioButton("\uC9D1");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationOption = 1;
			}
		});
		bt4.setBounds(74, 146, 70, 23);
		optionPanel.add(bt4);

		JRadioButton bt5 = new JRadioButton("\uD5EC\uC2A4\uC7A5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationOption = 2;
			}
		});
		bt5.setBounds(148, 146, 79, 23);
		optionPanel.add(bt5);

		ButtonGroup locationButton = new ButtonGroup();
		locationButton.add(bt4);
		locationButton.add(bt5);

		// 4-3 ��¥,����
		JLabel datelb = new JLabel(today + " " + yoil + "����");
		datelb.setFont(new Font("����", Font.BOLD, 17));
		datelb.setBounds(0, 0, 209, 30);
		optionPanel.add(datelb);

	}
	
	// 5. ����
	public void DiaryPanel(){
		//5-1
		diaryPanel.setLayout(null);
		//5-2 ��¥,����
		JLabel label = new JLabel("2017\uB144 06\uC6D4 22\uC77C \uBAA9\uC694\uC77C");
		label.setFont(new Font("����", Font.BOLD, 17));
		label.setBounds(0, 0, 209, 30);
		diaryPanel.add(label);
	}

	public static void main(String[] ar) {
		new MyHealthTrainer();
	}
}
