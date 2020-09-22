package practice;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class BinggoGame3 {
//	UI설정
	static JPanel rightPanel;
	static JPanel leftPanel;
	static JPanel northPanel;
	static JPanel northCenterPanel;
	static JLabel leftLabel;
	static JLabel rightLabel;

	static JPanel centerPanel;
	static JButton buttons[][] = new JButton[10][10];// UI설정
	static int map[][] = new int[10][10]; // 데이타 설정 0 초기값, 1~8 폭탄수, 9폭탄설치-가려진상태, 10폭탄-체크(깃발꼽은상태)
	static JButton centerBt;

	static int flagCount = 10;
//	타이머 설정
	static Timer timer;
	static int gameTime = 0;

//	랜덤 값 설정
	static int mineCnt = 10;
	static int ROW = 10;
	static int COL = 10;
//	private static int N=0;
	static int boomb = 10;

	static class MyFrame2 extends JFrame implements ActionListener {

		public MyFrame2(String title) {
			super(title);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new BorderLayout());
			this.setSize(500, 600);
			init(this);
			mixImg();
			startTimer();
//			pack();
		}

		// 버튼 클릭
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			int btn_index = getButton(btn);

			if (btn_index == 9) {
				// 폭탄 터짐
				centerBt.setIcon(changeImage2("sad.png"));
				rightLabel.setText("Bomb!!");
				noSetting();
			} else {
				// 폭탄 아님 - 안전영역

				// 숫자를 표시한다.
				// buttons[i][j].setText("");
				// }

			}

			// successCount++;
			// rightLabel.setText(""+successCount);

		}

//폭탄 터질시 화면 사용금지
		static void noSetting() { // 폭탄 터지면 버튼 클릭 금지
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					buttons[i][j].setEnabled(false);
				}
			}

		}

	}

// 타이머 설정
	static void startTimer() {
		timer = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				gameTime++;
				//System.out.println("gameTime:" + gameTime);
				leftLabel.setText("" + gameTime);

			}

		});

		timer.start();
	}

//	UI구현
	static void init(MyFrame2 myFrame2) {
		northPanel = new JPanel();

		northPanel.setLayout(new BorderLayout());

		northPanel.setPreferredSize(new Dimension(500, 50));
		northPanel.setBackground(Color.lightGray);

		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(70, 40));
		leftPanel.setBackground(Color.black);

		leftLabel = new JLabel("0");
		leftLabel.setVerticalAlignment(SwingConstants.CENTER);
//		leftLabel.setHorizontalAlignment(JLabel.CENTER);  가운데 정렬
		leftLabel.setFont(new Font("Verdana", Font.BOLD, 25));
		leftLabel.setForeground(Color.red);
		leftPanel.add(leftLabel);

		northCenterPanel = new JPanel();
		northCenterPanel.setPreferredSize(new Dimension(50, 40));

		centerBt = new JButton();
		centerBt.setIcon(changeImage2("smile.png"));
		centerBt.setPreferredSize(new Dimension(50, 40));
		northCenterPanel.add(centerBt);

		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(70, 40));
		rightPanel.setBackground(Color.black);
		rightLabel = new JLabel("0");
		rightPanel.add(rightLabel);
		rightLabel.setFont(new Font("Verdana", Font.BOLD, 25));
		rightLabel.setForeground(Color.red);

//	 	양 사이드 정렬
		northPanel.add("West", leftPanel);
		northPanel.add("Center", northCenterPanel);
		northPanel.add("East", rightPanel);

		myFrame2.add("North", northPanel);

		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(10, 10));
		centerPanel.setPreferredSize(new Dimension(500, 500));
		centerPanel.setBackground(Color.lightGray);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setBackground(Color.LIGHT_GRAY);
				buttons[i][j].addActionListener(myFrame2);
				buttons[i][j].setIcon(null);
				buttons[i][j].addMouseListener(new MouseListener());
				centerPanel.setPreferredSize(new Dimension(50, 50));
				centerPanel.add(buttons[i][j]);
			}
		}
		myFrame2.add("Center", centerPanel);

		for (int i = 0; i < 10; i++) {// map 데이타 설정
			for (int j = 0; j < 10; j++) {
				map[i][j] = 0; // 0 초기값, 1 폭탄있음
			}
		}
	}

// 버튼을 눌렀을때  map의 데이타와  비교
	public static int getButton(JButton btn) {
		int index = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (buttons[i][j] == btn) {
					index = map[i][j];
				}
			}
		}
		return index;
	}

