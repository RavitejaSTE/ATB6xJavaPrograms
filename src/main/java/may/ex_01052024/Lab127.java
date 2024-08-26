package may.ex_01052024;

public class Lab127 {
    public static void main(String[] args) {
        // ==  -> Ref
        // .equals() -> Values/ Content

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        System.out.println(arr1==arr3);

        System.out.println(arr1.equals(arr2)); //Objects.Java - ref.


        String s1 = "Pramod";
        String s2 = "Pramod";
        System.out.println(s1.equals(s2)); // Content - Strings.java - content

        String s3 = new String("Ravi");
        String s4 = new String("Ravi");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3==s4); //false
        System.out.println(s3.equals(s4)); //true

        Lab127 l1 = new Lab127();
        System.out.println(l1); // object address

    }
}
