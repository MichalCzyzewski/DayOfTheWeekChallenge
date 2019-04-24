package pl.mczyzewski;

public class Main {

    public static void main(String[] args) {

        int day = 1;

        switch (day){
            case 0 :
                System.out.println("Monday");break;
            case 1:
                System.out.println("Tuesday");break;
                case 2 :
                System.out.println("Wednesday");break;
            case 3:
                System.out.println("Thursday");break;
                case 4 :
                System.out.println("Friday");break;
            case 5:
                System.out.println("Saturday");break;
                case 6 :
                System.out.println("Sunday");break;
            default:
                System.out.println("Invalid Day");break;
        }


        if(day==0)
        {
            System.out.println("if Monday");
        }else if (day == 1)
        {
            System.out.println("if Tuesday");
        }else if (day == 2)
        {
            System.out.println("if Wednesday");
        }else if (day == 3)
        {
            System.out.println("if Thursday");
        }else if (day == 4)
        {
            System.out.println("if Friday");
        }else if (day == 5)
        {
            System.out.println("if Saturday");
        }else if (day == 6)
        {
            System.out.println("if Sunday");
        }else if (day > 6)
        {
            System.out.println("if Invalid Day");
        }



    }
}
