
package bookshop2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import za.ac.tut.comicnovel.ComicNovel;


public class BookShop2 {
  
   public static boolean isFirstEdition(ArrayList<ComicNovel> book,String input)
   {
       boolean valid=false;
       
       for(int i=0; i<book.size();i++)
       {
           if(input.substring(2).equals("001") && book.get(i).equals(code))
           {
               valid=true;
           }
       }
       return valid;
   }
   
   public static String globalDetails(ArrayList<ComicNovel> book)
   {
       String message=" ";
       
      for(int i=0;i<book.size();i++)
      {
          message +=book.get(i).getTitle()+" => "+book.get(i).getCode()+"\n";
      }
               
       return message;
   }
   
    public static void main(String[] args) {
       
        String[] bookInfo = {"The Stupidest Angel#2#CM002",
								"Vile Bodies#8#EW008",
								"Cold Comfort Farm#1#SG001",
								"Lightning Rods#2#HDW002",
								"A Complicated Kindness#1#MT001",
								"Auntie Mame#9#PD009",
								"Catch-22#5#JH005",
								"The Color of Magic#1#TP001",
								"Lucky Jim#3#KA003"};
        
        ArrayList < ComicNovel> book= new ArrayList < ComicNovel>();
   
    
        for(int i=0; i<bookInfo.length;i++)
        {
            String[] novel=bookInfo[i].split("#");
            
            String nov=novel[0];
            int volume=Integer.parseInt(novel[1]);
            String code=novel[2];
            
           ComicNovel obj=new ComicNovel(nov,volume,code) ;
           
           book.add(obj);
        }
        
        String message=globalDetails(book);
        
        JOptionPane.showMessageDialog(null, "The list of comic novels with its search codes: \n====================================================\n"+message);
        
        
        String input=JOptionPane.showInputDialog("enter the requested comic book");
       
        boolean valid=isFirstEdition( book, input);
        
       
    }
    
}
