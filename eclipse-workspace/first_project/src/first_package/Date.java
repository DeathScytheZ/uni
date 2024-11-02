package first_package;


public class Date {
    private int day;
    private int month;
    private int year;


    Date(int day, int month, int year){
        if(isValidYear(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }else{
            System.out.println("Invalid Date!!!");
        }
    }

    private boolean isValidYear(int day, int month, int year){
        if(year < 1 || month < 1 || month > 12 || day < 1){
            return false;
        }
        
        int [] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year)){
            daysInMonths[1] = 29;
        }
        
        return day <= daysInMonths[month - 1]; 
    }

    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public String toString(){
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}