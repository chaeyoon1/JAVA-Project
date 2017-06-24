package JAVAGUI;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.awt.*;

public class MyHealthTrainer extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 날짜, 요일, 일
	private Calendar calendar = Calendar.getInstance();
	private String[] days = { "일", "월", "화", "수", "목", "금", "토" };
	private String yoil = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	
	private Date date = new Date();
	private SimpleDateFormat sdformat = new SimpleDateFormat("yyyy년 MM월 dd일");
	private String today = sdformat.format(date);
	
	private SimpleDateFormat sdformat2 = new SimpleDateFormat("dd");
	private String day1 = sdformat2.format(date);
	private int il = Integer.parseInt(day1);
	/*
	 * 설정변수 
	 * purposeOption 1:벌크업 2:다이어트 3:힘증가 
	 * locationOption 1:집 2:헬스장
	 * levelOption 1:초급 2:중급 3:고급
	 */
	private int purposeOption = 0;
	private int locationOption = 0;
	private int levelOption = 0;
	
	// 메인프레임,메인패널
	private JFrame mainFrame;
	private JTabbedPane mainPanel;
	// 서브 패널
	private JPanel routinePanel;
	private JPanel dietPanel;
	private JPanel motivationPanel;
	private JPanel optionPanel;
	private JPanel manualPanel;
	
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
		manualPanel = new JPanel();
		
		mainPanel.add("헬스루틴", routinePanel);
		mainPanel.add("식단", dietPanel);
		mainPanel.add("동기부여", motivationPanel);
		mainPanel.add("설정", optionPanel);
		mainPanel.add("설명서",manualPanel);
		
		RoutinePanel();
		DietPanel();
		MotivationPanel();
		OptionPanel();
		ManualPanel();
		
		// 메인프레임 셋팅
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(420, 320);
		mainFrame.setVisible(true);
	}

	public void RoutinePanel() {
		// 1.헬스루틴
		routinePanel.setLayout(null);

		// 1-1 날짜,시간
		JLabel label_2 = new JLabel(today + " " + yoil + "요일");
		label_2.setFont(new Font("굴림", Font.BOLD, 17));
		label_2.setBounds(0, 0, 209, 30);
		routinePanel.add(label_2);
		
		// 1-2 오늘의 운동
		JButton btnNewButton = new JButton("\uC624\uB298\uC758 \uC6B4\uB3D9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (yoil == "월") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//벌크//헬스장 초급//헬초월.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//벌크//헬스장 중급//헬중월.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//벌크//헬스장 고급//헬고월.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "벌크업은 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//다이어트//집//초급//다집초월.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "중,고급자용 다이어트는 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "초급자용 다이어트는 집에서!\n" + "운동위치를 집으로 바꿔주세요.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//다이어트//헬스장//중급고급//다헬중고월.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//기능성//초급//기초월,목.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//기능성//중급//기중월,목.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//기능성//고급//기고월,목.png");
						}
					}
				} else if (yoil == "화") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//벌크//헬스장 초급//헬초화.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//벌크//헬스장 중급//헬중화.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//벌크//헬스장 고급//헬고화.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "벌크업은 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//다이어트//집//초급//다집초화.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "중,고급자용 다이어트는 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "초급자용 다이어트는 집에서!\n" + "운동위치를 집으로 바꿔주세요.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//다이어트//헬스장//중급고급//다헬중고화.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//기능성//초급//기초화,금.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//기능성//중급//기중화,금.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//기능성//고급//기고화,금.png");
						}
					}
				} else if (yoil == "수") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//벌크//헬스장 초급//헬초수.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//벌크//헬스장 중급//헬중수.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//벌크//헬스장 고급//헬고수.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "벌크업은 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//다이어트//집//초급//다집초수.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "중,고급자용 다이어트는 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "초급자용 다이어트는 집에서!\n" + "운동위치를 집으로 바꿔주세요.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//다이어트//헬스장//중급고급//다헬중고수.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//기능성//초급//기초수,토.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//기능성//중급//기중수,토.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//기능성//고급//기고수,토.png");
						}
					}
				} else if (yoil == "목") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//벌크//헬스장 초급//헬초목.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//벌크//헬스장 중급//헬중목.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//벌크//헬스장 고급//헬고목.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "벌크업은 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//다이어트//집//초급//다집초목.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "중,고급자용 다이어트는 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "초급자용 다이어트는 집에서!\n" + "운동위치를 집으로 바꿔주세요.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//다이어트//헬스장//중급고급//다헬중고목.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//기능성//초급//기초월,목.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//기능성//중급//기중월,목.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//기능성//고급//기고월,목.png");
						}
					}
				} else if (yoil == "금") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//벌크//헬스장 초급//헬초금.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//벌크//헬스장 중급//헬중금.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//벌크//헬스장 고급//헬고금.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "벌크업은 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//다이어트//집//초급//다집초금.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "중,고급자용 다이어트는 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "초급자용 다이어트는 집에서!\n" + "운동위치를 집으로 바꿔주세요.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//다이어트//헬스장//중급고급//다헬중고금.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//기능성//초급//기초화,금.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//기능성//중급//기중화,금.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//기능성//고급//기고화,금.png");
						}
					}
				} else if (yoil == "토") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//벌크//헬스장 초급//헬초토.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//벌크//헬스장 중급//헬중토.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//벌크//헬스장 고급//헬고토.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "벌크업은 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//다이어트//집//초급//다집초토.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "중,고급자용 다이어트는 헬스장에서!\n" + "운동위치를 헬스장으로 바꿔주세요.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "초급자용 다이어트는 집에서!\n" + "운동위치를 집으로 바꿔주세요.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//다이어트//헬스장//중급고급//다헬중고토.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//기능성//초급//기초수,토.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//기능성//중급//기중수,토.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//기능성//고급//기고수,토.png");
						}
					}
				} else if (yoil == "일") {
					JOptionPane.showMessageDialog(null, "일요일은 휴식~");
				} else {
					JOptionPane.showMessageDialog(null, "설정을 완료해 주세요");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(110, 92, 174, 61);
		routinePanel.add(btnNewButton);
	}

	public void DietPanel() {
		// 2.식단
		dietPanel.setLayout(null);

		// 2-1 날짜,시간
		JLabel label_1 = new JLabel(today + " " + yoil + "요일");
		label_1.setFont(new Font("굴림", Font.BOLD, 17));
		label_1.setBounds(0, 0, 209, 30);
		dietPanel.add(label_1);
		// 2-2 오늘의 식단
		JButton button = new JButton("\uC624\uB298\uC758 \uC2DD\uB2E8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(purposeOption==1){
					if(yoil=="월"){
						new ImageLoad("dietImage//벌크업 식단//벌월.png");
					}else if(yoil=="화"){
						new ImageLoad("dietImage//벌크업 식단//벌화.png");
					}else if(yoil=="수"){
						new ImageLoad("dietImage//벌크업 식단//벌수.png");
					}else if(yoil=="목"){
						new ImageLoad("dietImage//벌크업 식단//벌목.png");
					}else if(yoil=="금"){
						new ImageLoad("dietImage//벌크업 식단//벌금.png");
					}else if(yoil=="토"){
						new ImageLoad("dietImage//벌크업 식단//벌토.png");
					}else if(yoil=="일"){
						new ImageLoad("dietImage//벌크업 식단//벌일.png");
					}
				}else if(purposeOption==2){
					if(yoil=="월"){
						new ImageLoad("dietImage//다이어트 식단//다월.png");
					}else if(yoil=="화"){
						new ImageLoad("dietImage//다이어트 식단//다화.png");
					}else if(yoil=="수"){
						new ImageLoad("dietImage//다이어트 식단//다수.png");
					}else if(yoil=="목"){
						new ImageLoad("dietImage//다이어트 식단//다목.png");
					}else if(yoil=="금"){
						new ImageLoad("dietImage//다이어트 식단//다금.png");
					}else if(yoil=="토"){
						new ImageLoad("dietImage//다이어트 식단//다토.png");
					}else if(yoil=="일"){
						new ImageLoad("dietImage//다이어트 식단//다일.png");
					}
				}else if(purposeOption==3){
					JOptionPane.showMessageDialog(null, "기능성 운동이 목적이라면 자유식!");
				}else{
					JOptionPane.showMessageDialog(null, "운동목적을 설정해 주세요");
				}
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 18));
		button.setBounds(110, 92, 174, 61);
		dietPanel.add(button);
	}

	public void MotivationPanel() {
		// 3.동기부여
		motivationPanel.setLayout(null);

		// 3-1 날짜,시간
		JLabel label = new JLabel(today + " " + yoil + "요일");
		label.setFont(new Font("굴림", Font.BOLD, 17));
		label.setBounds(0, 0, 209, 30);
		motivationPanel.add(label);
		
		//3-2 오늘의 사진
		JButton picbt = new JButton("\uC624\uB298\uC758 \uC0AC\uC9C4");
		picbt.setFont(new Font("굴림", Font.BOLD, 18));
		picbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(purposeOption==1){
					if (il >= 1 && il<=14) {
						if (yoil == "월") {
							new ImageLoad("motivationImage//bul//bul1.jpg");
						} else if (yoil == "화") {
							new ImageLoad("motivationImage//bul//bul2.jpg");
						} else if (yoil == "수") {
							new ImageLoad("motivationImage//bul//bul3.jpg");
						} else if (yoil == "목") {
							new ImageLoad("motivationImage//bul//bul4.jpg");
						} else if (yoil == "금") {
							new ImageLoad("motivationImage//bul//bul5.jpg");
						} else if (yoil == "토") {
							new ImageLoad("motivationImage//bul//bul6.jpg");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					} else if (il>=15){
						if (yoil == "월") {
							new ImageLoad("motivationImage//bul//bul7.jpg");
						} else if (yoil == "화") {
							new ImageLoad("motivationImage//bul//bul8.jpg");
						} else if (yoil == "수") {
							new ImageLoad("motivationImage//bul//bul9.jpg");
						} else if (yoil == "목") {
							new ImageLoad("motivationImage//bul//bul10.jpg");
						} else if (yoil == "금") {
							new ImageLoad("motivationImage//bul//bul11.jpg");
						} else if (yoil == "토") {
							new ImageLoad("motivationImage//bul//bul12.jpg");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}
				}else if(purposeOption==2){
					if (il >= 1 && il <= 14) {
						if (yoil == "월") {
							new ImageLoad("motivationImage//diet//diet1.jpg");
						} else if (yoil == "화") {
							new ImageLoad("motivationImage//diet//diet2.jpg");
						} else if (yoil == "수") {
							new ImageLoad("motivationImage//diet//diet3.jpg");
						} else if (yoil == "목") {
							new ImageLoad("motivationImage//diet//diet4.jpg");
						} else if (yoil == "금") {
							new ImageLoad("motivationImage//diet//diet5.jpg");
						} else if (yoil == "토") {
							new ImageLoad("motivationImage//diet//diet6.jpg");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					} else if (il>=15){
						if (yoil == "월") {
							new ImageLoad("motivationImage//diet//diet7.jpg");
						} else if (yoil == "화") {
							new ImageLoad("motivationImage//diet//diet8.jpg");
						} else if (yoil == "수") {
							new ImageLoad("motivationImage//diet//diet9.jpg");
						} else if (yoil == "목") {
							new ImageLoad("motivationImage//diet//diet10.jpg");
						} else if (yoil == "금") {
							new ImageLoad("motivationImage//diet//diet11.jpg");
						} else if (yoil == "토") {
							new ImageLoad("motivationImage//diet//diet12.jpg");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}
				}else if(purposeOption==3){
					if (il >= 1 && il <= 14) {
						if (yoil == "월") {
							new ImageLoad("motivationImage//func//func1.jpg");
						} else if (yoil == "화") {
							new ImageLoad("motivationImage//func//func2.jpg");
						} else if (yoil == "수") {
							new ImageLoad("motivationImage//func//func3.jpg");
						} else if (yoil == "목") {
							new ImageLoad("motivationImage//func//func4.jpg");
						} else if (yoil == "금") {
							new ImageLoad("motivationImage//func//func5.jpg");
						} else if (yoil == "토") {
							new ImageLoad("motivationImage//func//func6.jpg");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					} else if (il>=15){
						if (yoil == "월") {
							new ImageLoad("motivationImage//func//func7.jpg");
						} else if (yoil == "화") {
							new ImageLoad("motivationImage//func//func8.jpg");
						} else if (yoil == "수") {
							new ImageLoad("motivationImage//func//func9.jpg");
						} else if (yoil == "목") {
							new ImageLoad("motivationImage//func//func10.jpg");
						} else if (yoil == "금") {
							new ImageLoad("motivationImage//func//func11.jpg");
						} else if (yoil == "토") {
							new ImageLoad("motivationImage//func//func12.jpg");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "운동목적을 설정해 주세요!");
				}
			}	
		});
		picbt.setBounds(121, 56, 160, 54);
		motivationPanel.add(picbt);
		
		//3-3 오늘의 영상
		JButton vidbt = new JButton("\uC624\uB298\uC758 \uC601\uC0C1");
		vidbt.setFont(new Font("굴림", Font.BOLD, 18));
		vidbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(locationOption==1){
					if(il>=1&&il<=14){
						if (yoil == "월") {
							new VideoLink("https://www.youtube.com/watch?v=2JBbyNh7M2g");
						} else if (yoil == "화") {
							new VideoLink("https://www.youtube.com/watch?v=slKwlfDCosY");
						} else if (yoil == "수") {
							new VideoLink("https://www.youtube.com/watch?v=qWy_aOlB45Y");
						} else if (yoil == "목") {
							new VideoLink("https://www.youtube.com/watch?v=YdB1HMCldJY");
						} else if (yoil == "금") {
							new VideoLink("https://www.youtube.com/watch?v=mvJHw64fxgQ");
						} else if (yoil == "토") {
							new VideoLink("https://www.youtube.com/watch?v=aCk3l6lxc-s");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}else if(il>=15){
						if (yoil == "월") {
							new VideoLink("https://www.youtube.com/watch?v=WIHy-ZnSndA");
						} else if (yoil == "화") {
							new VideoLink("https://www.youtube.com/watch?v=hQU08BlmYG4");
						} else if (yoil == "수") {
							new VideoLink("https://www.youtube.com/watch?v=VHyGqsPOUHs");
						} else if (yoil == "목") {
							new VideoLink("https://www.youtube.com/watch?v=cGuItZpixAQ");
						} else if (yoil == "금") {
							new VideoLink("https://www.youtube.com/watch?v=jHeHp6jIdd8");
						} else if (yoil == "토") {
							new VideoLink("https://www.youtube.com/watch?v=mf4XVyxGrZQ");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}
				} else if (locationOption==2){
					if(il>=1&&il<=14){
						if (yoil == "월") {
							new VideoLink("https://www.youtube.com/watch?v=at7QvbFy9fM");
						} else if (yoil == "화") {
							new VideoLink("https://www.youtube.com/watch?v=Bw2w3oCROR8");
						} else if (yoil == "수") {
							new VideoLink("https://www.youtube.com/watch?v=VlXXhLMiro8");
						} else if (yoil == "목") {
							new VideoLink("https://www.youtube.com/watch?v=7Xnndnwk6As");
						} else if (yoil == "금") {
							new VideoLink("https://www.youtube.com/watch?v=VeuvdtHKzF0");
						} else if (yoil == "토") {
							new VideoLink("https://www.youtube.com/watch?v=QM_GobcKsuQ");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}else if(il>=15){
						if (yoil == "월") {
							new VideoLink("https://www.youtube.com/watch?v=9NJcNcW1xH4");
						} else if (yoil == "화") {
							new VideoLink("https://www.youtube.com/watch?v=vPBBI28MkCU");
						} else if (yoil == "수") {
							new VideoLink("https://www.youtube.com/watch?v=zp1VS7fge34");
						} else if (yoil == "목") {
							new VideoLink("https://www.youtube.com/watch?v=BkUXGC03KvE");
						} else if (yoil == "금") {
							new VideoLink("https://www.youtube.com/watch?v=YsnAIM0vvO4");
						} else if (yoil == "토") {
							new VideoLink("https://www.youtube.com/watch?v=YdTyXyx9mMc");
						} else if (yoil == "일") {
							JOptionPane.showMessageDialog(null, "오늘은 쉬는날!");
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "운동위치를 설정해 주세요!");
				}
				
			}
		});
		vidbt.setBounds(121, 128, 160, 54);
		motivationPanel.add(vidbt);
	}

	public void OptionPanel() {
		// 4.설정
		optionPanel.setLayout(null);

		// 4-1 운동목적
		JLabel lb1 = new JLabel("\uC6B4\uB3D9\uBAA9\uC801");
		lb1.setBounds(12, 152, 57, 15);
		optionPanel.add(lb1);

		JRadioButton bt1 = new JRadioButton("\uBC8C\uD06C\uC5C5");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 1;
			}
		});
		bt1.setBounds(74, 148, 70, 23);
		optionPanel.add(bt1);

		JRadioButton bt2 = new JRadioButton("\uB2E4\uC774\uC5B4\uD2B8");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 2;
			}
		});
		bt2.setBounds(148, 148, 79, 23);
		optionPanel.add(bt2);

		JRadioButton bt3 = new JRadioButton("\uAE30\uB2A5\uC131 \uC6B4\uB3D9 (\uCCB4\uC870)");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purposeOption = 3;
			}
		});
		bt3.setBounds(231, 148, 143, 23);
		optionPanel.add(bt3);

		ButtonGroup purposeButton = new ButtonGroup();
		purposeButton.add(bt1);
		purposeButton.add(bt2);
		purposeButton.add(bt3);

		// 4-2 운동위치
		JLabel lb2 = new JLabel("\uC6B4\uB3D9\uC704\uCE58");
		lb2.setBounds(12, 106, 57, 15);
		optionPanel.add(lb2);

		JRadioButton bt4 = new JRadioButton("\uC9D1");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationOption = 1;
			}
		});
		bt4.setBounds(74, 102, 70, 23);
		optionPanel.add(bt4);

		JRadioButton bt5 = new JRadioButton("\uD5EC\uC2A4\uC7A5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationOption = 2;
			}
		});
		bt5.setBounds(148, 102, 79, 23);
		optionPanel.add(bt5);

		ButtonGroup locationButton = new ButtonGroup();
		locationButton.add(bt4);
		locationButton.add(bt5);

		// 4-3 날짜,요일
		JLabel datelb = new JLabel(today + " " + yoil + "요일");
		datelb.setFont(new Font("굴림", Font.BOLD, 17));
		datelb.setBounds(0, 0, 209, 30);
		optionPanel.add(datelb);
		
		//4-4 등급
		JLabel lb3 = new JLabel("\uB4F1\uAE09");
		lb3.setBounds(10, 40, 39, 15);
		optionPanel.add(lb3);
		
		JRadioButton bt6 = new JRadioButton("\uCD08\uAE09(6\uAC1C\uC6D4 \uBBF8\uB9CC)");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				levelOption=1;
			}
		});
		bt6.setBounds(74, 36, 123, 23);
		optionPanel.add(bt6);
		
		JRadioButton bt7 = new JRadioButton("\uC911\uAE09(6\uAC1C\uC6D4 \uC774\uC0C1 2\uB144 \uBBF8\uB9CC)");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				levelOption=2;
			}
		});
		bt7.setBounds(201, 36, 173, 23);
		optionPanel.add(bt7);
		
		JRadioButton bt8 = new JRadioButton("\uACE0\uAE09(2\uB144 \uC774\uC0C1)");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				levelOption=3;
			}
		});
		bt8.setBounds(74, 61, 121, 23);
		optionPanel.add(bt8);
		
		ButtonGroup levelButton = new ButtonGroup();
		levelButton.add(bt6);
		levelButton.add(bt7);
		levelButton.add(bt8);
	}
	// 5. 운동, 식단 설명서
	public void ManualPanel(){
		// 5. 설명서
		manualPanel.setLayout(null);
		// 5-1 시간,요일
		JLabel datelb = new JLabel(today + " " + yoil + "요일");
		datelb.setFont(new Font("굴림", Font.BOLD, 17));
		datelb.setBounds(0, 0, 209, 30);
		manualPanel.add(datelb);
	}
	
	public static void main(String[] ar) {
		new MyHealthTrainer();
	}
}
