import javax.swing.JOptionPane;

public class Final_moya {

	public static void main(String[] args) {
		String [] mano_pc = new String[5];
		String [] mano_npc = new String[5];
		String [] mazo_pc = new String[15];
		// String [] mazo_npc = new String[15];
		int puntos, n1, n_pc, n_npc;
		String jugador;
		/*
		jugador = JOptionPane.showInputDialog(null,"Bienvenido al juego.\n"
				+ "Ingrese su nombre: ");
		*/
		mazo_pc[0] = "9/9";
		mazo_pc[1] = "8/5";
		mazo_pc[2] = "6/5";
		mazo_pc[3] = "6/7";
		mazo_pc[4] = "7/7";
		mazo_pc[5] = "4/1";
		mazo_pc[6] = "3/6";
		mazo_pc[7] = "6/3";
		mazo_pc[8] = "3/3";
		mazo_pc[9] = "4/4";
		mazo_pc[10] = "2/3";
		mazo_pc[11] = "6/2";
		mazo_pc[12] = "5/5";
		mazo_pc[13] = "6/6";
		mazo_pc[14] = "3/7";

		for (int i = 0; i<mano_pc.length; i++) {
			n1=(int)(Math.random()*14);
			mano_pc[i] = mazo_pc[n1];
			System.out.println("Numero random elegido: " + n1);

		};
		for (int i = 0; i<mano_pc.length; i++) {
			System.out.println(mano_pc[i]);
		};


	}

}