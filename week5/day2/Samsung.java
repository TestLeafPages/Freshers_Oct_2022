package week5.day2;

public class Samsung implements AndroidDesign, SamsungDesign{

	@Override
	public void makeCall() {
		System.out.println("Make call");
		
	}

	@Override
	public void startMobile() {
		System.out.println("Start mobile");
		
	}

	@Override
	public void sendMessage() {
		System.out.println("Send Message");
		
	}
public static void main(String[] args) {
	Samsung samsung=new Samsung();
	samsung.makeCall();
	samsung.sendMessage();
	samsung.startMobile();
}

@Override
public void takePhoto() {
	System.out.println("Take photo");
	
}
public void samsungNote() {
	System.out.println("Samsung Design");
}

@Override
public void voiceRecongnization() {
	// TODO Auto-generated method stub
	
}

@Override
public void patternLock() {
	// TODO Auto-generated method stub
}


@Override
public void faceAuthendication() {
	// TODO Auto-generated method stub
	
}
	
	
}
