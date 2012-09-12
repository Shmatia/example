
public class svetofor {
	private char pred;
	 private char now;
	 public svetofor()
	 {
		 pred='g';
		now='y';
	 }
	 public void setPred(char pred)
	 {
		 this.pred=pred;
	 }
	 public void setNow(char now)
	 {
		 this.now=now;
	 }
	 public char  getPred()
	 {
		return pred; 
	 }
	 public char getNow()
	 {
	  return now;
	 }
	 public void zamena()
	 {
		 if ((now == 'r') || (now == 'g'))
		 {
			 pred=now;
			 now='y';
		 }
		 else
		 {
			 if (pred == 'r')
			 {
				 now='g';
			 }
			 else now='r';
			 pred='y';
		 }
	 }
}
