package std.com;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Util {
	public static Object getObj(Class clz) throws Exception {
		Object obj =  clz.newInstance();
		setAnnotation(obj);
		return obj;
	}
	
	public static Object setAnnotation(Object obj) throws Exception {
		
		Annotation[] arrAnno = obj.getClass().getAnnotations();
		Field[] fields = obj.getClass().getDeclaredFields();
		
		for (Annotation anno : arrAnno) {
			
			if ( !( anno instanceof DefaultMapping ) ) {
				continue;
			}
			
			DefaultMapping dm = (DefaultMapping) anno;
			
			Method[] mth = dm.getClass().getDeclaredMethods();
			
			for ( Method iMth : mth ) {
				
//				iMth.invoke("name", "name");
				
				for ( Field iField : fields ) {
					
					if ( iMth.getName().equals( iField.getName() ) ) {
						
						if ( iField.getName().equals( "name" ) ) {
							
							iField.setAccessible(true);
							iField.set(obj, dm.name());
							
						} else if ( iField.getName().equals( "age" ) ) {

							iField.setAccessible(true);
							iField.set(obj, dm.age());
							
						} else if ( iField.getName().equals( "value" ) ) {

							iField.setAccessible(true);
							iField.set(obj, dm.value());
							
						} else if ( iField.getName().equals( "newNames" ) ) {
							
							iField.setAccessible(true);
							iField.set(obj, dm.newNames());
							
						}
					
						
					}
					
				}
				
			}
			
		}
        
        return obj;
	}
	
	
}
