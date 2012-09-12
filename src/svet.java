
public class svet {
 
 /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		svetofor s = new svetofor();
		char p='r';
		char n='y';
		//char p = (char)System.in.read();
	//	char n = (char)System.in.read();
		
		s.setPred(p);
		s.setNow(n);
		s.zamena();
		String cvet;
		n=s.getNow();
		if (n =='g')
		{
			cvet="green";
		}
		else
		{
			if (n=='r')	
				cvet="red";
			else cvet="yellow";
		}
		
		//System.in.
    System.out.println(cvet);
	}

}
