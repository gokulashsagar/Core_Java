
public class StudentClassWithEqualsHashcode {

	int a;
	String b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			System.out.println("1");
			return true;
		}
		if (obj == null){
			System.out.println("2");
			return false;
		}
		if (getClass() != obj.getClass()){
			System.out.println("3");
			return false;
		}
		StudentClassWithEqualsHashcode other = (StudentClassWithEqualsHashcode) obj;
		if (a != other.a){
			System.out.println("4");
			return false;
		}
		if (b == null) {
			System.out.println("5");
			if (other.b != null){
				System.out.println("6");
				return false;
			}			
		} else if (!b.equals(other.b)){
			System.out.println("7");
			return false;
		}
		return true;
	}
	
	
}
