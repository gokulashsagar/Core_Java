import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExpressions {
	
	public static void main(String[] args){
		List<String> abc = new ArrayList<>();
		 abc.add("1");
		 abc.add("2");
		 /* forEach() is similar to angular */ 
		 abc.forEach(n->{
			 System.out.println(n);
		 });
		 
		 Example e=null;
		 e=(int i)->{  
				 System.out.println(""+i);
		 };
		e.a(4);
		List<Integer> list  =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
//		List<Integer> a=list.stream()
//				.map(i->i*2)
//				.map(i->System.out.println(i))
//				.collect(Collectors.toList());
		List<Integer> a=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println("list::"+a);
	List<Integer> markList  =new ArrayList<>();
	for(int i=20;i<=50;i++){
		markList.add(i);
	}
	markList.stream().filter(i->i<35).collect(Collectors.toList())
	.stream().map(i->i+5).collect(Collectors.toList())
	.forEach(i->System.out.println("first"+i));	
	
	markList.stream().map(i->{

		if(i<35){
			i=i+5;
			System.out.println("second"+i);
		}
		
		return i;
	}
	).collect(Collectors.toList());
	
	/*Using optional*/
	/*The use of optional is that it can store null values and retrieve them without
	throwing null pointer exception */
	String sample="SAMPLE";
	String empty=null;
	
	Optional<String> opt1= Optional.of(sample);
	Optional<String> opt2= Optional.of(sample);
	/*here null pointer will not be thrown as they are guarded by optional*/
	if(opt1.get().equals("sample")){
		System.out.println("Optional1.get:::"+opt1.get());	
	}
	if(!opt2.get().equals("BCD")){
	System.out.println("Optional2.get:::"+opt2.get());
	System.out.println(empty);
	}
	/*here null pointer will be thrown*/
	if(empty.equals("BCD")){
		System.out.println("Optional2.get:::"+opt2.get());
		System.out.println(empty);
		}
	
	}
}
