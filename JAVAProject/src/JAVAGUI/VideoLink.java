package JAVAGUI;

import java.io.IOException;
//영상 링크를 거는 클래스와 생성자

public class VideoLink  {
	public VideoLink(String url){
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
