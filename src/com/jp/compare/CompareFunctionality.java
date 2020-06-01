package com.jp.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareFunctionality {
	
	public static void main(String[] args) {
		

		Study s1 = new Study(1, "MayoStudy", "Desc1");
		Study s2 = new Study(3, "AMayoStudy3", "Desc2");
		Study s3 = new Study(5, "ZayoStudy5", "Desc5");
		Study s4 = new Study(8, "CayoStudy8", "Desc8");
		
		List<Study> studyList = new ArrayList<Study>();
		studyList.add(s4);
		studyList.add(s1);
		studyList.add(s2);
		studyList.add(s3);
		
		
		Collections.sort(studyList);
		
		studyList.forEach(stdy -> System.out.println(stdy.toString()));
		
	}

}
