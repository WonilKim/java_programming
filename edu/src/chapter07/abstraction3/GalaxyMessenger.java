package chapter07.abstraction3;

public class GalaxyMessenger implements Messenger{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("키보드 아이콘 터치 후 키보드를 변경합니다.");
	}
	

}