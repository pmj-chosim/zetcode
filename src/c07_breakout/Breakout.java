import c03_sprites.c02_missile.Board;
import javax.swing.JFrame;

public class Breakout extends JFrame {
	public Breakout() {
		add(new Board());
		setTitle("Breakout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(Commons.WIDTH, Commons.HEIGHT);
		setLocationRelativeTo(null);
		setIgnoreRepaint(true);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Breakout();
	}
}