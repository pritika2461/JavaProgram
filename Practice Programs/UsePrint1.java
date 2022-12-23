interface Drawable
{
    void draw();
}

interface Showable
{
    void draw();
}

class Print implements Drawable,Showable
{
         public void draw()
         {
                System.out.println("Drawable.....");
         }

}

class UsePrint1
{
    public static void main(String[] args)
     {
         Print p = new Print();
	     p.draw();
	  
     }
}  