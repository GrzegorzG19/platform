public class Math {

    double totalprice1(Course c1, Course c2, Course c3){
        double totalprice = c1.price + c2.price + c3.price;
        System.out.printf("total price is: %.2f \n", totalprice);
        return totalprice;
    }

    void totaltime(double time1, double time2, double time3){

       double totaltime1 = (time1 + time2 + time3)/60;

       double timehour = (time1 + time2 + time3)%60;
      // totaltime1 -=timehour;

        System.out.printf("total time is: %f hours %.0f minutes", totaltime1, (timehour * 100));
    }
}
