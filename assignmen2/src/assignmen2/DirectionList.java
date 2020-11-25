package assignmen2;
public class DirectionList 
	{
	  public int in=-1;
	  private Direction[] direction;
public DirectionList()
	{
	   direction = new Direction[8];
	}
public void addDirection(Direction d)
	{
	in++;
	if(in<=7)
	  {
	   direction[in]=d;
	  }
	}
public int length()
	 {
	   return in;
	 }
public Direction getDirection(int i)
	{
	   return direction[i];
	}
public String toString(){
	     	String result ="";
	     if(in>=0&&in<=7)
	     {
	    	 result="{";
	    	 for(int i=0;i<in;i++)
	    	 {
	    		 result+=direction[i].toString()+",";
	    	 }
	     }
	     if(in>-1)
	    	 result+=direction[in].toString()+"}";
	     return result;
	   }
public static DirectionList allDirections()
		{
	    return new DirectionList();
		}
}

