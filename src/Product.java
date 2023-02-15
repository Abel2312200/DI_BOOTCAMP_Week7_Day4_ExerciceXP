public class Product {
    public static void opeartors(double number1, double number2, double number3) {
        double currentMax = 0.0, currentMin =0.0, sum = 0.0, product = 0.0, average =0.0;

        // display max
        sum = number1 + number2 + number3;
        System.out.println("Sum : "+sum);

        // display product
        product = number1 * number2 * number3;
        System.out.println("Product : "+product);

        // display average
        average = sum / 3;
        System.out.println("Average: "+ average);
        // display max
        currentMax = Math.max(number1,number2);
        if(currentMax < number3)
            currentMax = number3;
        System.out.println("Largest : "+currentMax);

        // display min
        currentMin = Math.min(number1,number2);
        if(currentMin > number3)
            currentMin = number3;
        System.out.println("Smallest : "+currentMin);



    }

}
