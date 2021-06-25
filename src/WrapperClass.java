public class WrapperClass {

    public static void main(String[] args) {

        Byte b = new Byte("34");
        Byte b1 = new Byte((byte)23);

        System.out.println(Byte.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        Integer integer = new Integer(245);
        byte b2 = integer.byteValue();
        double d = integer.doubleValue();


        Integer integer1 = Integer.valueOf(45);
        Integer integer2 = Integer.valueOf("45");


        String price = new StringBuilder("$59.99").deleteCharAt(0).toString();
        double price1 = Double.parseDouble(price);

        System.out.println("The tax is: " + price1*0.06);


        String priceOfCar = "55000.0";
        int i1 = new Double(priceOfCar).intValue();
        System.out.println(i1);

        boolean bool = Boolean.parseBoolean("true");
        Boolean aFalse = Boolean.valueOf("false");
        System.out.println(bool);

        String.valueOf(true);
        String.valueOf(56);



    }
}
