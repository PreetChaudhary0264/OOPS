public class StaInsNonSta {
        private static int value = 20;
        public static int s = 15;
        public static int temp = 10;
        public static class Nested
        {

            private void display()
            {
                System.out.println(temp + s + value);  //bina s ko static bnaye we cannot use s
            }
        }

        public static void main(String args[]) {
            StaInsNonSta.Nested inner = new StaInsNonSta.Nested();
            inner.display();
        }
}
