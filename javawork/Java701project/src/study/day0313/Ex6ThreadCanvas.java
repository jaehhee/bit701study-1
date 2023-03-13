package study.day0313;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex6ThreadCanvas  extends JFrame implements ActionListener{

	MyDraw draw=new MyDraw();
	JButton btnStart=new JButton("원그리기 시작");
	JButton btnStop=new JButton("원그리기 멈춤");
	boolean loop=false;//true일경우 원이 무한으로 그려지도록 할 예정
	Color drawColor=new Color(180, 190, 200);
	int xPos,yPos;
	
	public Ex6ThreadCanvas(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		
		//단순히 윈도우만 종료하고 싶을때는 메서드를 통해서 종료하면 된다
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컴포넌트 생성및 이벤트 설정하기 위한 메서드
		this.initDesign();
		
		//this.getContentPane().setBackground(new Color(200, 200, 200));
		this.setBounds(900, 100, 500, 500);//x,y,w,h
		this.setVisible(true);
	}
		
	
	private void initDesign() {
		// TODO Auto-generated method stub
		JPanel p=new JPanel();
		p.add(btnStart);
		p.add(btnStop);
		
		this.add("North",p);
		this.add("Center",draw);
		
		//버튼 이벤트
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);//this:actionPerformed 메서드를 구현한 클래스의 인스턴스를 보낸다
		
	}
	
	//Canvas 내부 클래스
	class MyDraw extends Canvas implements Runnable
	{		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//System.out.println("run");
			while(loop)
			{
				//랜덤 색상 구하기
				int r=(int)(Math.random()*256);//0~255
				int g=(int)(Math.random()*256);//0~255
				int b=(int)(Math.random()*256);//0~255
				
				drawColor=new Color(r, g, b);
				
				//랜덤하게 x좌표,y좌표도 구한다
				xPos=(int)(Math.random()*450);
				yPos=(int)(Math.random()*450);
				
				//캔바스의 paint 메소드 호출				
				this.paint(getGraphics());
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			//super.paint(g);
			
			if(loop) {
				g.setColor(drawColor);
				g.fillOval(xPos, yPos, 60, 60);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex6ThreadCanvas("Thread로 원그리기");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==btnStart) {
			//System.out.println("Start");
			loop=true;
		}else {
			//System.out.println("Stop");
			loop=false;
		}
		
		//Thread 의 run 메소드 호출
		//인터페이스 Runnable 을 구현했으므로 Thread 생성자에 MyDraw의 인스턴스를 보낸다
		Thread th=new Thread(draw);
		th.start();//run 메소드 호출
	}

}







