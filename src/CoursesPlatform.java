class CoursesPlatform {
    public static void main(String[] args) {
        Math total = new Math();

        Category cat1 = new Category("Pragramming", "best tutorials");

        Category cat3 = new Category("Self development", "Learn How to become the best version of Yourself Today");

        Course course1 = new Course("Java", 5400, cat1,199  );
        Course course2 = new Course("Android", 5400, cat1,199  );
        Course course3 = new Course("Fast Reading", 2200, cat3,139  );



        System.out.println("There are 3 courses in our database:");
        course1.show();
        course2.show();
        course3.show();


        System.out.println("Special offer! Buy 3 courses and save 10%");
        total.totalprice1(course1, course2, course3);

        //double totalPrice = course1.price + course2.price + course3.price;
       // double discountPrice = totalPrice * 0.9;
      //  System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)\n", discountPrice, totalPrice);

        total.totaltime(course1.length, course2.length, course3.length);
    }
}
