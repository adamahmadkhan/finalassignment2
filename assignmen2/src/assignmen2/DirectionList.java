package assignmen2;
public class DirectionList 
	{
	  private Direction[] direction;
	  int index=-1;
	  public DirectionList(){
	  direction = new Direction[8];
	}
	  
public void addDirection(Direction d)
	{
	  index++;
	  if(index<=7)
	     {
	       direction[index]=d;
	     }
	 }
public int length()
	 {
	    return index;
	 }
public Direction getDirection(int i)
	{
	   return direction[i];
	}
public String toString(){
	     String result ="";
	     if(index>=0&&index<=7){
	     result="{";
	     for(int i=0;i<index;i++)
	     {
	       result+=direction[i].toString()+",";
	     }
	     }
	     if(index>-1)
	     result+=direction[index].toString()+"}";
	     return result;
	   }
	   
	   public static DirectionList allDirections(){
	       return new DirectionList();
	   }
	  
	}

