
public class Main {

	public static void main(String[] args) {
		
		CreditUI creditUI = new CreditUI();
		creditUI.CalculateCredit(new TeacherCreditManager());
		creditUI.CalculateCredit(new AgricultureCreditManager());
		creditUI.CalculateCredit(new SoldierCreditManager());

	}
}
