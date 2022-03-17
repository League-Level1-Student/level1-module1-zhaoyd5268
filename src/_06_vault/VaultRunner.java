package _06_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	vault.tryCode(10001);
	secretAgent Agent = new secretAgent();
	System.out.println(Agent.findCode(vault));
}
}
