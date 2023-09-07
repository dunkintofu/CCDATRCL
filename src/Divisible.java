 class Divisible extends Activity2 {

        @Override
        public void AbstractMethod() {
           System.out.println("Enter Number: ");
           int i = scan.nextInt();
           if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
           
        }
    }