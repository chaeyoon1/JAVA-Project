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
							new SiteLink("https://www.youtube.com/watch?v=2JBbyNh7M2g");
						} else if (yoil == "ȭ") {
							new SiteLink("https://www.youtube.com/watch?v=slKwlfDCosY");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=qWy_aOlB45Y");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=YdB1HMCldJY");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=mvJHw64fxgQ");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=aCk3l6lxc-s");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}else if(il>=15){
						if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=WIHy-ZnSndA");
						} else if (yoil == "ȭ") {
							new SiteLink("https://www.youtube.com/watch?v=hQU08BlmYG4");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=VHyGqsPOUHs");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=cGuItZpixAQ");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=jHeHp6jIdd8");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=mf4XVyxGrZQ");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}
				} else if (locationOption==2){
					if(il>=1&&il<=14){
						if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=at7QvbFy9fM");
						} else if (yoil == "ȭ") {
							new SiteLink("https://www.youtube.com/watch?v=Bw2w3oCROR8");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=VlXXhLMiro8");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=7Xnndnwk6As");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=VeuvdtHKzF0");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=QM_GobcKsuQ");
						} else if (yoil == "��") {
							JOptionPane.showMessageDialog(null, "������ ���³�!");
						}
					}else if(il>=15){
						if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=9NJcNcW1xH4");
						} else if (yoil == "ȭ") {
							new SiteLink("https://www.youtube.com/watch?v=vPBBI28MkCU");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=zp1VS7fge34");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=BkUXGC03KvE");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=YsnAIM0vvO4");
						} else if (yoil == "��") {
							new SiteLink("https://www.youtube.com/watch?v=YdTyXyx9mMc");
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
		//5-1 �����
		JLabel lblNewLabel = new JLabel("\uC6B4\uB3D9 \uC885\uB958 \uC124\uBA85");
		lblNewLabel.setBounds(0, 10, 93, 15);
		manualPanel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\uBCA4\uCE58 \uD504\uB808\uC2A4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SiteLink("https://namu.wiki/w/��ġ%20������");
			}
		});
		btnNewButton_1.setBounds(0, 25, 132, 23);
		manualPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB525\uC2A4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%EB%94%A5%EC%8A%A4");
			}
		});
		btnNewButton_2.setBounds(138, 25, 124, 23);
		manualPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uBC00\uB9AC\uD130\uB9AC \uD504\uB808\uC2A4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%ED%94%84%EB%A0%88%EC%8A%A4");
			}
		});
		btnNewButton_3.setBounds(267, 107, 132, 23);
		manualPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uB370\uB4DC \uB9AC\uD504\uD2B8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%EB%8D%B0%EB%93%9C%EB%A6%AC%ED%94%84%ED%8A%B8");
			}
		});
		btnNewButton_4.setBounds(0, 52, 132, 23);
		manualPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uD131\uAC78\uC774");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%ED%84%B1%EA%B1%B8%EC%9D%B4");
			}
		});
		btnNewButton_5.setBounds(138, 52, 124, 23);
		manualPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\uBC14\uBCA8 \uB85C\uC6B0");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%EB%B0%94%EB%B2%A8%20%EB%A1%9C%EC%9A%B0");
			}
		});
		btnNewButton_6.setBounds(267, 52, 132, 23);
		manualPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\uC2A4\uCFFC\uD2B8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.mirror.wiki/w/%EC%8A%A4%EC%BF%BC%ED%8A%B8");
			}
		});
		btnNewButton_7.setBounds(0, 80, 132, 23);
		manualPanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("\uD30C\uC6CC\uB808\uADF8 \uD504\uB808\uC2A4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://zetawiki.com/wiki/%EB%A0%88%EA%B7%B8_%ED%94%84%EB%A0%88%EC%8A%A4");
			}
		});
		btnNewButton_8.setBounds(138, 80, 124, 23);
		manualPanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\uB808\uADF8 \uC775\uC2A4\uD150\uC158");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://blog.naver.com/PostView.nhn?blogId=ngeljin1&logNo=220578706591&parentCategoryNo=&categoryNo=14&viewDate=&isShowPopularPosts=false&from=section");
			}
		});
		btnNewButton_9.setBounds(267, 80, 132, 23);
		manualPanel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\uD478\uC26C\uC5C5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%ED%8C%94%EA%B5%BD%ED%98%80%ED%8E%B4%EA%B8%B0");
			}
		});
		btnNewButton_10.setBounds(267, 25, 132, 23);
		manualPanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\uC6D0\uC554 \uB364\uBCA8 \uB85C\uC6B0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://www.gwhey.com/m/board.html?code=proteinz_board13&page=1&type=v&num1=999858&num2=00000&number=143&lock=N");
			}
		});
		btnNewButton_11.setBounds(138, 107, 124, 23);
		manualPanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\uB808\uADF8 \uCEEC");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://blog.naver.com/PostView.nhn?blogId=andra12&logNo=220668852146");
			}
		});
		btnNewButton_12.setBounds(0, 107, 132, 23);
		manualPanel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\uBC14\uBCA8/\uB364\uBCA8 \uCEEC");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%EB%B0%94%EB%B2%A8%20%EC%BB%AC");
			}
		});
		btnNewButton_13.setBounds(0, 133, 132, 23);
		manualPanel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\uD2B8\uB77C\uC774\uC149 \uC775\uC2A4\uD150\uC158");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://www.msn.com/ko-kr/health/exercise/strength/%ED%8A%B8%EB%9D%BC%EC%9D%B4%EC%85%89%EC%8A%A4-%EC%9D%B5%EC%8A%A4%ED%85%90%EC%85%98-%EB%B0%94%EB%B2%A8-%EC%98%A4%EB%B2%84%ED%97%A4%EB%93%9C-%EC%95%89%EC%9D%80-%EC%9E%90%EC%84%B8/ss-BBtSSRB");
			}
		});
		btnNewButton_14.setBounds(138, 133, 124, 23);
		manualPanel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("\uB808\uD130\uB7F4 \uB808\uC774\uC988");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%EB%9E%98%ED%84%B0%EB%9F%B4%20%EB%A0%88%EC%9D%B4%EC%A6%88");
			}
		});
		btnNewButton_15.setBounds(267, 133, 132, 23);
		manualPanel.add(btnNewButton_15);
		
		JButton button = new JButton("\uD589\uC789 \uB808\uADF8\uB808\uC774\uC988");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://blog.naver.com/PostView.nhn?blogId=sudveie875&logNo=220736849117");
			}
		});
		button.setBounds(0, 160, 132, 23);
		manualPanel.add(button);
		
		JButton btnNewButton_16 = new JButton("\uD06C\uB7F0\uCE58");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%EC%9C%97%EB%AA%B8%20%EC%9D%BC%EC%9C%BC%ED%82%A4%EA%B8%B0");
			}
		});
		btnNewButton_16.setBounds(138, 160, 124, 23);
		manualPanel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("\uD50C\uB7AD\uD06C");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://namu.wiki/w/%ED%94%8C%EB%9E%AD%ED%81%AC");
			}
		});
		btnNewButton_17.setBounds(267, 160, 132, 23);
		manualPanel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("\uCE74\uD504 \uB808\uC774\uC988");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://ybyb.tistory.com/28");
			}
		});
		btnNewButton_18.setBounds(0, 187, 132, 23);
		manualPanel.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("\uBA38\uC2AC\uC5C5");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://knpark1227.tistory.com/23");
			}
		});
		btnNewButton_19.setBounds(138, 187, 124, 23);
		manualPanel.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("\uD50C\uB780\uCCB4");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("http://blog.naver.com/PostView.nhn?blogId=spm0808&logNo=40165104061&categoryNo=124&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1");
			}
		});
		btnNewButton_20.setBounds(267, 187, 132, 23);
		manualPanel.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("\uD504\uB860\uD2B8 \uB808\uBC84");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://m.blog.naver.com/PostView.nhn?blogId=spm0808&logNo=40165068186&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F");
			}
		});
		btnNewButton_21.setBounds(0, 213, 132, 23);
		manualPanel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("\uBC31 \uB808\uBC84");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://m.blog.naver.com/PostView.nhn?blogId=spm0808&logNo=40164989072&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F");
			}
		});
		btnNewButton_22.setBounds(138, 213, 124, 23);
		manualPanel.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("\uC5D8 \uC2EF");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SiteLink("https://m.blog.naver.com/PostView.nhn?blogId=spm0808&logNo=40164935067&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F");
			}
		});
		btnNewButton_23.setBounds(267, 213, 132, 23);
		manualPanel.add(btnNewButton_23);
	}
	
	public static void main(String[] ar) {
		new MyHealthTrainer();
	}
}
