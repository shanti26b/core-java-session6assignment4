package Demo;
//here we are showing that unreferenced object are collected by garbage collector
public class GarbageCollector {
	 
		 public void finalize(){
			 System.out.println("object is garbage collected");//we are printing that object is garbage collected
			 }  
		 public static void main(String args[]){ 
			 //we creating  the two objects by using the class to referred by s1 and s2 is garbage collector
			 GarbageCollector  s1=new GarbageCollector();  
			 GarbageCollector s2=new GarbageCollector();  
			 
		  s1=null;  
		  s2=null;  
		  System.gc(); }
		}  


