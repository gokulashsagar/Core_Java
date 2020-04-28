import java.util.HashSet;

public class equalsHashcode {

	public static void main(String args[]){
		
		StudentClass obj1 = new StudentClass();
		StudentClass obj2 = new StudentClass();
		obj1.setA(1);
		obj1.setB("a");
		obj2.setA(1);
		obj2.setB("a");
		HashSet<StudentClass> hs = new HashSet<>();
		hs.add(obj1);
		hs.add(obj2);
		System.out.println("...."+hs);
		System.out.println("hashCode1:"+obj1.hashCode()+"\n"+"hashCode2:"+obj2.hashCode());
		System.out.println("Note: The above two objects are same."+"\n"
				+ "But hashset is not supposed to add duplicates right?"+"\n"
				+ "This is because HashSet/Hashmap uses equals method to compare the objects being added"+"\n"
				+ "and also for every object added, a unique hashcode is generated. "+"\n"
				+ "To have them customized, we need to override them."+"\n"
				);
		String x="abcdef";
		String y="abcdef";
		System.out.println(x.hashCode()+";"+y.hashCode());
		System.out.println(obj1.equals(obj2));
		StudentClassWithEqualsHashcode obj11 = new StudentClassWithEqualsHashcode();
		StudentClassWithEqualsHashcode obj22 = new StudentClassWithEqualsHashcode();
		obj11.setA(1);
		obj11.setB("a");
		obj22.setA(1);
		obj22.setB("a");
		System.out.println(obj11.equals(obj22));
		System.out.println(obj11.hashCode()+":"+obj22.hashCode());
	}
}
