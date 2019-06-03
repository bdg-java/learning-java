package Classed;

public class Date {

    private int [] day = { 1, 31}; //stex petqa menak int lini
    //private int day;
    //{ 1, 31} petqa nra hamar vor stugenq ardyoq poxancvac tivy et range-i meja
    private int [] month = { 1, 12};
    private int  [] year = { 1900 , 9999};

    public Date ( int [] day, int [] month, int [] year){

      this.day = day;
      this.month =month;
      this.year = year;
    }

     public int [] getday (){
        return this.day;
     }

     public int [] getmonth (){
        return this.month;
     }

     public int [] getyear (){
        return this.year;
     }

     public void setday ( int [] day ){
        this.day = day;
     }

     public void setmonth ( int [] month ){

        this.month = month;

     }

     public void setyear ( int [] year ){

        this.year = year;

     }

     public void setDate ( int [] day, int [] month, int [] year){

     }
      public String  toString () {
          return "Date: " + this.day + " , " + this.month + " , " + this.year ;

      }

}
