public class AutoBoxAutoUnbox {

    public static void main(String[] args) {

        String str = new String();

        Integer i = new Integer(5);
        Integer i2 = 44; //autoboxing

        int v = 88;
        Integer i3 = v;

       // int i = new Scanner(); you cannot assign object to primitive

        int i4 = new Integer(56); //autounboxing

        double d = 56;

        Double d2 = 77.0;

        Integer i9 = (byte)56 + 5; //type promotion



        Integer x = 3 + new Integer(5);





    }
}
