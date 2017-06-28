package General;
class GarbageCollector
{   
    public void finalize()
    {
        System.out.println("Garbage Collected");
    }
}

public class ExplicitGarbageCollection { 

   public static void main(String[] args)
   {
        GarbageCollector a1 = new GarbageCollector(); 
	   GarbageCollector a2 = new GarbageCollector(); 
       a1 = a2;
        System.gc(); //or call Runtime.getRuntime().gc();
 
       System.out.println("done");
   }
}