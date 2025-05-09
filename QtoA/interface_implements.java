interface playable{
	void play();
}

class guitar implements playable{

	@Override
	public void play() {
		System.out.println("playing a guitar");
		
	}
	
	
}

class piano implements playable{

	@Override
	public void play() {
		System.out.println("playing a piano");
		
	}
	
}

public class interface_implements {
    public static void main(String[] args) {
        guitar g1= new guitar();
		g1.play();
		piano p1 = new piano();
		p1.play();
    }
    
}
