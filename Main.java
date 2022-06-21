public class Main {
    public static void main(String[] args) {
        for(int i=1;i<600;i++)
        {
            int power = 1;
            if(i>=10)
                power++;
            if(i>=100)
                power++;
            int ones = i%10;
            int tens = (i/10)%10;
            int hundreds = (i/100)%10;
            int ones_p = 1;
            int tens_p = 1;
            int hundreds_p = 1;
            for(int j=0;j<power;j++)
            {
                ones_p *= ones;
                tens_p *= tens;
                hundreds_p *= hundreds;
            }
            if(ones_p + tens_p + hundreds_p == i)
                System.out.println(i);
        }
    }
}