//10개의 랜덤 폭탄 배치
	static void mixImg() {
		Random rand = new Random();

		while (mineCnt-- > 0) {
			int row = rand.nextInt(10);
			int col = rand.nextInt(10);

			if (map[row][col] == 9) {
				mineCnt++;
			} else {
				map[row][col] = 9;
			}
		}

		for (int i = 0; i < map.length; i++) {// 폭탄이 보이게 설정
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 9) {
					// 폭탄 표시
					ImageIcon icon = changeImage("boom.png");
					buttons[i][j].setIcon(icon);
				}
			}
		}
	}

	static class MouseListener extends MouseAdapter {
		// 마우스로 클릭 했을때

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		// 마우스 클릭시
		@Override
		public void mouseClicked(MouseEvent e) { // 마우스를 클릭했을때 일어나는 현상 1.폭탄 위치 확인 2.깃발 설정
			// 왼쪽 버튼 1 , 오른쪽 버튼 3
			JButton btn = (JButton) e.getSource();

			
			
			if (e.getButton() == MouseEvent.BUTTON1) {
//					successCount++;
//					rightLabel.setText(""+successCount);
				int x = getButtonIndexX(btn); // 왼쪽
				int y = getButtonIndexY(btn);
				System.out.println(x + ":" + y);
				System.out.println(map[x][y]);
				findMind(x, y);
	
					if(map[x][y]==10){  
					buttons[x][y].repaint();
					map[x][y]=11;//깃발이아닐때
					//buttons[x][y].setText("" + map[x][y]);
				} else {
					
				}
				

			  
			}

			if (flagCount >= 0) {

				if (e.getButton() == MouseEvent.BUTTON3) {
					if (e.getClickCount() == 1) {
						for (int i = 0; i < buttons.length; i++) {
							for (int j = 0; j < buttons[i].length; j++) {
								if (buttons[i][j].equals(btn)) {
									ROW = i;
									COL = j;
									
							
									}
								}
							}
						//11이 깃발일때
					    if (map[ROW][COL] != 10) {//데이타가 깃발이 아닐경우
		                    buttons[ROW][COL].setIcon(changeImage2("flag.png"));
		            		buttons[ROW][COL].setText(null);
							rightLabel.setText("" + flagCount);
							flagCount--;
							 map[ROW][COL] = 10;
		                  }
					 
						
					}
				}

			} 

		}

	}   

//		buttons[0].setText("3");
//		buttons[1].setText("3");
//		buttons[2].setText("3");

//	x축의 버튼 10개
	static int getButtonIndexX(JButton btn) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (buttons[i][j] == btn)
					return i;
			}
		}
		return 0;
	}

//	y축의 버튼 10개
	static int getButtonIndexY(JButton btn) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (buttons[i][j] == btn)
					return j;
			}
		}
		return 0;
	}

	public static void findMind(int x, int y) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
//				전셀을 돌면서, 폭탄 갯수를 찾아서 map에 설정.
				int mineCount = getMineCount(i, j);
				if (mineCount != -1) { // 현재자리가 폭탄이 아니면
					map[i][j] = mineCount;

				}
			}
		}
	}

	public static int getMineCount(int i, int j) {
		int mineCount = 0;

		if (map[i][j] == 9) { // 이자리가 폭탄임
			return -1; // 1,2,3,4,5,6,7,8
		}

		if (i - 1 >= 0 && j - 1 >= 0) { // 경계선 체크(박스 밖)
			if (map[i - 1][j - 1] == 9)// 08
				mineCount++; // 폭탄 1개
		}
		if (i - 1 >= 0) {
			if (map[i - 1][j] == 9)
				mineCount++;
		}
		if (i - 1 >= 0 && j + 1 <= 9) {
			if (map[i - 1][j + 1] == 9)
				mineCount++;
		}
		if (j - 1 >= 0) {
			if (map[i][j - 1] == 9)
				mineCount++;
		}
		if (j + 1 <= 9) {
			if (map[i][j + 1] == 9)
				mineCount++;
		}
		if (i + 1 <= 9 && j - 1 >= 0) {
			if (map[i + 1][j - 1] == 9)
				mineCount++;
		}
		if (i + 1 <= 9) {
			if (map[i + 1][j] == 9)
				mineCount++;
		}
		if (i + 1 <= 9 && j + 1 <= 9) {
			if (map[i + 1][j + 1] == 9)
				mineCount++;
		}

		return mineCount;
	}

//static boolean findMind1(int x, int y){
//		
//		if(x<0 || y<0 || x>=N || y>=N) { //박스 밖의 셀일 때
//			return false; 
//		}
//		else if(map[x][y]==9) { //이 자리가 마인임.
//			return false;
//		}
//		else if(map[x][y] > 0) { //주변에 마인이 있는 숫자map
//			System.out.println("x:"+x +",y:"+y);
//			buttons[x][y].setText(String.valueOf(map[x][y]));
//			return false;
//		}
//		else{ //0 셀
//			buttons[x][y].setText(String.valueOf(map[x][y]));
//			map[x][y] = 10;//0->10으로 방문함.
//			if( findMind1(x-1,y) || 
//				findMind1(x,y+1) || 
//				findMind1(x+1, y) || 
//				findMind1(x, y-1) ||
//				
//				findMind1(x-1, y-1) ||
//				findMind1(x+1, y-1) ||
//				findMind1(x-1, y+1) ||
//				findMind1(x+1, y+1)
//			)
//			{ 
//				return true; 
//			} 
//			//더이상 0을 못찾음. 마지막으로 확장한 셀.
//			buttons[x][y].setText(String.valueOf(map[x][y]));
//			return false; 
//		} 
//		
//	} 

//	스마일 이미지
	static ImageIcon changeImage(String Filename) {
		ImageIcon icon = new ImageIcon("./img/" + Filename);
		Image orignImage = icon.getImage();
		Image changeImage = orignImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changeImage);

		return icon_new;
	}

// 랜덤이미지
	static ImageIcon changeImage2(String Filename) {
		ImageIcon icon = new ImageIcon("./img/" + Filename);
		Image orignImage = icon.getImage();
		Image changeImage = orignImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changeImage);
		icon_new.setDescription("flag.png");
		return icon_new;
	}

	public static void main(String[] args) {
		new MyFrame2("지뢰 찾기");

	}

}
