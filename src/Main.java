public class Main {

	public static void main(String[] args){
		
		ClientIDGenerator clientIDGen = new ClientIDGenerator();
		AccountNumberGenerator accountNumGen = new AccountNumberGenerator();
		//IBankingSystemController controller = controller.createInstance(clientIDGen, accountNumGen);
		
		IBankingSystemController controller = new BankingSystemController(clientIDGen, accountNumGen);	
		BankingSystemCommandLine commandLine = new BankingSystemCommandLine(controller);
		
		commandLine.commandLoop();
	

}
}
