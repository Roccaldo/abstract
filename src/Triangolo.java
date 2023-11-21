public class Triangolo extends Forma{

	@Override
	public void calcolaArea(int base, int altezza){
		int area = base * altezza / 2;
		System.out.println(area);
	}

}
