package _07_tv_show_episode_info;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TVShowEpisodeInfoRunner {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JTextField textfield = new JTextField(25);
		TVShowEpisodeInfoDisplayer t = new TVShowEpisodeInfoDisplayer(frame, panel, button, textfield);
	}
}
