package lesson.konwledge.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;


public class TestReflection {

	@Test
	public void  test3() throws Exception{
		Class clazz = Class.forName("lesson.konwledge.reflection.Person");
    	Object obj = clazz.newInstance();
    	Person p = (Person)obj;
        
    	//调用费public属性
    	Field f1 = clazz.getDeclaredField("age");
    	f1.setAccessible(true);
    	f1.set(p, 18);
    	
    	//调用public属性
    	Field f2 = clazz.getDeclaredField("name");
    	f2.set(p, "xxx");
    	
    	//调用static属性
    	Field f3 = clazz.getDeclaredField("des");
    	System.out.println(f3.get(null));
    	
    	//调用非public方法
    	Method m1 = clazz.getDeclaredMethod("setName",String.class);
    	m1.setAccessible(true);
    	m1.invoke(p, "xxx+");
    	System.out.println(p.getName());
    	
    	//调用public方法
    	Method m2 = clazz.getMethod("getName");
    	String str1 = (String)m2.invoke(p);
    	System.out.println(str1);
    	
    	//调用static方法
    	Method m3 = clazz.getMethod("getDes");
    	m3.setAccessible(true);
    	String str2 = (String)m3.invoke(p);
    	System.out.println(str2);
	}
	
    // @Test
    public void test1() throws Exception {
	Class clazz = Person.class;		
	Constructor cons = clazz.getDeclaredConstructor(int.class,String.class);
    cons.setAccessible(true);
    Person p = (Person)cons.newInstance(18,"xxx");
    }
	
    //@Test
    public void test2() throws Exception {
    	Class clazz = Class.forName("lesson.konwledge.reflection.Person");
    	Object obj = clazz.newInstance();
    	
    	Person p = (Person)obj;
    	System.out.println(p);
    }
	    


}
