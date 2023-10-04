package week3.day1.homeAssignment;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		
		MultipleLangauge obj = new Automation();
		obj.Selenium();
		obj.Java();
		obj.python();
		obj.ruby();
	
	}

	@Override
	public void python() {
		System.out.println("Learn python");
		
	}

	@Override
	public void ruby() {
		System.out.println("Learn ruby");
		
	}


	@Override
	public void Java() {
		
		System.out.println("Learn Java");
	}


	@Override
	public void Selenium() {
		System.out.println("Learn Selenium");
		
	}

}
