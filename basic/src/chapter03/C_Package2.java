package chapter03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class C_Package2 {
	public static void main(String[] args) {
//		Collection Framework: Java에서 데이터 구조에 대한 표준화된 기법을 제공
//		List: 데이터를 저장할 때 중복을 허용하고 순서가 존재하는 데이터 구조
//		Collection Framework에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정, 참조형 데이터 타입만 가능 

//		ArrayList 구현 클래스
//		인덱스를 이용한 작업을 수행할 때 유리
		List<Integer> list = new ArrayList<Integer>();
		
//		LinkedList 구현 클래스
//		데이터 추가, 삭제 작업을 할 때 유리
		List<Integer> list2 = new LinkedList<Integer>();
		
//		add(): List에 요소 추가
//		추가할 요소는 제너릭으로 지정한 데이터 타입의 요소
		
		list.add(10);
		System.out.println(list);
		
		list.add(20);
		System.out.println(list);
		
//		get(): List의 특정 인덱스 요소를 가져옴
//		List의 인덱스 범위를 초과하지 않도록 주의
//		기본형 데이터 타입의 변수로 리스트의 요소를 받을 땐 null이 올 수 있음을 주의
		int integer = list.get(0);
		System.out.println(integer);
		
//		set(): List의 특정 인덱스 요소를 변경
//		List의 인덱스 범위를 벗어난 인덱스를 지정할 수 없음
		list.set(1,-20);
		System.out.println(list.get(1));
		
//		remove(): List의 특정 인덱스 요소를 제거
		list.remove(0);
		System.out.println(list);
		
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("사과");
		fruitsList.add("바나나");
		fruitsList.add("카카오");
		
		fruitsList.remove("바나나");
		System.out.println(fruitsList);
		
//		size(): List의 크기를 반환
		System.out.println(list.size());
	
//		int[][] -> List<List<Integer>>
		
//		Set: 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않음
//		HashSet 구현 클래스: 검색이 빠름
		Set<String> set = new HashSet<String>();
//		TreeSet 구현 클래스: 요소를 정렬해서 추가
		Set<String> set2 = new TreeSet<String>();
		
//		add(): Set에 요소를 순서에 관계없이 추가, 동일한 요소가 있다면 추가하지 않음
		set.add("banana");
		set.add("apple");
		System.out.println(set);

//		contains(): Set에 특정 요소가 존재하는지 확인
		System.out.println(set.contains("banana"));	
		
//		remove(): Set에 특정 요소 제거
		set.remove("banana");
		System.out.println(set);
	
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(4);

		System.out.println(list);
		
		Set<Integer> set3 = new HashSet<>(list);
		System.out.println(set3);
		list = new ArrayList<Integer>(set3);
		System.out.println(list);

//		Set을 적절히 사용하면 list의 중복 제거 및 정렬을 손쉽게 사용할 수 있음

//		Map: key와 value가 한 쌍으로 이루어진 요소들의 집합
//		key는 중복 불가, value는 중복 가능
		
//		HashMap: 검색 속도가 빠름
//		TreeMap: 키 기준 정렬 저장
		Map<String, String> map = new HashMap<>();
		
//		put: Map에 key와 value의 쌍을 추가
//	 	만약 동일한 key가 존재한다면 원래 값을 덮어씌움
		map.put("Apple", "사과");
		map.put("Banana", "바나나");
		System.out.println(map);
		map.put("Banana", "버네이나");
		System.out.println(map);
		
//		containsKey(): Map에 특정 key가 존재하는지 확인
		System.out.println(map.containsKey("Apple")); 

//		get(): Map에 특정키를 가지는 요소를 반환
//		존재하지 않는 키로 조회하면 null반환
		System.out.println(map.getOrDefault("ㅁpple", "없음"));
		System.out.println(map.get("aa"));

//		remove():Map에서 특정 key를 가지고 key와 value의 쌍을 제거.
		System.out.println(map.remove("Apple"));
		System.out.println(map);
		
		class Human{
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "단군";
		human1.address = "고조선";
		human1.age = 50;
//		{name = "단군", address = "고조선", age = 50}
		
		Map<String, Object> human2 = new HashMap<>();
		human2.put("name", "단군");
		human2.put("address", "고조선");
		human2.put("age", "50");
		System.out.println(human2);
		
//		1. 문제점: 사용 혹은 추가 작업에 실수 발생 가능
		System.out.println(human2.get("name"));
//		2. 문제점: 타입의 안정성 문제 
		int age = (int) human2.get("age");
//		3. 문제점: value(데이터)의 무결성 보장이 안됨.
	}
}