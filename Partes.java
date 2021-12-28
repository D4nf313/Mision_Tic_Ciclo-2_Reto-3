package Reto3;

import java.util.ArrayList;

public class Partes {
	ArrayList<String> clases(ArrayList<String> e) {
		ArrayList<String> salida = new ArrayList<String>();
		for (String i : e) {
			if (!salida.contains(i)) {
				salida.add(i);

			}

		}
		return salida;
	}

	ArrayList<Integer> meFaltanDelaClase(ArrayList<Integer> faltantes, ArrayList<String> partes, String parte) {
		ArrayList<Integer> salida = new ArrayList<Integer>();

		for (int j : faltantes) {
			if (partes.get(j).equals(parte)) {
				salida.add(j);

			}

		}

		return salida;

	}

	ArrayList<String> noTengo(ArrayList<String> otroalmacen, ArrayList<String> mialmacen) {
		otroalmacen.removeAll(mialmacen);
		return otroalmacen;

	}

	Integer puedoCambiar(ArrayList<String> otroalmacen, ArrayList<String> mialmacen) {
		ArrayList<String> c=new	ArrayList(otroalmacen);
		int w = noTengo(otroalmacen, mialmacen).size();
		int v=noTengo(mialmacen,c).size();
		int r=Math.min(w, v);
		return r;


	}

}