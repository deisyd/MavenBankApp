package bankapp.com.models;

public class customer extends users{
		//fields
		private String firstName;
		private String lastName;
		private String socialnum;
		private String email;
		private String phonenum;
		private double balance; 
			
		
		//constructors
		public customer(String user, String pass, String first, String last) {
			super(user, pass);
			this.setFirstName(first);
			this.setLastName(last);
		}
		public customer(String user, String pass, String first, String last, String social, String email, String phone, double funds) {
			super(user, pass);
			this.setFirstName(first);
			this.setLastName(last);
			this.setSocial(social);
			this.setEmail(email);
			this.setPhone(phone);
			this.setBalance(funds);
		}
		
		// getters and setters
		public String getFirstName() {
			return firstName;
		}
		public String getFullName() {
			return firstName + " " + lastName;
		}
		public String getEmail() {
			return email;
		}
		public double getBalance() {
			return balance;
		}
		
		public void setFirstName(String first) {
			this.firstName = first;
		}
		
		public void setLastName(String last) {
			this.lastName = last;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		public void setSocial(String social) {
			this.socialnum = social;
		}
		public void setPhone(String num) {
			this.phonenum = num;
		}
		public void setBalance(double money) {
			this.balance = money;
		}
}
