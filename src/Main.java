public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		ContaCorrente cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		Transferencia transferencia = new Transferencia();

		transferencia.transferirPorConta(cc, 100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente maria = new Cliente();
		maria.setNome("Maria");
		ContaCorrente contaMaria = new ContaCorrente(maria);

		transferencia.cadastrarPix("maria@pix.com", contaMaria);
		transferencia.transferirPorPix(cc, 50, "maria@pix.com");

		cc.imprimirExtrato();
		contaMaria.imprimirExtrato();
	}
}