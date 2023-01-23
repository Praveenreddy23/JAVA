package CollectionFramework.Cloning;
/*
-->Protected Object Clone():
  ->method defined in object class.
  ->It is implemented to take a clone of the object on which the method is invoked.
  ->this method use SHALLOW COPY Cloning.
  ->We can take clone of object,if it is a type of "Cloneable".
 */

public class Mobile implements Cloneable{
    int imie;
    String os;
    int ramSize;

    public Mobile(int imie, String os, int ramSize) {
        this.imie = imie;
        this.os = os;
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Mobile[IMIE= "+imie+",OS= "+os+",RamSize= "+ramSize+"]";
    }

    @Override
    public Mobile clone() throws CloneNotSupportedException {
        return (Mobile) super.clone();
    }

}
class MobileDetails{
    public static void main(String[] args) {
        Mobile originalMobile = new Mobile(2345,"Android",8);
        Mobile cloneMobile = null;

        try{
            cloneMobile = originalMobile.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("clone cannot take a clone of the object");
        }

        System.out.println("hashcode number of originalMobile: "+ originalMobile.hashCode());
        assert cloneMobile != null;
        System.out.println("hashcode number of cloneMobile: "+ cloneMobile.hashCode());

        System.out.println("OriginalMobile properties:");
        System.out.println(originalMobile);

        System.out.println("ClonedMobile properties:");
        System.out.println(cloneMobile);
        //hashcode number of originalMobile: 81628611
        //hashcode number of cloneMobile: 1791741888
        //OriginalMobile properties:
        //Mobile[IMIE= 2345,OS= Android,RamSize= 8]
        //ClonedMobile properties:
        //Mobile[IMIE= 2345,OS= Android,RamSize= 8]
    }
}
