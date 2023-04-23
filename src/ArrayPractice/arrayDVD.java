package ArrayPractice;

public class arrayDVD {

    public static void main(String args[]){

        DVD[] dvdCollection=new DVD[15];

        DVD avengersDVD=new DVD("The Avengers", 2012, "Joss Whedon");

        dvdCollection[7]=avengersDVD;

        System.out.println(dvdCollection[7]); 
    }
}
