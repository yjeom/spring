import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main (String[]args){
//		BeanFactory factory=new BeanFactory();
		
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
	
		TV tv1=(TV) factory.getBean("tv");
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		//scope- singleton
		TV tv2=(TV) factory.getBean("tv");
		TV tv3=(TV) factory.getBean("tv");
		factory.close();
}

}