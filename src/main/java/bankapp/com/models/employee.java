package bankapp.com.models;

public class employee extends users{
	
	//fields
		private String name;
		private String email;
		
		//constructors
		
		public employee(String user, String pass) {
			super(user, pass);
		}
		public employee(String user, String pass, String name, String email) {
			super(user, pass);
			this.setName(name);
			this.setEmail(email);
		}
		
		
		// getters and setters
		public String geName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
	
}
