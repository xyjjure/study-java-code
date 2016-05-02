import java.awt.*;
public class MyFrame {

	public static void main(String[] args) {
		new FramePanel ("hello",700,800);

	}

}
class FramePanel extends Frame {
	private Panel p;
	FramePanel(String s,int h,int w){
		super(s);
		setLayout(null);
		p=new Panel(null);
		setBounds(0,0,w,h);
		setBackground(Color.black);
		p.setBounds(w/4, h/4, w/2, h/2);
		p.setBackground(Color.green);
		add(p);
		setVisible(true);
		
	}
}