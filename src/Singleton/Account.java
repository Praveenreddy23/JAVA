package Singleton;
//Singleton Example 2:
public class Account {
    private static Account obj;
    private Account(){
        System.out.println("Object created");
    }
    public static void createObject(){
        if( obj == null){
            obj = new Account();
        }else{
            System.out.println("can't create Object");
        }
    }
}
