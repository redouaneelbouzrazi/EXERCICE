package Conjugaison;

public class Conjugaison {
  private final String ter[]={"e","es","e","ons","ez","ent"};
  private static String [] list=new String[10];
  static int i=0;
   void Conjuger(String v) {
	  String T[]= {"je","tu","il","nous","vous","ils"};
	  String inf=v.substring(v.length()-4,v.length());
	  String ra=v.substring(0,v.length()-2);
	  if(inf.equals("eter")||inf.equals("eler"))
	  {
		  for(int i=0;i<T.length;i++) {
			  if(!(i==3||i==4)) //si tous le tableau sof nous et vous
			  {
				 String t=ra.substring(ra.length()-1,ra.length());
				 String d=ra.concat(""+t);//doubler le denier character;
				 System.out.print(T[i]+" "+d.concat(ter[i])+", "); 
			  }
			  else 
				  System.out.print(T[i]+" "+ra.concat(ter[i])+", ");  
		  }
	  }
	  else {
		  if(inf.equals("oyer")||inf.equals("uyer"))
		  {
			  for(int i=0;i<T.length;i++) {
				  if(i==3 || i==4) 
				  { 
					  System.out.print(T[i]+" "+ra.concat(ter[i])+", "); 
				  }
				  else {
			             String st;			 
						 st=ra.substring(0,ra.length()-1);   //suprimer le drenier character
						 st=st.concat(""+'i');
						 System.out.print(T[i]+" "+st.concat(ter[i])+", ");
					  }
		  
			  }}else 
		       for(int i=0;i<T.length;i++)
		    	           System.out.print(T[i]+" "+ra.concat(ter[i])+",");
	             
	  
	  }System.out.println("");
}
  public Conjugaison(String s) throws  Exception {
	  if(s==null ) {throw new  verbEreur();}
	  if(i==10)throw new tableaoPlaint();
	 if(s.equals("aller") || !s.substring(s.length()-2,s.length()).equals("er"))
	      throw new  verbEreur();
	 else
	   list[i]=s;i++;
  }
  public String toString() {
		String str="{";
		for(int i=0;i<9;i++) 
			if(list[i]!=null)
			{
				if(i!=9 && list[i+1]!=null)
			        str=str.concat(list[i]+" ,");
				else
					str=str.concat(list[i]);
			}
		
		str=str.concat("}");
		return str;	
  }
  public static void main(String [] arg) {
	  try {
	  Conjugaison c=new Conjugaison("monger");
	  
	  new Conjugaison("jeter");
	  new Conjugaison("appeler");
	  new Conjugaison("envouer");
	  new Conjugaison("appuyer");
	  System.out.println(c);
	  for(String s:list) {
		  if(s!=null) {
			  System.out.println("conjugaison de verbe "+s);
		     c.Conjuger(s);
		     System.out.println("");
		  }
	  }
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
		  
	  }
	  
  }
}