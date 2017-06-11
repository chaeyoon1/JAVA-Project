package JAVAGUI;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageLoad extends JFrame {
	//�̹��� 
	BufferedImage bufferedImage = null;

	public ImageLoad(String filename) {
		//bufferedImage ����
		File file = new File(filename);
		try {
			bufferedImage = ImageIO.read(file);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "NO IMAGE!");
		}
		//������� �̹����� �ǻ������ ����
		setSize(bufferedImage.getWidth(),bufferedImage.getHeight());
		setVisible(true);
	}

		public void paint(Graphics g) {
		//�̹��� �׸���
		if (this.bufferedImage != null)
			g.drawImage(this.bufferedImage, 0, 0, this);
	}
}
