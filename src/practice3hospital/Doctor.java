package practice3hospital;

public class Doctor extends Data{

		private String name;
		private String lastname;
		private String title;
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
				

		public String getLastname() {
			return lastname;
		}
		
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		@Override
		public String toString() {
			return "Doctor [name=" + name + ", lastname=" + lastname + ", title=" + title + "]";
		}
		
		
		
		
		


	

}