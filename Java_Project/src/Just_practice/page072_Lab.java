package Just_practice;

public class page072_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 300000;
		double distance = 40e12;

		double sec;
		sec = distance / light_speed;

		double light_year = sec / (60 * 60 * 24 * 365);
		System.out.println("�ɸ��� �ð���" + light_year + "�����Դϴ�.");
	}

}
