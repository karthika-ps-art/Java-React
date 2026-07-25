package FinancialForecasting;
import java.util.*;

class FinancialForecast
{
    // O(n) Time complexity
    public static double calculate(double current,double rate,int years)
    {
        if(years==0) 
            return current;
        double next= current*(1+rate);
        return calculate(next, rate, years-1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double curr=sc.nextDouble();
        double rate=sc.nextDouble();
        int yr=sc.nextInt();
        System.out.printf("Future Value: %.2f",calculate(curr, rate, yr));
    }
}