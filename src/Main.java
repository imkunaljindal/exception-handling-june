public class Main {
    public static void main(String[] args) {

//        System.out.println("A");
//        int arr[] = {1,2,3,4};
//
//        try{
//            int a = 5/0;
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("B");
//        }
//        finally {
//            System.out.println("D");
//        }

//        try{
//           int age = 25;
//           if(age<18){
//               throw new UnderAgeException("Under age");
//           }
//            System.out.println("A");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        try{
            math(5,0);
        }
        catch (Exception e){
            System.out.println("Hey idiot! You again did a mistake");
        }
    }

    public static boolean checkAge(int age) {

        if(age<18){
            throw new UnderAgeException("You are under age");
        }
        return true;
    }

    public static int math(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{

        int c = a/b;
        return c;
    }
}