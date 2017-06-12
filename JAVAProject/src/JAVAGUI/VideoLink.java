package JAVAGUI;

import java.io.IOException;

public class VideoLink  {
	public VideoLink(String url){
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
