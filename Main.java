//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is my java project
        /*
        welcome to the clubb!!!
         */
        System.out.println("Hello and welcome buddy to the Journey of Java!");
        System.out.println("Hello Dear happy to see you ");
        System.out.println("here is something new ");

        int age=25;
        int year=1999;
        int budget=22000;
        System.out.println("the age of the person is:"+ age);
        System.out.println("the born year the person is:"+ year);
        System.out.println("the budget of the person is:"+ budget);

        double age1=25.6;
        double year1=199.9;
        double budget1=10000.12;
        System.out.println("the age of the person is:"+ age1);
        System.out.println("the born year the person is:"+ year1);
        System.out.println("the budget of the person is:"+ budget1);

        char age2='A';
        char year2='Z';
        char budget2='$';
        System.out.println("the age of the person is:"+ age2);
        System.out.println("the born year the person is:"+ year2);
        System.out.println("the budget of the person is:"+ budget2);

        boolean isEmployee=false;
        boolean isWorking=false;
        boolean isSalaried=true;
        if(isEmployee){
            System.out.println("the occupation is an employee :"+ isEmployee);
        } else if (isWorking) {

            System.out.println("does he has job:"+ isWorking);
        }else if(isSalaried){
            System.out.println("yes is a working man ");
        }
        else{
            System.out.println("the employee is getting paid:"+ isSalaried);
        }

        String name="Santosh!";
        String email="happy@gmail.com";
        String address="BTM 2nd Stage Banglore";
        System.out.println("The employee name is: " + name);
        System.out.println("The employee emailID  is: " + email);
        System.out.println( "The employee is located at: " + address);
// lets use each of variable for printing the details in one sout statements
        //output for below is Santosh 25 $ 10000.12 false
        System.out.println("the Name of the candidate: "+ name + " age is :" + age + " "+ "the Budget Symbol is: "+ budget2+ " "+ "The budget is:"+budget1 + " "+"is he working man:" + isWorking);
        System.out.println(" "+ name + " " + age + " "+ budget2+ " "+budget1 +" " + isWorking);




       /* for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
    }
}