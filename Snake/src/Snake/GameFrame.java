package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class GameFrame extends JFrame {
	private final JLabel DELETE = new JLabel("X");


	/**
	 * Create the frame.
	 */
	public GameFrame() {
		setUndecorated(true);
		setResizable(false);
		GamePanel gamePanel = new GamePanel();
		getContentPane().add(gamePanel);
		gamePanel.setLayout(null);
		DELETE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					GameFrame.this.dispose();//dong cua so
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				DELETE.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				DELETE.setForeground(Color.WHITE);
			}
		});
		DELETE.setHorizontalAlignment(SwingConstants.CENTER);
		DELETE.setForeground(Color.WHITE);
		DELETE.setFont(new Font("Tahoma", Font.BOLD, 14));
		DELETE.setBounds(580, 0, 20, 20);
		gamePanel.add(DELETE);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
