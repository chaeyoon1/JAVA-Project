package JAVAGUI;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageLoad extends JFrame {
	//이미지 
	BufferedImage bufferedImage = null;

	public ImageLoad(String filename) {
		//bufferedImage 생성
		File file = new File(filename);
		try {
			bufferedImage = ImageIO.read(file);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "NO IMAGE!");
		}
		//사이즈는 이미지의 실사이즈와 동일
		setSize(bufferedImage.getWidth(),bufferedImage.getHeight());
		setVisible(true);
	}

		public void paint(Graphics g) {
		//이미지 그리기
		if (this.bufferedImage != null)
			g.drawImage(this.bufferedImage, 0, 0, this);
	}
}
