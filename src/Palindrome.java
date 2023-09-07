 class Palindrome extends Activity2 {

        @Override
        public void AbstractMethod() {
           System.out.println("Enter String: ");
        //    Scanner scan = new Scanner(System.in);
           String str = scan.nextLine();
           char [] ch = str.toCharArray();
           int num = 0;
    
           for (int i = 0; i < ch.length/2; i++) {
            if(ch[i] !=ch[ch.length-1-i]) {
                num = 1; 
                break;
            }
           }
    
            if(num ==0) {
            System.out.println(str + "is Palindrome");
           } else System.out.println(str + "is not Palindrome");
        }
    }