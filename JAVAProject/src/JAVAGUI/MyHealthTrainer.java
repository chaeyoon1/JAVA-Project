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
	// ��¥, ����, ��
	private Calendar calendar = Calendar.getInstance();
	private String[] days = { "��", "��", "ȭ", "��", "��", "��", "��" };
	private String yoil = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	
	private Date date = new Date();
	private SimpleDateFormat sdformat = new SimpleDateFormat("yyyy�� MM�� dd��");
	private String today = sdformat.format(date);
	
	private SimpleDateFormat sdformat2 = new SimpleDateFormat("dd");
	private String day1 = sdformat2.format(date);
	private int il = Integer.parseInt(day1);
	/*
	 * �������� 
	 * purposeOption 1:��ũ�� 2:���̾�Ʈ 3:������ 
	 * locationOption 1:�� 2:�ｺ��
	 * levelOption 1:�ʱ� 2:�߱� 3:���
	 */
	private int purposeOption = 0;
	private int locationOption = 0;
	private int levelOption = 0;
	
	// ����������,�����г�
	private JFrame mainFrame;
	private JTabbedPane mainPanel;
	// ���� �г�
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
		
		mainPanel.add("�ｺ��ƾ", routinePanel);
		mainPanel.add("�Ĵ�", dietPanel);
		mainPanel.add("����ο�", motivationPanel);
		mainPanel.add("����", optionPanel);
		mainPanel.add("����",manualPanel);
		
		RoutinePanel();
		DietPanel();
		MotivationPanel();
		OptionPanel();
		ManualPanel();
		
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
		
		// 1-2 ������ �
		JButton btnNewButton = new JButton("\uC624\uB298\uC758 \uC6B4\uB3D9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (yoil == "��") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �ʱ�//���ʿ�.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �߱�//���߿�.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//��ũ//�ｺ�� ���//����.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "��ũ���� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//���̾�Ʈ//��//�ʱ�//�����ʿ�.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "��,����ڿ� ���̾�Ʈ�� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "�ʱ��ڿ� ���̾�Ʈ�� ������!\n" + "���ġ�� ������ �ٲ��ּ���.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//���̾�Ʈ//�ｺ��//�߱ް��//�����߰��.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//��ɼ�//�ʱ�//���ʿ�,��.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//��ɼ�//�߱�//���߿�,��.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//��ɼ�//���//����,��.png");
						}
					}
				} else if (yoil == "ȭ") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �ʱ�//����ȭ.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �߱�//����ȭ.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//��ũ//�ｺ�� ���//���ȭ.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "��ũ���� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//���̾�Ʈ//��//�ʱ�//������ȭ.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "��,����ڿ� ���̾�Ʈ�� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "�ʱ��ڿ� ���̾�Ʈ�� ������!\n" + "���ġ�� ������ �ٲ��ּ���.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//���̾�Ʈ//�ｺ��//�߱ް��//�����߰�ȭ.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//��ɼ�//�ʱ�//����ȭ,��.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//��ɼ�//�߱�//����ȭ,��.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//��ɼ�//���//���ȭ,��.png");
						}
					}
				} else if (yoil == "��") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �ʱ�//���ʼ�.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �߱�//���߼�.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//��ũ//�ｺ�� ���//����.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "��ũ���� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//���̾�Ʈ//��//�ʱ�//�����ʼ�.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "��,����ڿ� ���̾�Ʈ�� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "�ʱ��ڿ� ���̾�Ʈ�� ������!\n" + "���ġ�� ������ �ٲ��ּ���.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//���̾�Ʈ//�ｺ��//�߱ް��//�����߰��.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//��ɼ�//�ʱ�//���ʼ�,��.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//��ɼ�//�߱�//���߼�,��.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//��ɼ�//���//����,��.png");
						}
					}
				} else if (yoil == "��") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �ʱ�//���ʸ�.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �߱�//���߸�.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//��ũ//�ｺ�� ���//����.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "��ũ���� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//���̾�Ʈ//��//�ʱ�//�����ʸ�.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "��,����ڿ� ���̾�Ʈ�� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "�ʱ��ڿ� ���̾�Ʈ�� ������!\n" + "���ġ�� ������ �ٲ��ּ���.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//���̾�Ʈ//�ｺ��//�߱ް��//�����߰��.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//��ɼ�//�ʱ�//���ʿ�,��.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//��ɼ�//�߱�//���߿�,��.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//��ɼ�//���//����,��.png");
						}
					}
				} else if (yoil == "��") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �ʱ�//���ʱ�.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �߱�//���߱�.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//��ũ//�ｺ�� ���//����.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "��ũ���� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//���̾�Ʈ//��//�ʱ�//�����ʱ�.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "��,����ڿ� ���̾�Ʈ�� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "�ʱ��ڿ� ���̾�Ʈ�� ������!\n" + "���ġ�� ������ �ٲ��ּ���.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//���̾�Ʈ//�ｺ��//�߱ް��//�����߰��.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//��ɼ�//�ʱ�//����ȭ,��.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//��ɼ�//�߱�//����ȭ,��.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//��ɼ�//���//���ȭ,��.png");
						}
					}
				} else if (yoil == "��") {
					if (purposeOption == 1) {
						if (locationOption == 2) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �ʱ�//������.png");
							} else if (levelOption == 2) {
								new ImageLoad("routineImage//��ũ//�ｺ�� �߱�//������.png");
							} else if (levelOption == 3) {
								new ImageLoad("routineImage//��ũ//�ｺ�� ���//�����.png");
							}
						} else {
							JOptionPane.showMessageDialog(null, "��ũ���� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
						}
					} else if (purposeOption == 2) {
						if (locationOption == 1) {
							if (levelOption == 1) {
								new ImageLoad("routineImage//���̾�Ʈ//��//�ʱ�//��������.png");
							} else if (levelOption == 2 || levelOption == 3) {
								JOptionPane.showMessageDialog(null, "��,����ڿ� ���̾�Ʈ�� �ｺ�忡��!\n" + "���ġ�� �ｺ������ �ٲ��ּ���.");
							}
						} else if (locationOption == 2) {
							if (levelOption == 1) {
								JOptionPane.showMessageDialog(null, "�ʱ��ڿ� ���̾�Ʈ�� ������!\n" + "���ġ�� ������ �ٲ��ּ���.");
							} else if (levelOption == 2 || levelOption == 3) {
								new ImageLoad("routineImage//���̾�Ʈ//�ｺ��//�߱ް��//�����߰���.png");
							}
						}
					} else if (purposeOption == 3) {
						if (levelOption == 1) {
							new ImageLoad("routineImage//��ɼ�//�ʱ�//���ʼ�,��.png");
						} else if (levelOption == 2) {
							new ImageLoad("routineImage//��ɼ�//�߱�//���߼�,��.png");
						} else if (levelOption == 3) {
							new ImageLoad("routineImage//��ɼ�//���//����,��.png");
						}
					}
				} else if (yoil == "��") {
					JOptionPane.showMessageDialog(null, "�Ͽ����� �޽�~");
				} else {
					JOptionPane.showMessageDialog(null, "������ �Ϸ��� �ּ���");
				}
			}
		});
		btnNewButton.setFont(new Font("����", Font.BOLD, 18));
		btnNewButton.setBounds(110, 92, 174, 61);
		routinePanel.add(btnNewButton);
	}

	public void DietPanel() {
		// 2.�Ĵ�
		dietPanel.setLayout(null);

		// 2-1 ��¥,�ð�
		JLabel label_1 = new JLabel(today + " " + yoil + "����");
		label_1.setFont(new Font("����", Font.BOLD, 17));
		label_1.setBounds(0, 0, 209, 30);
		dietPanel.add(label_1);
		// 2-2 ������ �Ĵ�
		JButton button = new JButton("\uC624\uB298\uC758 \uC2DD\uB2E8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(purposeOption==1){
					if(yoil=="��"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//����.png");
					}else if(yoil=="ȭ"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//��ȭ.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//����.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//����.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//����.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//����.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//��ũ�� �Ĵ�//����.png");
					}
				}else if(purposeOption==2){
					if(yoil=="��"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//�ٿ�.png");
					}else if(yoil=="ȭ"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//��ȭ.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//�ټ�.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//�ٸ�.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//�ٱ�.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//����.png");
					}else if(yoil=="��"){
						new ImageLoad("dietImage//���̾�Ʈ �Ĵ�//����.png");
					}
				}else if(purposeOption==3){
					JOptionPane.showMessageDialog(null, "��ɼ� ��� �����̶�� ������!");
				}else{
					JOptionPane.showMessageDialog(null, "������� ������ �ּ���");
				}
			}
		});
		button.setFont(new Font("����", Font.BOLD, 18));
		button.setBounds(110, 92, 174, 61);
		dietPanel.add(button);
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
		picbt.setFont(new Font("����", Font.BOLD, 18));
		picbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(purposeOption==1){
					if (il >= 1 && il<=14) {
						if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul1.jpg");
						} else if (yoil == "ȭ") {
							new ImageLoad("motivationImage//bul//bul2.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul3.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul4.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul5.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul6.jpg");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					} else if (il>=15){
						if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul7.jpg");
						} else if (yoil == "ȭ") {
							new ImageLoad("motivationImage//bul//bul8.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul9.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul10.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul11.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//bul//bul12.jpg");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}
				}else if(purposeOption==2){
					if (il >= 1 && il <= 14) {
						if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet1.jpg");
						} else if (yoil == "ȭ") {
							new ImageLoad("motivationImage//diet//diet2.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet3.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet4.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet5.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet6.jpg");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					} else if (il>=15){
						if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet7.jpg");
						} else if (yoil == "ȭ") {
							new ImageLoad("motivationImage//diet//diet8.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet9.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet10.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet11.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//diet//diet12.jpg");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}
				}else if(purposeOption==3){
					if (il >= 1 && il <= 14) {
						if (yoil == "��") {
							new ImageLoad("motivationImage//func//func1.jpg");
						} else if (yoil == "ȭ") {
							new ImageLoad("motivationImage//func//func2.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func3.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func4.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func5.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func6.jpg");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					} else if (il>=15){
						if (yoil == "��") {
							new ImageLoad("motivationImage//func//func7.jpg");
						} else if (yoil == "ȭ") {
							new ImageLoad("motivationImage//func//func8.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func9.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func10.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func11.jpg");
						} else if (yoil == "��") {
							new ImageLoad("motivationImage//func//func12.jpg");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "������� ������ �ּ���!");
				}
			}	
		});
		picbt.setBounds(121, 56, 160, 54);
		motivationPanel.add(picbt);
		
		//3-3 ������ ����
		JButton vidbt = new JButton("\uC624\uB298\uC758 \uC601\uC0C1");
		vidbt.setFont(new Font("����", Font.BOLD, 18));
		vidbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(locationOption==1){
					if(il>=1&&il<=14){
						if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=2JBbyNh7M2g");
						} else if (yoil == "ȭ") {
							new VideoLink("https://www.youtube.com/watch?v=slKwlfDCosY");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=qWy_aOlB45Y");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=YdB1HMCldJY");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=mvJHw64fxgQ");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=aCk3l6lxc-s");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}else if(il>=15){
						if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=WIHy-ZnSndA");
						} else if (yoil == "ȭ") {
							new VideoLink("https://www.youtube.com/watch?v=hQU08BlmYG4");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=VHyGqsPOUHs");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=cGuItZpixAQ");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=jHeHp6jIdd8");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=mf4XVyxGrZQ");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}
				} else if (locationOption==2){
					if(il>=1&&il<=14){
						if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=at7QvbFy9fM");
						} else if (yoil == "ȭ") {
							new VideoLink("https://www.youtube.com/watch?v=Bw2w3oCROR8");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=VlXXhLMiro8");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=7Xnndnwk6As");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=VeuvdtHKzF0");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=QM_GobcKsuQ");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}else if(il>=15){
						if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=9NJcNcW1xH4");
						} else if (yoil == "ȭ") {
							new VideoLink("https://www.youtube.com/watch?v=vPBBI28MkCU");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=zp1VS7fge34");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=BkUXGC03KvE");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=YsnAIM0vvO4");
						} else if (yoil == "��") {
							new VideoLink("https://www.youtube.com/watch?v=YdTyXyx9mMc");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "���ġ�� ������ �ּ���!");
				}
				
			}
		});
		vidbt.setBounds(121, 128, 160, 54);
		motivationPanel.add(vidbt);
	}

	public void OptionPanel() {
		// 4.����
		optionPanel.setLayout(null);

		// 4-1 �����
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

		// 4-2 ���ġ
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

		// 4-3 ��¥,����
		JLabel datelb = new JLabel(today + " " + yoil + "����");
		datelb.setFont(new Font("����", Font.BOLD, 17));
		datelb.setBounds(0, 0, 209, 30);
		optionPanel.add(datelb);
		
		//4-4 ���
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
	// 5. �, �Ĵ� ����
	public void ManualPanel(){
		// 5. ����
		manualPanel.setLayout(null);
		// 5-1 �ð�,����
		JLabel datelb = new JLabel(today + " " + yoil + "����");
		datelb.setFont(new Font("����", Font.BOLD, 17));
		datelb.setBounds(0, 0, 209, 30);
		manualPanel.add(datelb);
	}
	
	public static void main(String[] ar) {
		new MyHealthTrainer();
	}
}
