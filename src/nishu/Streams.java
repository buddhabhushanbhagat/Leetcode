package nishu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		set.add("bhuiuu");
		set.add("bhuis");
		

	
		
		set.forEach(name->{
			System.out.println(name);
		});
		
		HashMap<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1,"nikhil");
		namesMap.put(2,"aniket");
		namesMap.put(3,"shubham1");
		namesMap.put(4,"bhushan");
		System.out.println(namesMap);
		namesMap.put(3,"shubham2");
		
		System.out.println(namesMap);
		for(Map.Entry<Integer, String> mapEntry:namesMap.entrySet()) {
			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue());
		}
		namesMap.keySet().forEach(k->{
			System.out.println(k+":"+namesMap.get(k));
		});
		
		namesMap.entrySet().forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
		
		List<Integer> list1 = List.of(2, 3, 5, 7, 8, 9, 11, 13, 17, 19);
		List<Integer> list2 = List.of(2, 3, 5, 7, 8, 9, 11, 13, 17, 19);
		
		List<Integer> newList = list2.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println(list1);
		printWithoutStreams(list1);
		System.out.println("With streams");
		printWithStreams(list1);
		printWithStreamsGreterThan10(list1);
		
		String str[] = {"washim","Delhi","Patna","Dhule","Bhopal"};
	
	}

	private static void printWithoutStreams(List<Integer> list1) {
		// TODO Auto-generated method stub
		for(Integer number:list1) {
			if(number%2 == 0) 
				System.out.println(number);
		}
		
	}
	private static void printWithStreams(List<Integer> list1) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(e->e%2 == 0).collect(Collectors.toList());
		System.out.println(newList);
	}
	private static void printWithStreamsGreterThan10(List<Integer> list1) {
		// TODO Auto-generated method stub
		List<Integer> newList = list1.stream().filter(e->e>10).collect(Collectors.toList());
		System.out.println(newList);
	}
	
	
}
