package goldPoint;

//定义一个Person类，用于游戏玩家
public class Person {
	
	private String name;    //姓名
	private int num;    //游戏数字
	private int score;    //成绩
	
	 public Person() {
		// TODO Auto-generated constructor stub
		 super();    
	}
	 
	public Person(String tname,int tnum,int tscore) {
		// TODO Auto-generated constructor stub
		super();
		name=tname;
		num=tnum;
		score=tscore;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
