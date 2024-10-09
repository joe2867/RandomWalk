public class Random1{
    public static void main(String[] args){
        int num;
        int total = 0;
        int steps = 0;
        int greatest = 0;
        boolean fall;
        for(int i = 0; i < 50; i++){
            total = 0;
            steps = 0;
            fall = false;
            while(fall == false){
                if(total >= 7 || total <= -7){
                    System.out.println(steps + " steps");
                    if(steps > greatest){
                        greatest = steps;
                    }
                    fall = true;
                }else{
                    num = (int) (Math.random() * 2);
                steps += 1;
                if(num == 0){
                    total = total - 1;
                }else if(num == 1){
                    total = total + 1;
                }
                }
            }
        }
        System.out.println(greatest + " greatest was amount of steps");
    }
}