package JAVAGUI;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.awt.*;

public class MyHealthTrainer extends JFrame {
	//요일
	private Calendar calendar = Calendar.getInstance();
    private String[] days = {"일","월","화","수","목","금","토"};
    private String yoil = days[calendar.get(Calendar.DAY_OF_WEEK)-1];
	//날짜
	private Date date = new Date();
	private SimpleDateFormat sdformat = new SimpleDateFormat("yyyy년 MM월 dd일"); 
	private String today = sdformat.format(date);
	
	/*설정변수
	 * purposeOption 1:벌크업 2:다이어트 3:힘증가
	 * locationOption 1:집 2:헬스장
	 */
	private int purposeOption = 0;
	private int locationOption = 0;
	
	//메인프레임
	private JFrame mainFrame;
	//메인 패널
	private JTabbedPane mainPanel;
	//서브 패널
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
		
		mainPanel.add("헬스루틴",routinePanel);
		mainPanel.add("식단",dietPanel);
		mainPanel.add("동기부여",motivationPanel);
		mainPanel.add("설정",optionPanel);
		
		//1.헬스루틴
		routinePanel.setLayout(null);
		//1-1 날짜,시간
		JLabel label_2 = new JLabel(today+" "+yoil+"요일");
		label_2.setFont(new Font("굴림", Font.BOLD, 17));
		label_2.setBounds(0, 0, 209, 30);
		routinePanel.add(label_2);
		
		//2.식단
		dietPanel.setLayout(null);
		//2-1 날짜,시간
		JLabel label_1 = new JLabel(today+" "+yoil+"요일");
		label_1.setFont(new Font("굴림", Font.BOLD, 17));
		label_1.setBounds(0, 0, 209, 30);
		dietPanel.add(label_1);
		
		//3.동기부여
		motivationPanel.setLayout(null);
		//3-1 날짜,시간
		JLabel label = new JLabel(today+" "+yoil+"요일");
		label.setFont(new Font("굴림", Font.BOLD, 17));
		label.setBounds(0, 0, 209, 30);
		motivationPanel.add(label);
		
		//4.설정
		optionPanel.setLayout(null);
		
		//4-1 운동목적
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
		
		JRadioButton bt3 = new JRadioButton("\uD798\uC99D\uAC00(\uAE30\uB2A5\uC131 \uC6B4\uB3D9)");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 3;
			}
		});
		bt3.setBounds(231, 105, 140, 23);
		optionPanel.add(bt3);
		
		ButtonGroup purposeButton = new ButtonGroup();
		purposeButton.add(bt1);
		purposeButton.add(bt2);
		purposeButton.add(bt3);
		
		//4-2 운동위치
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
		
		//4-3 날짜,요일
		JLabel datelb = new JLabel(today+" "+yoil+"요일");
		datelb.setFont(new Font("굴림", Font.BOLD, 17));
		datelb.setBounds(0, 0, 209, 30);
		optionPanel.add(datelb);
		
		//메인프레임 셋팅
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(420,320);
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] ar){ 
		new MyHealthTrainer();
	}
}
