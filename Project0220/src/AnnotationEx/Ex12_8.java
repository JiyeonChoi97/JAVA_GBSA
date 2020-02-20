package AnnotationEx;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate = @DateTime(yymmdd="160101", hhmmss = "235959"))
public class Ex12_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class<Ex12_8> cls = Ex12_8.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		
		System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("TestTools="+str);
		
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);

	}

}
