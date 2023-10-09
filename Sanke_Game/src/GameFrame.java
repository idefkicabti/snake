import javax.swing.JFrame;

public class GameFrame extends JFrame{

	private static final long serialVersionUID = 3868855034012153296L;

	GameFrame(){		
		
		this.add(new GamePanel());
		this.setTitle("Sanke");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
