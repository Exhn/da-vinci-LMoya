import javax.swing.*;

public class Final_moya {

	public static void main(String[] args) {
		String [] mano_pc = new String[5];
		String [] mano_npc = new String[5];
		int [] mano_poder = new int[5];
		int [] mano_poder_op = new int[5];
		int [] mano_res = new int[5];
		int [] mano_res_op = new int[5];
		String [] mano_img = new String[5];
		String [] mano_img_op = new String[5];
		String [] mazo_crit = new String[15];
		int [] mazo_poder = new int[15];
		int [] mazo_res = new int[15];
		String [] mazo_img = new String[15];
		int n1, n2, n_pc, n_npc, carta, cartaop;
		String jugador;
		boolean usado, jugado;

		/*
		jugador = JOptionPane.showInputDialog(null,"Bienvenido al juego.\n"
				+ "Ingrese su nombre: ");
		*/
		// Cartas con nombre de criaturas
		mazo_crit[0] = "Aboroth";
		mazo_crit[1] = "Whiptail Wurm";
		mazo_crit[2] = "Alpha Tyrranax";
		mazo_crit[3] = "Axebane Stag";
		mazo_crit[4] = "Enormous Baloth";
		mazo_crit[5] = "Elvish Ranger";
		mazo_crit[6] = "Rotted Hystrix";
		mazo_crit[7] = "Panther Warriors";
		mazo_crit[8] = "Gnarled Mass";
		mazo_crit[9] = "Ferocious Zheng";
		mazo_crit[10] = "Elvish Warrior";
		mazo_crit[11] = "Adaptive Snapjaw";
		mazo_crit[12] = "Hollowhenge Beast";
		mazo_crit[13] = "Kindercatch";
		mazo_crit[14] = "Pheres-Band Centaurs";

		// Cartas con el poder de las criaturas
		mazo_poder[0] = 9;
		mazo_poder[1] = 8;
		mazo_poder[2] = 6;
		mazo_poder[3] = 6;
		mazo_poder[4] = 7;
		mazo_poder[5] = 4;
		mazo_poder[6] = 3;
		mazo_poder[7] = 6;
		mazo_poder[8] = 3;
		mazo_poder[9] = 4;
		mazo_poder[10] = 2;
		mazo_poder[11] = 6;
		mazo_poder[12] = 5;
		mazo_poder[13] = 6;
		mazo_poder[14] = 3;

		// Cartas con la resistencia de las criaturas
		mazo_res[0] = 9;
		mazo_res[1] = 5;
		mazo_res[2] = 5;
		mazo_res[3] = 7;
		mazo_res[4] = 7;
		mazo_res[5] = 1;
		mazo_res[6] = 6;
		mazo_res[7] = 3;
		mazo_res[8] = 3;
		mazo_res[9] = 4;
		mazo_res[10] = 3;
		mazo_res[11] = 2;
		mazo_res[12] = 5;
		mazo_res[13] = 6;
		mazo_res[14] = 7;

		// Cartas con imagenes de criaturas
		mazo_img[0] = "/img/wth-117-aboroth.jpg";
		mazo_img[1] = "/img/me4-173-whiptail-wurm.jpg";
		mazo_img[2] = "/img/som-109-alpha-tyrranax.jpg";
		mazo_img[3] = "/img/rtr-116-axebane-stag.jpg";
		mazo_img[4] = "/img/m10-180-enormous-baloth.jpg";
		mazo_img[5] = "/img/me2-158-elvish-ranger.jpg";
		mazo_img[6] = "/img/nph-120-rotted-hystrix.jpg";
		mazo_img[7] = "/img/6ed-243-panther-warriors.jpg";
		mazo_img[8] = "/img/bok-127-gnarled-mass.jpg";
		mazo_img[9] = "/img/gs1-28-ferocious-zheng.jpg";
		mazo_img[10] = "/img/evg-5-elvish-warrior.jpg";
		mazo_img[11] = "/img/gtc-113-adaptive-snapjaw.jpg";
		mazo_img[12] = "/img/dka-118-hollowhenge-beast.jpg";
		mazo_img[13] = "/img/isd-190-kindercatch.jpg";
		mazo_img[14] = "/img/ths-171-pheres-band-centaurs.jpg";

		// Repartir mano de jugador sin repetidas
		for (int i = 0; i<mano_pc.length; i++) {
			n1=(int)(Math.random()*14);
			usado = false;
			for (int j=0; j<mano_pc.length; j++) {
				if (mazo_crit[n1].equalsIgnoreCase(mano_pc[j])) {
					usado = true;
				}
			}
			if (usado==false) {
				mano_pc[i] = mazo_crit[n1];
				mano_poder[i] = mazo_poder[n1];
				mano_res[i] = mazo_res[n1];
				mano_img[i] = mazo_img[n1];
			} else {
				i = i-1;
			}
		};

		// Repartir mano de oponente sin repetidas
		for (int i = 0; i<mano_npc.length; i++) {
			n2=(int)(Math.random()*14);
			usado = false;
			for (int j=0; j<mano_npc.length; j++) {
				if (mazo_crit[n2].equalsIgnoreCase(mano_npc[j])) {
					usado = true;
				}
			}
			if (usado==false) {
				mano_npc[i] = mazo_crit[n2];
				mano_poder_op[i] = mazo_poder[n2];
				mano_res_op[i] = mazo_res[n2];
				mano_img_op[i] = mazo_img[n2];
			} else {
				i = i-1;
			}
		};

		// Iniciamos el contador de puntos
		n_pc = 0;
		n_npc = 0;

		// Empieza el juego
		for (int i=0; i<5; i++) {
			carta=Integer.parseInt(JOptionPane.showInputDialog("Usa una carta de tu mano: \n"
					+ "1. " + mano_pc[0] + " " + mano_poder[0]+"/"+mano_res[0] + "\n"
					+ "2. " + mano_pc[1] + " " + mano_poder[1]+"/"+mano_res[1] + "\n"
					+ "3. " + mano_pc[2] + " " + mano_poder[2]+"/"+mano_res[2] + "\n"
					+ "4. " + mano_pc[3] + " " + mano_poder[3]+"/"+mano_res[3] + "\n"
					+ "5. " + mano_pc[4] + " " + mano_poder[4]+"/"+mano_res[4] + "\n"));
			cartaop = (int)(Math.random()*5);
			JOptionPane.showMessageDialog(
					null,
					"Tu carta es: \n"
							+ mano_pc[carta-1] + " " + mano_poder[carta-1]+"/"+mano_res[carta-1] + "\n",
					"Carta Jugador", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Final_moya.class.getResource(mano_img[carta-1])));

			JOptionPane.showMessageDialog(
					null,
					"La carta del opopnente es: \n"
							+ mano_npc[cartaop] + " " + mano_poder_op[cartaop]+"/"+mano_res_op[cartaop],
					"Carta opponente", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Final_moya.class.getResource(mano_img_op[cartaop])));
			if (mano_poder[carta-1] >= mano_res_op[cartaop] && mano_res[carta-1] > mano_poder_op[cartaop]) {
				n_pc++;
				JOptionPane.showMessageDialog(null, "Tu criatura mata a la otra. Puntos: " + n_pc);
			} else if (mano_poder_op[cartaop] >= mano_res[carta-1] && mano_res_op[cartaop] > mano_poder[carta-1]) {
				n_npc++;
				JOptionPane.showMessageDialog(null, "Tu criatura muere. Puntos: " + n_pc);
			} else {
				JOptionPane.showMessageDialog(null, "Empatan las criaturas. Puntos: " + n_pc);
			}
		}

		// Avisa quien gana dependiendo de los puntos de c/u
		if (n_pc > n_npc) {
			JOptionPane.showMessageDialog(null, "Ganaste como un campeon. Puntos: " + n_pc);
		} else if (n_npc > n_pc) {
			JOptionPane.showMessageDialog(null, "Perdiste como un campeon. Puntos: " + n_pc);
		} else {
			JOptionPane.showMessageDialog(null, "Empate... Puntos: " + n_pc);
		}
	}
}
