import javax.swing.JOptionPane;

public class CaixaDeDialogo {
	public static void main(String[] args) throws Exception {

		JOptionPane opcao = new JOptionPane();

		String nome = opcao.showInputDialog("Digite seu nome!");

		if (nome == null) {
			JOptionPane.showMessageDialog(null, "Cancelado!");
			return;
		} else if (nome.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum nome foi digitado!");
			return;
		} else if (!nome.matches("[a-zA-Z]+")) {
			JOptionPane.showMessageDialog(null, "Foram inseridos um ou mais caracteres inválidos!");
			return;
		}

		JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome + "!");

	}
}
