package Tv;

public class MiTv implements AndroidTv{

	@Override
	public void switchOnTv() {
		// TODO Auto-generated method stub
		System.out.println("switchOnTv");
	}

	@Override
	public void switchOffTv() {
		// TODO Auto-generated method stub
		System.out.println("switchOffTv");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("increaseVolume");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("decreaseVolume");
	}
public static void main(String[] args) {
	MiTv obj=new MiTv();
	obj.decreaseVolume();
	obj.increaseVolume();
	obj.switchOffTv();
	obj.switchOnTv();
}
}
