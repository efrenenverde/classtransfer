package BolArr2;

import java.util.ArrayList;

//30. Código para comprobar si en un array de enteros no hay 0 ni -1.    
public class BolArr2_30 {
	
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		do
			arr.add((int) (Math.random() * 5)-2);
		while (arr.size() < 10);

		int zero = 0, m_one = 0;

		System.out.println("Original: " + arr.toString());

		for (int i = arr.size() - 1; i > -1; i--) {
			if (arr.get(i) == 0)
				zero++;
			else if (arr.get(i) == -1)
				m_one++;
		}
		
		if (zero==0)
			System.out.println("There are no zeros in this ArrayList");
		else System.out.println("There are "+zero+" zeros in this ArrayList");
		
		if (m_one==0)
			System.out.println("There are no negative ones in this ArrayList");
		else System.out.println("There are "+m_one+" negative ones in this ArrayList");
	}

}
