package JAVAGUI;

import java.io.IOException;
//���ͳ� ��ũ�� �Ŵ� Ŭ������ ������

public class SiteLink  {
	public SiteLink(String url){
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
