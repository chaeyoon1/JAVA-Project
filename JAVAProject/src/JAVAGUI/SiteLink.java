package JAVAGUI;

import java.io.IOException;
//인터넷 링크를 거는 클래스와 생성자

public class SiteLink  {
	public SiteLink(String url){
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
